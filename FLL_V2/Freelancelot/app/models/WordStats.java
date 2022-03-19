package models;
import java.util.*;
import static models.Utilities.wordFrequencyCounter;

public class WordStats {
    public LinkedHashMap<String, Integer> GlobalStats(FreelaancelotList listobjs) {
        System.out.println("Global Objs " + listobjs.getProjectList());
        ArrayList<Freelancelot> freeobjs = listobjs.getProjectList();
        String description = "";
        for (Freelancelot i : freeobjs) {
            description += i.getProject_description();
        }
        return wordFrequencyCounter(description);
    }
//    public LinkedHashMap<String, Integer> GlobalStats1(HashMap<String, FreelaancelotList> projlistmap)
//    {
//        String description = "";
//        for (FreelaancelotList value: projlistmap.values()) {
//            ArrayList<Freelancelot> freeobjs = value.getProjectList();
//            for(Freelancelot i:freeobjs)
//            {
//                description += i.getProject_description();
//            }
//        }
//        return wordFrequencyCounter(description);
//    }
}
