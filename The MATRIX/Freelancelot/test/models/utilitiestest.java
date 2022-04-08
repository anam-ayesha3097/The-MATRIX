package models;

import models.BusinessLogic;
import models.Utilities;
import org.junit.Test;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class utilitiestest {
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
}
