package models;
import java.util.*;


public class WordStats {
    public LinkedHashMap<String, Integer> GlobalStats(FreelaancelotList listobjs) {
        Utilities ut = new Utilities();
        System.out.println("Global Objs " + listobjs.getProjectList());
        ArrayList<Freelancelot> freeobjs = listobjs.getProjectList();
        String description = "";
        for (Freelancelot i : freeobjs) {
            description += i.getProject_description();
        }
        return ut.wordFrequencyCounter(description);
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
