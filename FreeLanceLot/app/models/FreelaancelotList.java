package models;

import scala.Int;

import java.util.ArrayList;

public class FreelaancelotList {
    private ArrayList <Freelancelot> ProjectList = new ArrayList<Freelancelot>();

    public void setProjectList(ArrayList<Freelancelot> projectList) {
        ProjectList = projectList;
    }

    public ArrayList<Freelancelot> getProjectList() {
        return ProjectList;
    }

    public Integer getAvgReadability(String searchTerm) {
        Integer avgReadability = 0;
        avgReadability = FleschReadabilityIndex.getAvgFleschIndex(searchTerm);
        return avgReadability;
    }

    public String getAvgEducationalLevel(String searchTerm) {
        String avgEducationalLevel = null;
        avgEducationalLevel = FleschReadabilityIndex.getAvgEducationLevel(searchTerm);
        return avgEducationalLevel;
    }
 }
