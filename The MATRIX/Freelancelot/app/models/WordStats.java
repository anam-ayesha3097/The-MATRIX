package models;
import static play.mvc.Results.ok;

import akka.actor.AbstractActor;
import akka.actor.Props;
import play.mvc.Result;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import service.*;

/**
 * Calculates Global and Individual Word Stats
 *
 * @author Sankeerth Koduri
 * @version 1.0
 */
public class WordStats {
    /**
     * Calculates Global Word Stats
     * @param listobjs Freelance Class Object
     * @return Global Statistics
     * @author Sankeerth Koduri
     */
    public static LinkedHashMap<String , Integer> GlobalStats(FreelaancelotList listobjs) {
        Utilities ut = new Utilities();
        ArrayList<Freelancelot> freeobjs = listobjs.getProjectList();
        String description = "";
        for (Freelancelot i : freeobjs) {
            description += i.getProject_description();
        }
        String finalDescription = description;
        LinkedHashMap<String , Integer> ResultMap = ut.wordFrequencyCounter(finalDescription);
        return ResultMap;
    }

    public static LinkedHashMap<String , Integer> IndividualStats(String description){
        Utilities ut = new Utilities();
        LinkedHashMap<String , Integer> ResultMap = ut.wordFrequencyCounter(description);
        System.out.println( "Ind stats entered");
        return ResultMap;
    }
}
