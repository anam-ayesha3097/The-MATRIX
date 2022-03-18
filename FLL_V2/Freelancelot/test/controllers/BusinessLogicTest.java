package controllers;

import models.BusinessLogic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;

public class BusinessLogicTest {
    BusinessLogic bl = new BusinessLogic();
    @Test
    public void getdatatest(){
     //   bl.getData("php");
        assertSame(bl.projects_active,bl.getData("php"));

    }
}
