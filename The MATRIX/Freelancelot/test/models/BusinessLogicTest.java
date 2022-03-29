package models;

import models.BusinessLogic;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class BusinessLogicTest extends Mockito{
    @Mock
    BusinessLogic b1;

    @Before
    public void setup(){
        b1 = new BusinessLogic();
    }
    @Test
    public void testBusniesslogic()
    {
        BusinessLogic b2 = b1;
        b2.API = "https://www.freelancer-sandbox.com/api/projects/0.1/projects/active?job_details=true&limit=250&preview_description=true&query=";
        b2.getData("PHP");
        assertNotNull(b2.getData("java framework"));
        b2.API = "hppts://www.freelancer-sandbox.com/api/projects/0.1/projects/active?job_details=true&limit=250&preview_description=true&query=";
        b2.getData("PHP");
    }
//    @Test
//    public void getdatatest(){
//     //   bl.getData("php");
//        assertSame(bl.projects_active,bl.getData("php"));
//
//
//    }
    @Test
    public void getskillsdatatest(){
        skills sl = new skills();
        assertSame(sl.skills_active,sl.getDataSkills("php"));
    }
}
