package controllers;

import models.Utilities;
import models.WordStats;
import org.junit.Test;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;
import service.FreelaancelotList;
import service.Freelancelot;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static play.mvc.Http.Status.OK;
import static play.mvc.Results.ok;
import static play.test.Helpers.GET;
import static play.test.Helpers.route;

/**
 * This is the Main controller Test contains an action to handle HTTP requests
 * to the application's home page.
 * @author Sankeerth Koduri Anam Ayesha Shaikh Raahul John Vikyath
 * @version 2.0
 */
public class HomeControllerTest extends WithApplication {

    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

    /**
     * Initialise Test Method of the Freelancelot Page
     * @author Sankeerth Koduri Anam Ayesha Shaikh Raahul John Vikyath
     * @version 2.0
     */
    @Test
    public void testLandingPage() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/freelancelot");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }

    @Test
    public void testSkillPage() throws IOException {
        Http.RequestBuilder req = new Http.RequestBuilder().method(GET).uri("/skills?s=java");
        Result res = route(app, req);
        assertEquals(OK, res.status());
    }

    /**
     * Main Test Freelancelot Method
     * @author Sankeerth Koduri Anam Ayesha Shaikh Raahul John Vikyath
     * @version 2.0
     */
    @Test
    public void testFreelance() throws ExecutionException, InterruptedException {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/freelancelot?searchTerm=java");

        Result result = route(app, request);
        assertEquals(OK, result.status());

    }

    /**
     * Calculates the Global Word Statistics Actor Test
     * @return Renders the Word Stats Page
     * @author Sankeerth Koduri
     */

    @Test
    public void testWordStats() throws ExecutionException, InterruptedException, IOException, TimeoutException {
        Result r1, r2;
        Utilities ut = new Utilities();
        WordStats ws = new WordStats();
        Freelancelot f = new Freelancelot("1", "", 1, "", "This is a test case to check the word stats", "", "", "", 1L, "", "", 0, "");
        FreelaancelotList fl = new FreelaancelotList();
        ArrayList<Freelancelot> fa = new ArrayList<Freelancelot>();
        fa.add(f);
        fl.setProjectList(fa);
        r1 = ok(views.html.wordstats.render(ws.GlobalStats(fl)));
        assertNotNull(r1);
    }

    /**
     * Calculates the Individual Word Statistics Actor Test
     * @return Renders the Word Stats Page
     * @author Sankeerth Koduri
     */
    @Test
    public void IndividualStats() throws ExecutionException, InterruptedException, IOException, TimeoutException{
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("http://localhost:9000/IndvWordStats/I'm%20creating%20a%20new%20WooCoomerce%20site%20on%20a%20new%20dedicated%20server%20with%20no%20other%20sites%20on%20it.%0AI%20find%20that");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }

    /**
     * Test for the Owner Details
     * @return Displays Owner Information
     * @author Vikyath
     */
    @Test
    public void testOwnerInformationPage() throws ExecutionException, InterruptedException, IOException, TimeoutException{
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/ownerInformation/4885740");

        Result result = route(app, request);
        assertEquals(OK, result.status());
    }
}
