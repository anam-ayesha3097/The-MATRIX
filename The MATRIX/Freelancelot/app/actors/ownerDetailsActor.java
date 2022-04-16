package actors;

import akka.actor.AbstractActor;
import akka.actor.Props;
import models.OwnerInformation;
import models.WordStats;
import service.FreelaancelotList;
import models.WordStats.*;

import java.util.LinkedHashMap;
/**
 * Actor for the Owner Details Logic
 * @author Vikyath
 */
public class ownerDetailsActor extends AbstractActor {
    /**
     * Creates the Owner Details Actor
     * @author Vikyath
     */
    public static Props getProps(){return Props.create(ownerDetailsActor.class);}

    /**
     * Message Passing Method of the Owner Details
     * @author Vikyath
     */
    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(String.class , profileID -> {
                    OwnerInformation OwnerDetails = models.OwnerDetails.getOwnerDetails(profileID);
                    System.out.println("OwnerDetails" + OwnerDetails);
                    sender().tell(OwnerDetails, self());
                })
                .build();
    }
}