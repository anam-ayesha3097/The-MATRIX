package models;

import org.junit.Test;
import service.FreelaancelotList;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static models.FleschReadabilityIndex.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

/**
 * FleschReadability Index Test Class
 * @author Anam Ayesha Shaikh
 */
public class fleschReadabilityIndexTest {
    FleschReadabilityIndex flt = new FleschReadabilityIndex();

    @Test
    public void getReadabilityAsyncTest() throws ExecutionException, InterruptedException {
        CompletableFuture<LinkedHashMap<String, FreelaancelotList>> readability = FleschReadabilityIndex.getReadabilityAsync(flt.projsWithReadability);

        assertEquals(readability.get(),FleschReadabilityIndex.getReadabilityAsync(flt.projsWithReadability).get());
    }
    @Test
    public void getPreviewDescriptionTest() {
        assertEquals(flt.projsWithReadability,FleschReadabilityIndex.getPreviewDescription(flt.projsWithReadability));
    }
    @Test
    public void processPrevDescTest() {
        long wordCount = 0;
        long sentenceCount = 0;
        long syllableCount = 0;
        long fleschIndex = 0;
        wordCount = wordCounter("");
        sentenceCount = sentenceCounter("");
        syllableCount = syllableCounter("");


        fleschIndex = calculateFleschIndex(wordCount,sentenceCount,syllableCount);
        assertEquals(fleschIndex,FleschReadabilityIndex.processPrevDesc(""));
    }
    @Test
    public void checkEndingsTest(){
        assertEquals("modul",FleschReadabilityIndex.checkEndings("modules"));
    }
    @Test
    public void checkSyllableTest(){
        assertSame(3,FleschReadabilityIndex.checkSyllable("expression"));
    }
    @Test
    public void countSyllableTest(){
        char[] ch = {'a','e','b','y'};
        assertSame(2,FleschReadabilityIndex.countSyllable(ch));

    }
    @Test
    public void calculateFleschIndexTest(){
        assertEquals(80L,FleschReadabilityIndex.calculateFleschIndex(17L,1L,22L));
    }
    @Test
    public void calculateEductionalLevelTest(){
        assertSame("7th Grade",FleschReadabilityIndex.calculateEductionalLevel(80L));
    }
    @Test
    public void averageFleschTest(){
        FleschReadabilityIndex.averageFlesch(80,"php");
    }
    @Test
    public void averageEducationalLevelTest(){
        FleschReadabilityIndex.averageEducationalLevel("7th Grade","php");
    }
    @Test
    public void getAvgFleschIndexTest(){
        Integer averageFIndex = 0;
        for(Iterator<Map.Entry<String, Integer>> iterator = averageFleschIndex.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry<String, Integer> entries = iterator.next();
            if(entries.getKey().contains("php")){
                averageFIndex = entries.getValue();
            }
        }
        assertEquals(averageFIndex,FleschReadabilityIndex.getAvgFleschIndex("php"));
    }
    @Test
    public void getAvgEducationLevelTest(){
        String avgEducationalLevel = null;
        for(Iterator<Map.Entry<String, String>> iterator = averageEducationalLevel.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry<String,String> entries = iterator.next();
            if(entries.getKey().contains("php")){
                avgEducationalLevel = entries.getValue();
            }
        }
        assertEquals(avgEducationalLevel,FleschReadabilityIndex.getAvgEducationLevel("php"));
    }

}

