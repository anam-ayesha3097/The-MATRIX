package models;

import org.json.JSONObject;
import org.junit.Test;
import service.FreelaancelotList;

import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Owner Details Test
 * @author Vikyath
 */
public class ownerDetailsTest {
    OwnerDetails ot = new OwnerDetails();
    @Test
    public void getOwnerProjectTest(){
        LinkedHashMap<String, FreelaancelotList> OwnerProjects_active= new LinkedHashMap<String, FreelaancelotList>();

        assertEquals(ot.OwnerProjects_active,ot.getOwnerProject("1"));
    }

    @Test
    public void checkNodeExistsTest(){
        JSONObject jObj = new JSONObject();
        assertEquals(false,ot.checkNodeExists(jObj,""));
    }
    @Test
    public void getOwnerDetailsTest(){
        OwnerInformation oi = new OwnerInformation();
        OwnerDetails ot2 = new OwnerDetails();
        assertNotNull(ot.getOwnerDetails("245117"));
    }

    @Test
    public void getOwnerInformationTest(){
        OwnerInformation oi = new OwnerInformation();
        oi.setId("1");
        oi.setUsername("");
        oi.setCompany("");
        oi.setCountry("");
        oi.setEmailVerified("asdasfasdf");
        oi.setRole("");
        oi.setPrimaryCurrency("");
        oi.setRegistrationDate("");
        oi.setLimitedAccount("");
        ot.getOwnerInformation("1");
    }
}