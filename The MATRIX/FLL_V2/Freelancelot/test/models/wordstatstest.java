package models;

import org.junit.Test;
import scala.xml.dtd.impl.WordExp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import static org.junit.Assert.assertNotNull;

public class wordstatstest{
    WordStats ws = new WordStats();
    @Test
    public void StatsTest() throws IOException {
        Freelancelot f = new Freelancelot(1,"",1,"","This is a test case to check the word stats","","","",1L,"");
        FreelaancelotList fl = new FreelaancelotList();
        ArrayList<Freelancelot> fa = new ArrayList<Freelancelot>();
        fa.add(f);
        fl.setProjectList(fa);
        assertNotNull(ws.GlobalStats(fl));
    }
}