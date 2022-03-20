package controllers;
import models.*;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

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

    public LinkedHashMap<String, FreelaancelotList> projlistmap = new LinkedHashMap<String, FreelaancelotList>();

    public Result index() {
        return ok(views.html.index.render());
    }

    public Result projectWordStats(String search)
    {
            Utilities ut = new Utilities();
            return ok(views.html.projectwordstats.render(ut.wordFrequencyCounter(search)));
    }
    //public Result wordStats()
    public Result wordStats(String search)
     {
         WordStats ws = new WordStats();
         return ok(views.html.wordstats.render(ws.GlobalStats(projlistmap.get(search))));
//         return ok(views.html.wordstats.render(ws.GlobalStats1(projlistmap)));
    }

    public Result freelancer(String search) {
        LinkedHashMap<String, FreelaancelotList> projlistmap_10Projs = new LinkedHashMap<String, FreelaancelotList>();

        if(search == ""){
            return ok(views.html.freelancer.render(null));
        }
        else{
            BusinessLogic Bl = new BusinessLogic();
            projlistmap = Bl.getData(search);
            Utilities ut = new Utilities();
            projlistmap_10Projs = ut.first10projects(projlistmap);
            }
            return ok(views.html.freelancer.render(projlistmap_10Projs));
        }
    public Result skills(String s) {
        skills sl = new skills();
        return ok(views.html.skills.render(sl.getDataSkills(s)));
    }
    }
