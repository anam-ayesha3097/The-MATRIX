package models;

import org.junit.Test;
import service.FreelaancelotList;

import java.util.LinkedHashMap;

/**
 * Search Result Test Class
 * @author Anam Ayesha Shaikh
 */
public class searchResultTest {
    LinkedHashMap<String, FreelaancelotList> projects;
    SearchResults ft = new SearchResults("",projects);
    @Test
    public void setKeywordTest(){
        ft.setKeyword("");
    }
    @Test
    public void getKeywordTest(){
        ft.getKeyword();
    }
    @Test
    public void getProjectTest(){
        ft.getProjects();
    }
    @Test
    public void setProjectsTest(){
        ft.setProjects(projects);
    }
}