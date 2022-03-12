package controllers;

import models.BusinessLogic;
import play.mvc.Controller;
import play.mvc.Result;
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
    public Result index() {
        return ok(views.html.index.render());
    }
    
    public Result explore() {
        return ok(views.html.explore.render());
    }
    
    public Result tutorial() {
        return ok(views.html.tutorial.render());
    }

    public Result sayHello(String name) {return ok("<h1>" + name + "</h1>").as("Text/html");}

    public Result freelance() {
        String result = BusinessLogic.getAPIData();
        return ok(views.html.freelancelot.render(result));}
}
