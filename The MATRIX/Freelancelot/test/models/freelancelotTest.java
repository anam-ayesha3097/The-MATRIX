package models;

import org.junit.Test;
import service.Freelancelot;

/**
 * Freelancelot class Test Class
 * @author Raahul John
 */
public class freelancelotTest {
    Freelancelot ft = new Freelancelot();
    @Test
    public void getSkillstest(){
        ft.getSkills();
        ft.toString();

    }
    @Test
    public void getProject_IDtest(){
        ft.getProject_ID();
    }
    @Test
    public void getSeoUrltest(){
        ft.getSeoUrl();
    }
    @Test
    public void getAverageReadabilitytest(){
        ft.getAverageReadability();
    }
    @Test
    public void setDatetest(){
        ft.setDate("");
    }
    @Test
    public void setSkillstest(){
        ft.setSkills("");
    }
    @Test
    public void setStatstest(){
        ft.setStats("");
    }
    @Test
    public void setProject_descriptiontest(){
        ft.setProject_description("");
    }
    @Test
    public void displaytest(){
        ft.display();
    }
    @Test
    public void getAverageEducationalLevelTest() {ft.getAverageEducationalLevel();}
    @Test
    public void setOwner_idTest() {ft.setOwner_id("1");}
    @Test
    public void setReadabilityTest() {ft.setReadability(1L);}
    @Test
    public void setEducationalLevelTest() {ft.setEducationalLevel("school");}
    @Test
    public void setSeoUrlTest() {ft.setSeoUrl("https://freelance");}
    @Test
    public void setAverageReadabilityTest() {ft.setAverageReadability(90);}
    @Test
    public void setAverageEducationalLevel() {ft.setAverageEducationalLevel("school");}

}