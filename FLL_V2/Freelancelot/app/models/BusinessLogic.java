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

    public static HashMap<Integer, Freelancelot> projects_active= new HashMap<Integer, Freelancelot>();
    public static HashMap<String, FreelaancelotList> projects_passive= new HashMap<String, FreelaancelotList>();
    public static Freelancelot proj_det = null;
    public static ArrayList<Freelancelot> proj_det_list = new ArrayList<>();
    static JSONObject result;
    public static HashMap<Integer, Freelancelot> getAPIData( ) {
        System.out.println("Inside Business Logic");
        try {
            URL url = new URL("https://www.freelancer.com/api/projects/0.1/projects/active?job_details=true&limit=10&preview_description=true");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            if (conn.getResponseCode() == 200) {
                Scanner sc = new Scanner(url.openStream());
                String temp = "";
                while (sc.hasNext()) {
                    temp = temp + sc.nextLine();
                    System.out.println("********Temp**********" +temp);
                }
                JSONObject json = new JSONObject(temp);
                result = json.getJSONObject("result");

                System.out.println("*************RESULT**********" + result);

                JSONArray jsonArr = json.getJSONObject("result").getJSONArray("projects");
                System.out.println("*********JSON Array:************ " +jsonArr);

                System.out.println("\n\n ****** Project Details *****");

                for(int i = 0; i < jsonArr.length(); i++){
                    Integer project_ID = jsonArr.getJSONObject(i).getInt("id");
                    String project_title = jsonArr.getJSONObject(i).getString("title");
                    String project_Description = jsonArr.getJSONObject(i).getString("preview_description");
                    Integer owner_ID = jsonArr.getJSONObject(i).getInt("owner_id");
                    Integer date = jsonArr.getJSONObject(i).getInt("time_submitted");
                    String project_type = jsonArr.getJSONObject(i).getString("type");

                    System.out.println("pid : "+project_ID);
                    System.out.println("ptitle : "+project_title);
                    System.out.println("p_desc  : "+project_Description);
                    System.out.println("p_type : "+project_type);
                    System.out.println("owner_id  : "+owner_ID);
                    System.out.println("date : "+date);

                    proj_det = new Freelancelot(owner_ID, date,project_ID, project_title, project_Description, project_type, "", "", 1L);
                    projects_active.put(project_ID, proj_det);
                    proj_det_list.add(proj_det);
                }

                System.out.println("\n\n***Projects HashMap***");
                System.out.println(projects_active);
            }
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return projects_active;
    }

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
                    proj_det = new Freelancelot(owner_ID, date,project_ID, project_title, project_Description, project_type, "", "", 1L);
                    projects.add(proj_det);
                }
                projectList.setProjectList(projects);
                projects_passive.put(searchTerm,projectList);
            }
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return projects_passive;
    }
}
