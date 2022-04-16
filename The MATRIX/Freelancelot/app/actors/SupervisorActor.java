package actors;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.SupervisorStrategy;
import akka.japi.pf.DeciderBuilder;


public class SupervisorActor extends AbstractActor {
    ActorRef child;
    public static Props getProps(){
        return Props.create(SupervisorActor.class,SupervisorActor::new);
    }

    public SupervisorActor(){
        this.child = context().actorOf(FreelancelotActor.getProps(),"supervisedActor");
    }

    public static class ActorException {
        String e;
        public ActorException(String e){
            this.e = e;
        }
    }
    @Override
    public Receive createReceive() {
            return receiveBuilder().match(FreelancelotActor.callFreelancelotAPI.class, any -> child.forward(any, getContext())).build();
    }
}
