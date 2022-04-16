import actors.FleschReadabilityIndexActor;
import actors.ownerDetailsActor;
import actors.skillActor;
import actors.wordStatsActor;
import models.*;
import com.google.inject.AbstractModule;

import play.libs.akka.AkkaGuiceSupport;
/**
 * Binds all the Actors
 * @author Anam Ayesha Shaikh Sankeerth Koduri
 */
public class Module extends AbstractModule implements AkkaGuiceSupport {

    @Override
    protected final void configure() {
        bindActor(ownerDetailsActor.class,"ownerActor");
        //bindActor(Freelancer.class,"freelancerActor");
        bindActor(skillActor.class,"skillActor");
        bindActor(wordStatsActor.class, "statsActor");
        bindActor(FleschReadabilityIndexActor.class, "fleschActor");
    }

}