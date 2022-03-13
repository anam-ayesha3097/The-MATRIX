package controllers;

import models.BusinessLogic;
import models.Freelancelot;
import models.Search;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.MessagesApi;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.HashMap;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    HashMap<Integer, Freelancelot> projects_active;
    String searchInput;
    @Inject
    FormFactory formFactory;

    private MessagesApi messagesApi;

    @Inject
    public HomeController(MessagesApi messagesApi) {
        this.messagesApi = messagesApi;
    }
    public Result index() {
        return ok(views.html.index.render());
    }

    public Result tutorial() {
        return ok(views.html.tutorial.render());
    }

    public Result sayHello(String name) { return ok("<h1>" + name + "</h1>").as("Text/html"); }

    public Result freelance(Http.Request request) {
        projects_active = BusinessLogic.getAPIData();

        Form<Search> searchForm = formFactory.form(Search.class);

        return ok(views.html.freelancelot.render(searchForm, messagesApi.preferred(request)));
    }

    public Result explore(Http.Request request) {
        Form<Search> searchForm = formFactory.form(Search.class).bindFromRequest(request);
        if(searchForm.hasErrors()) {
            System.out.println("Input Field has some erros");
            return ok("Bad Request");
        }
        else {
            Search searchObj = searchForm.get();
            searchInput = searchObj.getSearchInput();

            return ok("The Search Parameter : " +searchObj.getSearchInput()).as("Text/html");

        }
    }
}

