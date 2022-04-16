package actors;

import akka.actor.AbstractActor;
import akka.actor.Props;
import models.WordStats;
import service.FreelaancelotList;
import models.WordStats.*;

import java.util.LinkedHashMap;

/**
 * Word Stats Actor Individual and Global Stats
 * @author Sankeerth Koduri
 */
public class wordStatsActor extends AbstractActor {
    public static Props getProps(){return Props.create(wordStatsActor.class);}

    /**
     * Creates Receive Methods of the Word Stats
     * @author Sankeerth Koduri
     */
    @Override
    public Receive createReceive() {

        return receiveBuilder()
                .match(FreelaancelotList.class , desc ->{
                    LinkedHashMap<String , Integer> statResult = WordStats.GlobalStats(desc);
                    System.out.println("StatsResult" + statResult );
                    sender().tell(statResult , self());
                })
                .match(String.class , desc1 -> {
                    LinkedHashMap<String, Integer> IndvstatResult = WordStats.IndividualStats(desc1);
                    System.out.println("StatsResult" + IndvstatResult);
                    sender().tell(IndvstatResult, self());
                })
                .build();
    }
}