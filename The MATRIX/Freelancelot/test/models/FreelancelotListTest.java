package models;

import models.FreelaancelotList;
import models.Freelancelot;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FreelancelotListTest {

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
    public void gettersSettersTest(){
        flt.setOwner_id("9876");
        flt.setDate("9876");
        flt.setSkills("java");
        flt.setReadability(1L);
        flt.setStats("");
        flt.setEducationalLevel("highschool");
        flt.setSeoUrl("java/playframework");
        flt.getAverageEducationalLevel();
        flt.setEducationalLevel("highschool");
        flt.setAverageReadability(84);
        flt.setAverageEducationalLevel("");
        assertNotNull(flt);
    }
}
