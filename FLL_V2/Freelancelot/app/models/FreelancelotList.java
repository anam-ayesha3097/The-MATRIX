package models;

import java.util.ArrayList;

public class FreelancelotList {

    private ArrayList<Freelancelot> projectList = new ArrayList<Freelancelot>();

    public void setProjectList(ArrayList<Freelancelot> projectList) {

        this.projectList = projectList;
        for(Freelancelot fl: this.projectList)
            fl.display();
    }

    public ArrayList<Freelancelot> getProjectList() {

        return projectList;
    }
}
