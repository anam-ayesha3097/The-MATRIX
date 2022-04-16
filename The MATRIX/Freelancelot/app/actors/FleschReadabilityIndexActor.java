package actors;

import akka.actor.AbstractLoggingActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import models.FleschReadabilityIndex;
import models.SearchResults;
import models.Utilities;
import service.FreelaancelotList;

import java.util.LinkedHashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
/**
 * Actor Class for FleschReadability Index
 * @extends AbstractActor
 * @author Anam Ayesha Shaikh
 */
public class FleschReadabilityIndexActor extends AbstractLoggingActor {
    ActorRef senderActor;
    Utilities ut = new Utilities();

    /**
     * Message Class callFleschReadability for getting the projects and appending the Flesch Readability
     * @author Anam Ayesha Shaikh
     */
    public static class callFleschReadability {
        LinkedHashMap<String, FreelaancelotList> responsePro = new LinkedHashMap<>();
        public callFleschReadability( LinkedHashMap<String, FreelaancelotList> responsePro) {
            this.responsePro = responsePro;
        }
    }

    /**
     * Creates the Flesch Readability Actor
     * @return Props props of the created Actor
     * @author Anam Ayesha Shaikh
     */
    static public Props getProps() {
        return Props.create(FleschReadabilityIndexActor.class, FleschReadabilityIndexActor::new);
    }

    public FleschReadabilityIndexActor() {
        this.senderActor = sender();
    }

    /**
     * Receives the message for the FleschReadabilityIndex Actor
     * @return Receive returns the Receive message output
     * @author Anam Ayesha Shaikh
     */
    @Override
    public Receive createReceive() {
        return receiveBuilder().match(callFleschReadability.class, this::getFleschReadability).build();
    }

    /**
     * Generates the FleschReadabilityIndex Data
     * @param object object of the message class callFleschReadability
     * @author Anam Ayesha Shaikh
     */
    public void getFleschReadability(callFleschReadability object) throws ExecutionException, InterruptedException {
        ActorRef senderActor = sender();
        //System.out.println("Inside get Flesch Readability GET Actor");
        CompletableFuture<LinkedHashMap<String, FreelaancelotList>> readability = FleschReadabilityIndex.getReadabilityAsync(object.responsePro);
        LinkedHashMap<String, FreelaancelotList> responseReadability = readability.get();
        LinkedHashMap<String, FreelaancelotList> responseProcessed = new LinkedHashMap<>();
        responseProcessed = ut.reverseOrder(responseReadability);
        //System.out.println("Before Flesch Readability");
        senderActor.tell(responseProcessed,self());
    }
}
