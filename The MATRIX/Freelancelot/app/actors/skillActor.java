package actors;

import akka.actor.AbstractActor;
import akka.actor.Props;
import models.skills;
import service.FreelaancelotList;

import java.util.LinkedHashMap;

import static models.skills.getDataSkills;

/**
 * Creates the Skill Actor
 * @author Raahul John
 */
public class skillActor extends AbstractActor{

    /**
     * Creates the skills actor
     * @return Props Props
     * @author Raahul John
     */
    public static Props getProps(){return Props.create(skillActor.class);}

    /**
     * Create and Receives Messages for the Skill Actor
     * @author Vikyath
     */
    @Override
    public AbstractActor.Receive createReceive() {

        return receiveBuilder()
                .match(String.class , desc1 -> {
                    LinkedHashMap<String, FreelaancelotList> skills = getDataSkills(desc1);
                    System.out.println("StatsResult" + skills);
                    sender().tell(skills, self());
                })
                .build();
    }
}
