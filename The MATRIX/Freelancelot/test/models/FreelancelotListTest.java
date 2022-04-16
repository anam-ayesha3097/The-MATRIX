package models;

import org.junit.Test;
import service.FreelaancelotList;
import service.Freelancelot;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

/**
 * Freelancelot List Test Class
 * @author Raahul John
 */
public class freelancelotListTest {

    FreelaancelotList fl = new FreelaancelotList();
    Freelancelot flt = new Freelancelot("1324","1234",13254,"","","","","",464545L,"","",0,"");
    ArrayList<Freelancelot> prolist = new ArrayList<Freelancelot>();
    @Test
    public void getdatatest(){
        prolist.add(flt);
        fl.setProjectList(prolist);
        assertEquals(prolist,fl.getProjectList());

    }
    @Test
    public void getAvgReadabilitytest(){
        Integer avgReadability = 0;
        avgReadability = FleschReadabilityIndex.getAvgFleschIndex("php");
        assertSame(avgReadability,fl.getAvgReadability("php"));
    }

    @Test
    public void getAvgEducationalLeveltest(){
        String avgEducationalLevel = null;
        avgEducationalLevel = FleschReadabilityIndex.getAvgEducationLevel("php");
        assertEquals(avgEducationalLevel,fl.getAvgEducationalLevel("php"));
    }
}