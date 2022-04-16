package service;

/**
 * Freelanelot Structure for storing the JSON Structure
 * @author Raahul John Vikyath
 * @version 1.0
 */

public class Freelancelot {

    private String owner_id;
    private String date;
    private Integer project_ID;
    private String project_title;
    private String project_description;
    private String project_type;
    private String skills;
    private String stats;
    private Long readability;
    private String seoUrl;
    private String educationalLevel;
    private Integer averageReadability;
    private String averageEducationalLevel;
    /**
     * Default Constructor of Freelancelot
     * @author Raahul John Vikyath
     */
    public Freelancelot()
    {

    }

    /**
     * Constructor of Freelancelot to set the Freelancelot Data Structure
     * @author Raahul John Vikyath
     */

    public Freelancelot(String owner_id, String date, Integer project_ID, String project_title , String project_description, String project_type, String skills, String stats, Long readability, String educationalLevel , String seoUrl, Integer averageReadability, String averageEducationalLevel){
        this.owner_id = owner_id;
        this.date = date;
        this.project_title = project_title;
        this.project_ID = project_ID;
        this.project_description = project_description;
        this.project_type = project_type;
        this.skills = skills;
        this.stats = stats;
        this.readability = readability;
        this.educationalLevel = educationalLevel;
        this.seoUrl =seoUrl;
        this.averageEducationalLevel = averageEducationalLevel;
        this.averageReadability = averageReadability;
    }

    public String getOwner_id() {
        return this.owner_id;
    }

    public String getDate() {
        return this.date;
    }

    public String getProject_description() {
        return this.project_description;
    }

    public String getProject_type() {
        return this.project_type;
    }

    public String getSkills() {
        return this.skills;
    }

    public Long getReadability() {
        return this.readability;
    }

    public String getProject_title() {
        return this.project_title;
    }

    public Integer getProject_ID(){return this.project_ID;}

    public String getEducationalLevel() {
        return this.educationalLevel;
    }

    public String getSeoUrl() {
        return this.seoUrl;
    }

    public Integer getAverageReadability() {
        return this.averageReadability;
    }

    public String getAverageEducationalLevel() {
        return this.averageEducationalLevel;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setReadability(Long readability) {
        this.readability = readability;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }

    public void setProject_description(String project_description) {
        this.project_description = project_description;
    }

    public void setEducationalLevel(String educationalLevel) {
        this.educationalLevel = educationalLevel;
    }

    public void setSeoUrl(String seoUrl) {
        this.seoUrl = seoUrl;
    }

    public void setAverageEducationalLevel(String averageEducationalLevel) {
        this.averageEducationalLevel = averageEducationalLevel;
    }

    public void setAverageReadability(Integer averageReadability) {
        this.averageReadability = averageReadability;
    }

    public String toString()
    {
        return "[Owner ID:" +getOwner_id()+
                    "\nDate: " +getDate()+
                    "\nProject Description : " +getProject_description()+
                    "\nProject Type: " +getProject_type() + "]\n";
    }

    public void display() {
        System.out.println("Owner ID: " +getOwner_id()+ " Date: " +getDate()+ " Project Title : " +getProject_title()+ " Project Type: " +getProject_type() +" Flesch Index: " +getReadability() +" Educational Level: "+getEducationalLevel());
    }
}