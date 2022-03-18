package controllers;

import models.BusinessLogic;
import org.junit.Test;
import play.Application;
import play.i18n.MessagesApi;
import play.inject.guice.GuiceApplicationBuilder;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;

import javax.xml.ws.Response;
import java.util.List;

import static akka.http.javadsl.model.HttpRequest.GET;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static play.mvc.Http.Status.OK;
import static play.mvc.Results.ok;
import static play.test.Helpers.GET;
import static play.test.Helpers.route;

public class HomeControllerTest extends WithApplication {

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
        assertEquals(404, result.status());
    }
    MessagesApi messagesApi;
    BusinessLogic bl = new BusinessLogic();

    HomeController hc = new HomeController(messagesApi);
//    @Test
//    public void freelancetest(){
//        hc.freelancer("php");
//        assertEquals(ok(views.html.freelancer.render(bl.projects_active)),hc.freelancer("php"));
//    }

    @Test
    public void testSum() {
        int a = 1 + 1;
        assertEquals(2, a);
    }
    @Test
    public void testString() {
        String str = "Hello world";
        assertFalse(str.isEmpty());
    }
}


