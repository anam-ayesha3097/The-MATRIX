package models;

import models.FreelaancelotList;
import models.Freelancelot;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FreelancelotListTest {

    FreelaancelotList fl = new FreelaancelotList();
    Freelancelot flt = new Freelancelot(1324,"1234",13254,"","","","","",464545L,"");
    ArrayList<Freelancelot> prolist = new ArrayList<Freelancelot>();
    @Test
    public void getdatatest(){
        prolist.add(flt);
        fl.setProjectList(prolist);
       assertEquals(prolist,fl.getProjectList());

    }
}
