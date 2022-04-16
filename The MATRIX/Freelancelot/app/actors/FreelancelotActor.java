package actors;

import akka.actor.*;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.Behaviors;
import models.SearchResults;
import scala.concurrent.duration.Duration;
import service.FreelaancelotList;
import service.Freelancelot;
import service.FreelancelotService;
import service.FreelancelotServiceImpl;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/**
 * Actor Class for Freelancelot API
 * @extends AbstractActor
 * @author Anam Ayesha Shaikh Sankeerth Koduri
 */
public class FreelancelotActor extends AbstractActorWithTimers {
    ActorRef senderActor;
    private FreelancelotService freelancelotService = FreelancelotServiceImpl.getInstance();

    /**
     * Creates the Freelancelot Actor
     * @author Anam Ayesha Shaikh Sankeerth Koduri
     */
    static public Props getProps() {
        return Props.create(FreelancelotActor.class, FreelancelotActor::new);
    }

    public FreelancelotActor() {
        this.senderActor = sender();
    }

    /**
     * Message Class to call the actor after 5secs interval
     * @author Anam Ayesha Shaikh Sankeerth Koduri
     */
    public static class Tick{

    }

    /**
     * Message Class to call Freelance API
     * @author Anam Ayesha Shaikh Sankeerth Koduri
     */
    public static class callFreelancelotAPI {
        private String searchTerm;

        public callFreelancelotAPI(String searchTerm) {
            this.searchTerm = searchTerm;
        }
    }

    /**
     * Pre-start Method for Tick Message
     * @author Anam Ayesha Shaikh Sankeerth Koduri
     */
    @Override
    public void preStart()
    {
        getTimers().startPeriodicTimer("Timer", new Tick(), Duration.create(5, TimeUnit.SECONDS));
    }

    /**
     * Receives the Message for the Freelanclot Actor
     * @author Anam Ayesha Shaikh Sankeerth Koduri
     */
    @Override
    public Receive createReceive() {

        System.out.println("Call API");
        return receiveBuilder().match(callFreelancelotAPI.class, this::callAPI).build();
    }

    /**
     * Calls the Freelancelot API Logic
     * @param object CallFreelancelotAPI object
     * @author Anam Ayesha Shaikh Sankeerth Koduri
     */
    public void callAPI(callFreelancelotAPI object) {

        System.out.println("Call API");
        ActorRef senderActor = sender();
       // ActorRef supervisorActor = context().actorOf(SupervisorActor.getProps(), "supervisingActor");
        SearchResults searchResults = null;
        try {
             searchResults = new SearchResults(object.searchTerm, fetchProjects(object.searchTerm));
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        senderActor.tell(searchResults.getProjects(), self());
    }

    /**
     * Queries the Freelancele API
     * @param keyword Project Search Term
     * @author Anam Ayesha Shaikh Sankeerth Koduri
     */
    private LinkedHashMap<String, FreelaancelotList> fetchProjects(String keyword) throws ExecutionException, InterruptedException {
        if (freelancelotService == null) {
            return null;
        } else {
            //System.out.println("Inside Fetch Projects Query API");
            return freelancelotService.queryApi(keyword);
        }
    }
}
