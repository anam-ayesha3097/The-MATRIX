package models;

import org.junit.Test;
import service.FreelaancelotList;

import java.util.LinkedHashMap;

/**
 * Owner Information Test Class
 * @author Vikyath
 */
public class ownerInformationTest {
    OwnerInformation ot = new OwnerInformation();
    LinkedHashMap<String, FreelaancelotList> OwnerProjects_active= new LinkedHashMap<String, FreelaancelotList>();
    @Test
    public void getOwnerProjects_activetest(){
        ot.getOwnerProjects_active();
    }
    @Test
    public void getPrimaryCurrencytest(){
        ot.getPrimaryCurrency();
    }
    @Test
    public void getidtest(){
        ot.getId();

    }
    @Test
    public void getLimitedAccountTest(){
        ot.getLimitedAccount();

    }
    @Test
    public void getEmailVerifiedTest(){
        ot.getEmailVerified();

    }
    @Test
    public void getUsernametest(){
        ot.getUsername();
    }
    @Test
    public void getCompanytest(){
        ot.getCompany();
    }
    @Test
    public void getCountrytest(){
        ot.getCountry();
    }
    @Test
    public void getRegistrationDatetest(){
        ot.getRegistrationDate();
    }
    @Test
    public void getRoletest(){
        ot.getRole();
    }

    @Test
    public void setIdtest(){
        ot.setId("");
        ot.setUsername("");
        ot.setCompany("");
        ot.setCountry("");
        ot.setEmailVerified("asdasfasdf");
        ot.setRole("");
        ot.setPrimaryCurrency("");
        ot.setRegistrationDate("");
        ot.setLimitedAccount("");

    }
    @Test
    public void setOwnerProjects_activeTest() {
        ot.setOwnerProjects_active(OwnerProjects_active);
    }
}