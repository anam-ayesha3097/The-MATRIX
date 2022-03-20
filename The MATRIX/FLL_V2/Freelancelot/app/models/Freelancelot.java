package models;

import java.util.HashMap;

public class Freelancelot {

    private Integer owner_id;
    private String date;
    private Integer project_ID;
    private String project_title;
    private String project_description;
    private String project_type;
    private String skills;
    private String stats;
    private Long readability;
    private String seoUrl;

    public Freelancelot(Integer owner_id, String date,Integer project_ID, String project_title ,String project_description, String project_type, String skills, String stats, Long readability,String seoUrl){
        this.owner_id = owner_id;
        this.date = date;
        this.project_title = project_title;
        this.project_ID = project_ID;
        this.project_description = project_description;
        this.project_type = project_type;
        this.skills = skills;
        this.stats = stats;
        this.readability = readability;
        this.seoUrl =seoUrl;
    }

    public java.lang.Integer getOwner_id() {
        return this.owner_id;
    }

    public java.lang.String getDate() {
        return this.date;
    }

    public java.lang.String getProject_description() {
        return this.project_description;
    }

    public java.lang.String getProject_type() {
        return this.project_type;
    }

    public java.lang.String getSkills() {
        return this.skills;
    }

    public java.lang.String getStats() {
        return this.stats;
    }

    public java.lang.Long getReadability() {
        return this.readability;
    }

    public java.lang.String getProject_title() {
        return this.project_title;
    }

    public java.lang.Integer getProject_ID(){return this.project_ID;}

    public void setOwner_id(java.lang.Integer owner_id) {
        this.owner_id = owner_id;
    }

    public void setDate(java.lang.String date) {
        this.date = date;
    }

    public void setProject_description(java.lang.String project_description) {
        this.project_description = project_description;
    }

    public void setProject_type(java.lang.String project_type) {
        this.project_type = project_type;
    }

    public void setSkills(java.lang.String skills) {
        this.skills = skills;
    }

    public void setReadability(java.lang.Long readability) {
        this.readability = readability;
    }

    public void setStats(java.lang.String stats) {
        this.stats = stats;
    }

    public void setProject_title(java.lang.String project_title) {
        this.project_title = project_title;
    }


    public String toString()
    {
        return "[Owner ID:" +getOwner_id()+
                    "\nDate: " +getDate()+
                    "\nProject Description : " +getProject_description()+
                    "\nProject Type: " +getProject_type() + "]\n";
    }
}