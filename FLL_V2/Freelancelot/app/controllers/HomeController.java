package controllers;

import models.BusinessLogic;
import models.Freelancelot;
import play.data.FormFactory;
import play.i18n.MessagesApi;
import play.mvc.Controller;
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

    public Result freelancer(String search) {
        if(search == ""){
            return ok(views.html.freelancer.render(null));
        }
        else{
            return ok(views.html.freelancer.render(BusinessLogic.getData(search)));
        }
    }
    public Result skills(String s) {

        return ok(views.html.skills.render(BusinessLogic.getData(s)));
    }

    }

