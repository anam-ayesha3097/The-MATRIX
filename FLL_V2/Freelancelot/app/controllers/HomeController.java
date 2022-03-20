package controllers;

import models.BusinessLogic;
import models.FleschReadabilityIndex;
import models.Freelancelot;
import models.FreelancelotList;
import play.data.FormFactory;
import play.i18n.MessagesApi;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

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

    HashMap<Integer, Freelancelot> projects_active;
    String searchInput;
    int flagCount = 0;
    @Inject
    FormFactory formFactory;

    private MessagesApi messagesApi;
    private LinkedHashMap<String, FreelancelotList> cache;
    LinkedHashMap<String, FreelancelotList> response = new LinkedHashMap<>();

    /*@Inject
    public HomeController(MessagesApi messagesApi) {
        this.messagesApi = messagesApi;
    }*/

    @Inject
    public HomeController( LinkedHashMap<String, FreelancelotList> cache) {
        this.cache = cache;
    }


    public Result index() {
        return ok(views.html.index.render());
    }

    public Result tutorial() {
        return ok(views.html.tutorial.render());
    }

    public Result sayHello(String name) { return ok("<h1>" + name + "</h1>").as("Text/html"); }

    public Result freelancer(Http.Request request, String searchTerm) throws ExecutionException, InterruptedException {
        int flag = 1;
        HomeController responseCache = null;
        LinkedHashMap<String, FreelancelotList> responseProcessed = new LinkedHashMap<>();
        //LinkedHashMap<String, FreelancelotList> response = new LinkedHashMap<>();
        Http.Session sessionValue = new Http.Session();
        Optional<String> sessionCheck = null;
        System.out.println("Search term "+searchTerm.length());

        if(searchTerm.length() != 0 ) {
            if(sessionCheck == null) {
                System.out.println("Inside Session check for first time");
                sessionValue =  request.session().adding("connected", "anams403@gmail.com");
                sessionCheck =  sessionValue.get("connected");
                System.out.println("Hello "+sessionCheck);
            }

            flagCount += 1;
        if(flagCount <= 10) {
            if (flag == 1) {
                CompletableFuture<LinkedHashMap<String, FreelancelotList>> futureAPIResult = BusinessLogic.getAPIDataAsync(searchTerm);
                response = futureAPIResult.get();

                responseCache = new HomeController(response);
                flag += 1;

            }


            if (responseCache != null && responseCache.cache.containsKey(searchTerm)) {

                CompletableFuture<LinkedHashMap<String, FreelancelotList>> readability = FleschReadabilityIndex.getReadabilityAsync(responseCache.cache);
                LinkedHashMap<String, FreelancelotList> responseReadability = readability.get();

                responseProcessed = reverseOrder(responseReadability);

            } else {
                CompletableFuture<LinkedHashMap<String, FreelancelotList>> futureAPIResult = BusinessLogic.getAPIDataAsync(searchTerm);
                response = futureAPIResult.get();

                responseCache = new HomeController(response);

                CompletableFuture<LinkedHashMap<String, FreelancelotList>> readability = FleschReadabilityIndex.getReadabilityAsync(responseCache.cache);
                LinkedHashMap<String, FreelancelotList> responseReadability = readability.get();

                responseProcessed = reverseOrder(responseReadability);

            }
            //CompletableFuture<LinkedHashMap<String, FreelancelotList>> futureAPIResult = BusinessLogic.getAPIDataAsync(searchTerm);
            //LinkedHashMap<String, FreelancelotList> response = futureAPIResult.get();

            //HomeController responseCache = new HomeController(response);


            //CompletableFuture<LinkedHashMap<String, FreelancelotList>> readability = FleschReadabilityIndex.getReadabilityAsync(response);
            //LinkedHashMap<String, FreelancelotList> responseReadability = readability.get();


            //LinkedHashMap<String, FreelancelotList> responseProcessed = new LinkedHashMap<>();
            //responseProcessed = reverseOrder(responseReadability);

            //redirect("/freelance").withNewSession();
            searchTerm = null;

            return ok(views.html.freelance.render(responseProcessed));
        }
        else
            return ok("Maximum Search Hit Reached").as("Text/html");
    }
        else {
            if(searchTerm.length() == 0)
            {
                response.clear();
                sessionValue = request.session().removing("connected");
                System.out.println("Bye!");
            }
                return ok(views.html.freelancerInit.render());
            //newFreelancer(request);
        //return ok(views.html.freelance.render(null));
        //return ok(views.html.freelancerInit.render());
    }


    }

    public static LinkedHashMap<String, FreelancelotList> reverseOrder(LinkedHashMap<String, FreelancelotList> responseReadability) {
        LinkedHashMap<String, FreelancelotList> response = new LinkedHashMap<>();
        List<String> allKeys = new ArrayList<String>(responseReadability.keySet());
        ArrayList<Freelancelot>  freelancelotArrayList= new ArrayList<Freelancelot>();
        Freelancelot freelancelotObj = null;
        Collections.reverse(allKeys);

        for(String keys: allKeys){
            System.out.println("Keys "+keys);
            freelancelotArrayList = responseReadability.get(keys).getProjectList();
            ArrayList<Freelancelot> listFreelancelot = new ArrayList<>();

            for(Freelancelot fl : freelancelotArrayList) {
                freelancelotObj = new Freelancelot(fl.getOwner_id(), fl.getDate(), fl.getProject_id(), fl.getProject_title(), fl.getProject_description(), fl.getProject_type(), "", "", fl.getReadability(), fl.getEducationalLevel());
                listFreelancelot.add(freelancelotObj);

            }

            FreelancelotList setListObjs = new FreelancelotList();
            setListObjs.setProjectList(listFreelancelot);
            response.put(keys, setListObjs);
        }
            return response;
    }

    public Result newFreelancer(Http.Request request){
        Http.Session sessionValue = new Http.Session();
        Optional<String> sessionCheck = null;
        System.out.println("Inside New Free Lancer");
        //sessionValue = request.session().adding("connected" , "sakeerthKoduri@gmail.com");
        //System.out.println("Session "+sessionValue);




        return ok(views.html.freelancerInit.render());
    }
}

