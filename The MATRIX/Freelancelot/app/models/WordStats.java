package models;
import static play.mvc.Results.ok;
import play.mvc.Result;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * Calculates Global and Individual Word Stats
 *
 * @author Sankeerth Koduri
 * @version 1.0
 */
public class WordStats {

    /**
     * Calculates Global Word Stats
     * @param listobjs Freelance Class Object
     * @return Global Statistics
     * @author Sankeerth Koduri
     */
    public CompletionStage<Result> GlobalStats(FreelaancelotList listobjs) {
        Utilities ut = new Utilities();
        ArrayList<Freelancelot> freeobjs = listobjs.getProjectList();
        String description = "";
        for (Freelancelot i : freeobjs) {
            description += i.getProject_description();
        }
        String finalDescription = description;
        CompletionStage<Result> futureResultMap = CompletableFuture.supplyAsync(
                () -> ut.wordFrequencyCounter(finalDescription)
        ).thenApply((mapOfWordFrequencies) -> ok(
                views.html.wordstats.render(mapOfWordFrequencies)));
        return futureResultMap;
    }

    public CompletionStage<Result> InduvidualStats(String description){
        Utilities ut = new Utilities();
        CompletionStage<Result> futureResultMap = CompletableFuture.supplyAsync(
                () -> ut.wordFrequencyCounter(description)
        ).thenApply((mapOfWordFrequencies) -> ok(
                views.html.projectwordstats.render(mapOfWordFrequencies)));
        return futureResultMap;
    }
}
