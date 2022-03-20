package models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.util.stream.Collectors.toMap;

public class Utilities {
   // public long sortedfrequencyMap;

    public String date_converter(Integer date){
        String milsec = Integer.toString(date) + "000";
        long miliSec = Long.valueOf(milsec);
        DateFormat obj = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
        Date res = new Date(miliSec);
        return obj.format(res);
    }

    public LinkedHashMap<String, Integer> wordFrequencyCounter(String s){
        Map<String, Integer> wordCount = new HashMap<String, Integer>();
        String[] words = s.replaceAll("^[.,\\s]+", "").split("[.,\\s]+");

        Map<String, Integer> frequencyMap = new HashMap<String, Integer>();
        for (String word : words) {
            Integer count = frequencyMap.get(word);
            count = (count == null) ? 1 : ++count;
            frequencyMap.put(word, count);
        }

        LinkedHashMap<String, Integer> sortedfrequencyMap = new LinkedHashMap<String, Integer>();

        sortedfrequencyMap = frequencyMap
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
       // System.out.println(sortedfrequencyMap);
        return sortedfrequencyMap;
    }
}
