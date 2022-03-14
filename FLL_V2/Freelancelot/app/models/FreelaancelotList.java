package models;

import java.util.ArrayList;

public class FreelaancelotList {
    private ArrayList <Freelancelot> ProjectList = new ArrayList<Freelancelot>();

    public void setProjectList(ArrayList<Freelancelot> projectList) {
        ProjectList = projectList;
    }

    public ArrayList<Freelancelot> getProjectList() {
        return ProjectList;
    }
}
