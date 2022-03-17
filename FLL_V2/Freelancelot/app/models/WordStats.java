package models;
import java.util.*;
import static models.Utilities.wordFrequencyCounter;

public class WordStats {
    public static  LinkedHashMap<String, Integer> GlobalStats(FreelaancelotList listobjs)
    {
        System.out.println("Global Objs "+listobjs.getProjectList());
        ArrayList<Freelancelot> freeobjs = listobjs.getProjectList();
        String description = "";
        for(Freelancelot i:freeobjs)
        {
            description += i.getProject_description();
        }
        return wordFrequencyCounter(description);
    }

}
