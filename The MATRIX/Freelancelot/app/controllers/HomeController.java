package controllers;
import models.*;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CompletionStage;

/**
 * This is the Main controller contains an action to handle HTTP requests
 * to the application's home page.
 * @author Sankeerth Koduri Anam Ayesha Shaikh Raahul John Vikyath
 * @version 1.0
 */


public class HomeController extends Controller {
    LinkedHashMap<String, FreelaancelotList> response = new LinkedHashMap<>();
    int flagCount = 0;
    private LinkedHashMap<String, FreelaancelotList> cache;
    OwnerDetails ownerDetails = new OwnerDetails();
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */

    public HomeController(){
        System.out.println("Default Home Controller");
    }
    /**
     * Constructor Initializes the Cache
     * @param cache Canche Object
     * @author Sankeerth Koduri
     */
    @Inject
    public HomeController( LinkedHashMap<String, FreelaancelotList> cache) {
        this.cache = cache;
    }

    /**
     * Calls the Freelancelot API and displays the values in the views
     * @param searchTerm Job Searched
     * @return Renders Freelancelot Job Search Page with the Jobs output
     * @author Anam Ayesha Shaikh and Sankeerth Korduri
     */
    public CompletionStage<Result> freelancer(String searchTerm) throws ExecutionException, InterruptedException {
        LinkedHashMap<String, FreelaancelotList> projlistmap_10Projs = new LinkedHashMap<String, FreelaancelotList>();
        CompletionStage<LinkedHashMap<String, FreelaancelotList>> responseProcessed = CompletableFuture.supplyAsync(LinkedHashMap::new);
        int flag = 1;
        HomeController responseCache = null;
        BusinessLogic businessLogic = new BusinessLogic();
        Utilities ut = new Utilities();

        if(searchTerm.length() != 0 ) {
            flagCount += 1;
            if(flagCount <= 10 ){
                System.out.println("Flag Count "+flagCount);
                if (flag == 1) {
                    CompletableFuture<LinkedHashMap<String, FreelaancelotList>> futureAPIResult = businessLogic.getAPIDataAsync(searchTerm);
                    response = futureAPIResult.get();

                    responseCache = new HomeController(response);
                    flag += 1;

                }

                if (responseCache != null && responseCache.cache.containsKey(searchTerm)) {

                    projlistmap_10Projs = ut.first10projects(responseCache.cache);
                    CompletableFuture<LinkedHashMap<String, FreelaancelotList>> readability = FleschReadabilityIndex.getReadabilityAsync(projlistmap_10Projs);
                    LinkedHashMap<String, FreelaancelotList> responseReadability = readability.get();

                    responseProcessed = ut.reverseOrder(responseReadability);
                }

                else {
                    CompletableFuture<LinkedHashMap<String, FreelaancelotList>> futureAPIResult = businessLogic.getAPIDataAsync(searchTerm);
                    response = futureAPIResult.get();

                    responseCache = new HomeController(response);

                    projlistmap_10Projs = ut.first10projects(responseCache.cache);

                    CompletableFuture<LinkedHashMap<String, FreelaancelotList>> readability = FleschReadabilityIndex.getReadabilityAsync(projlistmap_10Projs);
                    LinkedHashMap<String, FreelaancelotList> responseReadability = readability.get();

                    responseProcessed = ut.reverseOrder(responseReadability);

                }

                return responseProcessed.thenApply((map) -> ok(views.html.freelancer.render(map)));
                //return ok(views.html.freelancer.render(responseProcessed));
            }
            else {
                CompletionStage<Result> response = CompletableFuture.supplyAsync(() -> ok("Maximum Search Hit Reached").as("Text/html"));
                return response;
            }
        }
        else {
            if(searchTerm.length() == 0)
            {
                response.clear();
                //sessionValue = request.session().removing("connected");
                //Cookie loginCookie = new Cookie("user",user);
            }
            CompletionStage<Result> response = CompletableFuture.supplyAsync(() -> ok(views.html.freelancerInit.render()));
            return  response;
            //newFreelancer(request);
            //return ok(views.html.freelance.render(null));
            //return ok(views.html.freelancerInit.render());
        }
    }

    /**
     * Calculates the Global Word Statistics
     * @param search Search Term Job Searched
     * @return Renders the Word Statistics Page
     * @author Sankeerth Koduri
     */

    public CompletionStage<Result> projectWordStats(String search)
    {
        WordStats ws = new WordStats();
        return ws.IndividualStats(search);
    }
    /**
     * Calculates the Individual Word Statistics
     * @param search Search Term Job Searched
     * @return Renders the Word Stats Page
     * @author Sankeerth Koduri
     */
    public CompletionStage<Result> wordStats(String search)
     {
         WordStats ws = new WordStats();
         return ws.GlobalStats(response.get(search));
    }

    /**
     * Displays the top 10 related skills of the job seacrhed
     * @param s String which takes the job searched term
     * @return Renders the skills HTML page
     * @author Raahul John
     */
    public Result skills(String s) {
        skills sl = new skills();
        LinkedHashMap<String, FreelaancelotList> data = sl.getDataSkills(s);
        return ok(views.html.skills.render(data));
    }

    /**
     * Generates the Response in Reverse Order
     * @param ownerId Owner ID
     * @return Displays Owner Information
     * @author Vikyath
     */
    public Result ownerInformation(String ownerId)
    {
        return ok(views.html.ownerDetails.render(ownerDetails.getOwnerDetails(ownerId)));
    }

}

