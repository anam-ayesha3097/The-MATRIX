package controllers;

import models.*;
import org.junit.Test;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.CompletableFuture;

import static models.BusinessLogic.getData;
import static org.junit.Assert.*;
import static play.mvc.Http.Status.OK;
import static play.mvc.Results.ok;
import static play.test.Helpers.*;

public class HomeControllerTest extends WithApplication {
    HomeController hm = new HomeController();
    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

    @Test
    public void testIndex() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/");

        Result result = route(app, request);
        assertEquals(200, result.status());
    }
    @Test
    public void testFreelance() throws ExecutionException, InterruptedException {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/freelance?searchTerm=java");

        Result result = route(app, request);
        assertEquals(OK, result.status());
//        Result r1;
//        CompletionStage<Result> r2;
//        r1 = ok(views.html.freelancerInit.render());
//        r2 =hm.freelancer("");
//        assertNotNull(r1);
    }

    @Test
    public void testskills(){
        Result r1,r2;
        r1 = ok(views.html.skills.render(skills.getDataSkills("php")));
        r2 = hm.skills("php");
        assertEquals(contentAsString(r1),contentAsString(r2));
    }
    @Test
    public void testWordStatsIndividual() throws ExecutionException, InterruptedException, IOException, TimeoutException {
        CompletableFuture<Result> result = (CompletableFuture<Result>) new HomeController().projectWordStats("Create and Android application that can allow people to get bicycles on rent on an hourly basis. You");

        assertEquals(OK, result.get().status());
    }

    @Test
    public void testWordStats() throws ExecutionException, InterruptedException, IOException, TimeoutException {
        CompletionStage<Result> r1;
        WordStats ws = new WordStats();
        Freelancelot f = new Freelancelot("1","",1,"","This is a test case to check the word stats","","","",1L,"","",0,"");
        FreelaancelotList fl = new FreelaancelotList();
        ArrayList<Freelancelot> fa = new ArrayList<Freelancelot>();
        fa.add(f);
        fl.setProjectList(fa);
        r1 = ws.GlobalStats(fl);
        assertNotNull(r1);

    }


}