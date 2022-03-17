package controllers;
import models.*;
import play.mvc.Controller;
import play.mvc.Result;

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

    public HashMap<String, FreelaancelotList> projlist = new HashMap<String, FreelaancelotList>();
    public Result index() {
        return ok(views.html.index.render());
    }

    public Result projectWordStats(String search) //pass proj id from html to this func
    {
            System.out.println("Word Stats Proj List" +projlist);
            return ok(views.html.projectwordstats.render(Utilities.wordFrequencyCounter(search)));
    }

    public Result wordStats(String search)
     {
        return ok(views.html.wordstats.render(WordStats.GlobalStats(projlist.get(search))));
    }

    public Result freelancer(String search) {
        if(search == ""){
            return ok(views.html.freelancer.render(null));
        }
        else{
            projlist = BusinessLogic.getData(search);
            System.out.println("Project List" +projlist);
            return ok(views.html.freelancer.render(BusinessLogic.getData(search)));
        }
    }

    }

