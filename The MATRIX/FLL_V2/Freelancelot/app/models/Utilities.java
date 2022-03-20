package models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.util.stream.Collectors.toMap;

public class Utilities {
    // public long sortedfrequencyMap;

    public static String date_converter(Integer date) {
        String milsec = Integer.toString(date) + "000";
        long miliSec = Long.valueOf(milsec);
        DateFormat obj = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
        Date res = new Date(miliSec);
        return obj.format(res);
    }

    public LinkedHashMap<String, Integer> wordFrequencyCounter(String s) {
        String[] words = s.replaceAll("^[.,\\s]+", "").split("[.,\\s]+");

        Map<String, Integer> frequency = new HashMap<String, Integer>();
        for (String word : words) {
            Integer count = frequency.get(word);
            count = (count == null) ? 1 : ++count;
            frequency.put(word, count);
        }
        LinkedHashMap<String, Integer> sortedfrequency = new LinkedHashMap<String, Integer>();
        sortedfrequency = frequency
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        return sortedfrequency;
    }

    public LinkedHashMap<String, FreelaancelotList> first10projects(LinkedHashMap<String, FreelaancelotList> projlistmap) {
        LinkedHashMap<String, FreelaancelotList> projlistmap_10Projs = new LinkedHashMap<String, FreelaancelotList>();
        for (String i : projlistmap.keySet()) {
            FreelaancelotList value = projlistmap.get(i);
            ArrayList<Freelancelot> entireprojectList = value.getProjectList();
            ArrayList<Freelancelot> tempList = new ArrayList<>();

            int counter = 1;
            for (Freelancelot proj : entireprojectList) {
                if (counter <= 10) {
                    tempList.add(proj);
                } else {
                    break;
                }
                counter++;
            }

            FreelaancelotList frlistobj = new FreelaancelotList();
            frlistobj.setProjectList(tempList);
            projlistmap_10Projs.put(i, frlistobj);
        }
        return projlistmap_10Projs;
    }
}
