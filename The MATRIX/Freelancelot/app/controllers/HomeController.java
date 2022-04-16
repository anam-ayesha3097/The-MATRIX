package controllers;

import actors.*;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.stream.Materializer;
import akka.stream.javadsl.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import models.*;
import play.mvc.*;
import scala.compat.java8.FutureConverters;
import service.FreelaancelotList;
import views.html.free;
import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import static akka.pattern.Patterns.ask;


/**
 * This is the Main controller contains an action to handle HTTP requests
 * to the application's home page.
 * @author Sankeerth Koduri Anam Ayesha Shaikh Raahul John Vikyath
 * @version 2.0
 */

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    @Inject
    private ActorSystem actorSystem;
    @Inject
    private Materializer materializer;

    final ActorRef supervisorActor;
    LinkedHashMap<String, FreelaancelotList> response = new LinkedHashMap<>();
    LinkedHashMap<String, LinkedHashMap<String, FreelaancelotList>> cache;
    HashMap<String,String> sessionRecord = null;
    LinkedHashMap<String, FreelaancelotList> sessionResponse;
    int sessionKey = 0;
    LinkedHashMap<String, FreelaancelotList> sessionData;
    Utilities ut = new Utilities();
    LinkedHashMap<String, FreelaancelotList> firstTenProjects;
    LinkedHashMap<String, FreelaancelotList> firstTenProjectsFlesch;
    private ActorRef wordStatsActor;
    private ActorRef ownerProfile;
    private ActorRef skillsActor;
    private ActorRef fleschReadabilityActor;
    LinkedHashMap<String, FreelaancelotList> responsePro = new LinkedHashMap<>();

    /**
     * Home Controller Constructor
     * @author Sankeerth Koduri Anam Ayesha Shaikh Raahul John Vikyath
     * @param actorSystem Actor System materializer Materializer
     * @version 2.0
     */
    @Inject
    public HomeController(ActorSystem actorSystem, Materializer materializer){
    this.actorSystem = actorSystem;
    this.materializer = materializer;

        //System.out.println("Supervisor Actor created");
        supervisorActor = actorSystem.actorOf(SupervisorActor.getProps(), "supervisingActor");
        this.wordStatsActor = actorSystem.actorOf(actors.wordStatsActor.getProps());
        this.fleschReadabilityActor = actorSystem.actorOf(FleschReadabilityIndexActor.getProps());
        this.ownerProfile = actorSystem.actorOf(actors.ownerDetailsActor.getProps());
        this.skillsActor = actorSystem.actorOf(actors.skillActor.getProps());
        //this.freelancerActor = actorSystem.actorOf(Freelancer.getProps());

        cache = new LinkedHashMap<>();
        sessionRecord = new HashMap<>();
        sessionData = new LinkedHashMap<>();
        firstTenProjects = new LinkedHashMap<>();
        sessionKey++;

    }
    /**
     * Main Freelancelot Method
     * @author Sankeerth Koduri Anam Ayesha Shaikh Raahul John Vikyath
     * @param request Http Request and Search Term
     * @version 2.0
     */
    public  CompletionStage<Result> freelancelot(Http.Request request, String searchTerm, String sessionID) {
        if(searchTerm.isEmpty()) {
            CompletionStage<Result> response = CompletableFuture.supplyAsync(() -> ok(views.html.freelancerInit.render()));
            return  response;
        }
        else {
            sessionRecord.put(searchTerm,sessionID);
            return FutureConverters.toJava(ask(supervisorActor,
                   new FreelancelotActor.callFreelancelotAPI(searchTerm), 6000))
                    .thenApplyAsync(responseProjects -> {
                        //System.out.println("Response Projects "+responseProjects);
                        if(!((LinkedHashMap<String, FreelaancelotList>) responseProjects).isEmpty()){
                           cache.put(searchTerm, ((LinkedHashMap<String, FreelaancelotList>) responseProjects) );
                           responsePro = ((LinkedHashMap<String, FreelaancelotList>) responseProjects);
                            //System.out.println("Response Projects "+responseProjects);
                        }

                        firstTenProjects = ut.first10projects((LinkedHashMap<String, FreelaancelotList>) responseProjects);
                        try {
                            //System.out.println("Inside Freelance Logic");
                            firstTenProjectsFlesch = fleschReadability(firstTenProjects).get();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } catch (ExecutionException e) {
                            e.printStackTrace();
                        }
                        request.getCookie(searchTerm);
                        //System.out.println("Session Record "+sessionRecord);
                        sessionData.clear();
                        for(Iterator<Map.Entry<String, FreelaancelotList>> iterator = firstTenProjectsFlesch.entrySet().iterator(); iterator.hasNext(); ) {
                            Map.Entry<String, FreelaancelotList> entries = iterator.next();
                            //System.out.println("Session Record "+sessionRecord);
                            for(Iterator<Map.Entry<String, String>> iteratorSession = sessionRecord.entrySet().iterator(); iteratorSession.hasNext(); ) {
                                Map.Entry<String, String> entriesSession = iteratorSession.next();
                                //System.out.println("Entries Key "+entries.getKey());
                                //System.out.println("Entries Session Key "+entriesSession.getKey());
                                 if(entries.getKey().equalsIgnoreCase(entriesSession.getKey())){
                                     String session = entriesSession.getValue();
                                     if(session.equals(sessionID)) {
                                         //System.out.println("Current Session with the Key "+entriesSession.getKey());
                                         sessionData.put(entries.getKey(),entries.getValue());
                                         //System.out.println("Session Data "+sessionData);
                                     }
                                 }
                            }
                        }
                        return ok(free.render(request, searchTerm, sessionData, sessionID));
                    }).toCompletableFuture();
            //CompletionStage<Result> response = CompletableFuture.supplyAsync(() -> ok(views.html.freelancerInit.render()));
            //return  response;
        }

    }

    public Result sayHello(String name){
        return  ok("<h1> Hi "+name +"</h1>").as("text/html");
    }

    /**
     * WebSocket Method
     * @author Sankeerth Koduri Anam Ayesha Shaikh Raahul John
     * @param searchTerm Search Term to get the projects from teh API
     * @version 2.0
     */
    public WebSocket ws(String searchTerm) {
        System.out.println("Inside Web Socket");
        return WebSocket.Text.accept(request -> {
            // Log events to the console
            Sink<String, ?> freelanceRequest = Sink.foreach(System.out::println);
            ObjectMapper o = new ObjectMapper();
            Source<String, ?> wsFreelanceResponse = null;
            wsFreelanceResponse = Source.tick(Duration.ofSeconds(1), Duration.ofSeconds(1),
                                    FutureConverters.toJava(ask(supervisorActor,
                                    new FreelancelotActor.callFreelancelotAPI(searchTerm),
                                    6000))
                            .thenApplyAsync(responseProjects -> {
                                if(!((LinkedHashMap<String, FreelaancelotList>) responseProjects).isEmpty()){
                                    cache.put(searchTerm, ((LinkedHashMap<String, FreelaancelotList>)responseProjects));
                                }
                                System.out.println("Web Sockets Response Project "+responseProjects);

                                firstTenProjects = ut.first10projects((LinkedHashMap<String, FreelaancelotList>) responseProjects);
                                try {
                                    //System.out.println("Inside Freelance Logic");
                                    firstTenProjectsFlesch = fleschReadability(firstTenProjects).get();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                } catch (ExecutionException e) {
                                    e.printStackTrace();
                                }
                                return firstTenProjectsFlesch;
                            })
                            .thenApply(resString -> {try {return o.writeValueAsString(resString);}
                            catch (JsonProcessingException e) {e.printStackTrace();}
                                return "";
                            }).toCompletableFuture()).map(CompletableFuture::get);
            return Flow.fromSinkAndSource(freelanceRequest, wsFreelanceResponse);
        });
    }

    /**
     * Initialise Method of the Freelancelot Page
     * @author Sankeerth Koduri Anam Ayesha Shaikh Raahul John Vikyath
     * @version 2.0
     */
    public CompletionStage<Result> freelancelotInit() {
        CompletionStage<Result> response = CompletableFuture.supplyAsync(() -> ok(views.html.freelancerInit.render()));
        return  response;
    }

    /**
     * Generates the Response in Reverse Order Actor
     * @param ownerId Owner ID
     * @return Displays Owner Information
     * @author Vikyath
     */
    public CompletionStage<Result> ownerInformation(String ownerId)
    {
        return FutureConverters.toJava(ask(ownerProfile, ownerId, Integer.MAX_VALUE))
                .thenApply(response -> {
                    OwnerInformation resultmap = null;
                    try{
                        resultmap = (OwnerInformation) response;
                    }catch(Exception e){
                        return ok("Internal Server Error");
                    }
                    return ok(views.html.ownerDetails.render(resultmap));
                });
        //return ok(views.html.ownerDetails.render(ownerDetails.getOwnerDetails(ownerId)));
    }

    /**
     * Calculates the Individual Word Statistics Actor
     * @param search Search Term Job Searched
     * @return Renders the Word Stats Page
     * @author Sankeerth Koduri
     */
    public CompletionStage<Result> projectWordStats(String search)
    {
        return FutureConverters.toJava(ask(wordStatsActor, search, Integer.MAX_VALUE))
                .thenApply(response -> {
                    LinkedHashMap<String, Integer> indvresultmap = null;
                    try{
                        indvresultmap = (LinkedHashMap<String, Integer>) response;
                    }catch(Exception e){
                        return ok("Internal Server Error");
                    }
                    return ok(views.html.projectwordstats.render(indvresultmap));
                });
    }

    /**
     * Displays the top 10 related skills of the job seacrhed Actor
     * @param s String which takes the job searched term
     * @return Renders the skills HTML page
     * @author Raahul John
     */
    public CompletionStage<Result> skills(String s) {
        return FutureConverters.toJava(ask(skillsActor, s, Integer.MAX_VALUE))
                .thenApply(response -> {
                    LinkedHashMap<String, FreelaancelotList> resultmap = null;
                    try{
                        resultmap = (LinkedHashMap<String, FreelaancelotList>) response;
                    }catch(Exception e){
                        return ok("Internal Server Error");
                    }
                    return ok(views.html.skills.render(resultmap));
                });
    }

    /**
     * Displays the top Flesch Readability of the Projects both Global and Individual Actor
     * @param projects Projects from the API to add the Flesch Readability Value
     * @return CompletableFuture<LinkedHashMap<String,FreelaancelotList>> Returns the Completable Future of FreelaancelotList
     * @author Anam Ayesha Shaikh
     */
    public CompletableFuture<LinkedHashMap<String, FreelaancelotList>> fleschReadability(LinkedHashMap<String, FreelaancelotList> projects){
        //System.out.println("Inside Flesch Readability");
        return FutureConverters.toJava(ask(fleschReadabilityActor, new FleschReadabilityIndexActor.callFleschReadability(projects), Integer.MAX_VALUE))
                .thenApplyAsync(responsePro -> {
                    LinkedHashMap<String, FreelaancelotList> resultmap = null;
                    resultmap = ((LinkedHashMap<String, FreelaancelotList>)responsePro);
                    //System.out.println("Result Map");
                    return resultmap;
                   })
                .toCompletableFuture();
    }

    /**
     * Calculates the Global Word Statistics
     * @param search Search Term Job Searched
     * @return Renders the Word Statistics Page
     * @author Sankeerth Koduri
     */
    public CompletionStage<Result> wordStats(String search)
    {
        //System.out.println("Inside Global Word Stats");
        return FutureConverters.toJava(ask(wordStatsActor, responsePro.get(search), Integer.MAX_VALUE))
                .thenApply(response -> {
                    LinkedHashMap<String, Integer> resultmap = null;
                    try{
                        resultmap = (LinkedHashMap<String, Integer>) response;
                    }catch(Exception e){
                        return ok("Internal Server Error");
                    }
                    return ok(views.html.wordstats.render(resultmap));
                });
        //return ok(views.html.wordstats.render(ws.GlobalStats(response.get(search))));
    }
}
