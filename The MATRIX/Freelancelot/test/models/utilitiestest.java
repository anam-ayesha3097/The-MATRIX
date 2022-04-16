package models;

import org.junit.Test;
import service.FreelaancelotList;

import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;

/**
 * Utilities Test Class
 * @author Sankeerth Koduri
 */
public class utilitiesTest {
    Utilities ul = new Utilities();
    @Test
    public void dataconvertortest(){

        assertEquals("19 Mar 2022 13:57:38",ul.date_converter(1647712658));


    }
    @Test
    public void wordFrequencyCountertest(){
        LinkedHashMap<String, Integer> linkmap = new LinkedHashMap<String, Integer>();
        linkmap.put("world",1);
        linkmap.put("hello",1);

        assertEquals(linkmap,ul.wordFrequencyCounter("hello world"));

    }
    @Test
    public void first10projects(){
        LinkedHashMap<String, FreelaancelotList> projlistmap = new LinkedHashMap<>();
        assertEquals(ul.projlistmap_10Projsx,ul.first10projects(projlistmap));
    }
}