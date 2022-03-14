package models;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BusinessLogic {

    public static HashMap<String, FreelaancelotList> projects_active= new HashMap<String, FreelaancelotList>();
    public static Freelancelot proj_det = null;
    static JSONObject result;

    public static HashMap<String, FreelaancelotList> getData(String searchTerm ) {
        String [] s= searchTerm.split(" ");
        String string = "\"";
        for(int i =0;i<s.length;i++){
            string += s[i]+"%20";
        }
        string += "\"";
        FreelaancelotList projectList = new FreelaancelotList();
        System.out.println(searchTerm);
        try {
            URL url = new URL("https://www.freelancer.com/api/projects/0.1/projects/active?job_details=true&limit=10&preview_description=true&query="+ string);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            if (conn.getResponseCode() == 200) {
                Scanner sc = new Scanner(url.openStream());
                String temp = "";
                while (sc.hasNext()) {
                    temp = temp + sc.nextLine();
                }
                JSONObject json = new JSONObject(temp);
                result = json.getJSONObject("result");
                JSONArray jsonArr = json.getJSONObject("result").getJSONArray("projects");
                ArrayList<Freelancelot> projects = new ArrayList<Freelancelot>();
                for(int i = 0; i < jsonArr.length(); i++){
                    Integer project_ID = jsonArr.getJSONObject(i).getInt("id");
                    String project_title = jsonArr.getJSONObject(i).getString("title");
                    String project_Description = jsonArr.getJSONObject(i).getString("preview_description");
                    Integer owner_ID = jsonArr.getJSONObject(i).getInt("owner_id");
                    Integer date = jsonArr.getJSONObject(i).getInt("time_submitted");
                    String project_type = jsonArr.getJSONObject(i).getString("type");
                    String skills = jsonArr.getJSONObject(i).getString("seo_url");
                    String skillarr[] = skills.split("/");
                    skills = skillarr[0];
                    proj_det = new Freelancelot(owner_ID, date,project_ID, project_title, project_Description, project_type, skills, "", 1L);
                    projects.add(proj_det);
                }
                projectList.setProjectList(projects);
                projects_active.put(searchTerm,projectList);
            }
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return projects_active;
    }
}
