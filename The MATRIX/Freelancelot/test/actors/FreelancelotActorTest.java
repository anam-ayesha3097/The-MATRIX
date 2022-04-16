package actors;

import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.testkit.TestActorRef;
import akka.testkit.javadsl.TestKit;
import com.google.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;

import java.net.MalformedURLException;
import java.util.concurrent.ExecutionException;

public class FreelancelotActorTest {
    @ClassRule
    public static final TestKitJunitResource testKit = new TestKitJunitResource();
    @Inject
    private static ActorSystem system;
    private static TestKit testprobe;
    static  Object mockobj = new Object();


    @Before
    public void setup() {
        system = ActorSystem.create();
        testprobe = new TestKit(system);
    }

    @Test
    public void testIt() throws MalformedURLException, ExecutionException, InterruptedException {
        /*
         * Wrap the whole test procedure within a testkit constructor
         * if you want to receive actor replies or use Within(), etc.
         */
        new TestKit(system) {
            {
                final TestKit testprobe = new TestKit(system);
                Props props = Props.create(FreelancelotActor.class);
                Object results = new Object();
                TestActorRef<FreelancelotActor> ref = TestActorRef.create(system,props);
                ref.tell(results,testprobe.getRef());
            }
        };
    }
    @After
    public void destroyActorSystem(){
        system.terminate();
    }
}
