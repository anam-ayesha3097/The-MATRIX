package models;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class BusinessLogic {
    public  LinkedHashMap<String, FreelaancelotList> projects_active= new LinkedHashMap<String, FreelaancelotList>();
    public  LinkedHashMap<String, FreelaancelotList> skills_active= new LinkedHashMap<String, FreelaancelotList>();

    public  Freelancelot proj_det = null;
    public  String preview_description = "";
    JSONObject result;
    public  String API = "https://www.freelancer.com/api/projects/0.1/projects/active?job_details=true&limit=250&preview_description=true&query=";
    public  LinkedHashMap<String, FreelaancelotList> getData(String searchTerm ) {

        String [] s= searchTerm.split(" ");
        String string = "\"";
        for(int i =0;i<s.length;i++){
            string += s[i]+"%20";
        }
        string += "\"";
        FreelaancelotList projectList = new FreelaancelotList();
        try {
            URL url = new URL(API+ string);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            if (conn.getResponseCode() == 200) {
                Scanner sc = new Scanner(url.openStream());
                String temp = "";
                while (sc.hasNext()) {
                    temp = temp + sc.nextLine();
                }
                Utilities ut = new Utilities();
                JSONObject json = new JSONObject(temp);
                result = json.getJSONObject("result");
                JSONArray jsonArr = json.getJSONObject("result").getJSONArray("projects");

                ArrayList<Freelancelot> projects = new ArrayList<Freelancelot>();
                Map<String, Integer> frequencyMap = new HashMap<String, Integer>();
                for(int i = 0; i < jsonArr.length(); i++){
                    Integer project_ID = jsonArr.getJSONObject(i).getInt("id");
                    String project_title = jsonArr.getJSONObject(i).getString("title");
                    String project_Description = jsonArr.getJSONObject(i).getString("preview_description");
                    Integer owner_ID = jsonArr.getJSONObject(i).getInt("owner_id");
                    Integer date = jsonArr.getJSONObject(i).getInt("time_submitted");
                    String converted_date = ut.date_converter(date);
                    String project_type = jsonArr.getJSONObject(i).getString("type");
                    String seoUrl = jsonArr.getJSONObject(i).getString("seo_url");
                    String[] skillarr = seoUrl.split("/");
                    String skills = skillarr[0];
                    String seoUrl1 = skillarr[1];
                    preview_description += project_Description;
                    proj_det = new Freelancelot(owner_ID, converted_date,project_ID, project_title, project_Description, project_type, skills, "stats", 1L,seoUrl1);
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
    //for getting skills

//    public HashMap<String, FreelaancelotList> getDataSkills(String searchTerm ){
//        String [] s= searchTerm.split(" ");
//        String string = "\"";
//        for(int i =0;i<s.length;i++){
//            string += s[i]+"%20";
//        }
//        string += "\"";
//        FreelaancelotList projectList = new FreelaancelotList();
//        System.out.println(searchTerm);
//        try {
//            URL url = new URL("https://www.freelancer.com/api/projects/0.1/projects/active?job_details=true&limit=250&preview_description=true&query="+ string);
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("GET");
//            conn.connect();
//
//            if (conn.getResponseCode() == 200) {
//                Scanner sc = new Scanner(url.openStream());
//                String temp = "";
//                while (sc.hasNext()) {
//                    temp = temp + sc.nextLine();
//                }
//                JSONObject json = new JSONObject(temp);
//                JSONObject result = json.getJSONObject("result");
//                JSONArray jsonArr = json.getJSONObject("result").getJSONArray("projects");
//                ArrayList<Freelancelot> projects = new ArrayList<Freelancelot>();
//                for(int i = 0; i < jsonArr.length(); i++){
//                    Integer project_ID = jsonArr.getJSONObject(i).getInt("id");
//                    String project_title = jsonArr.getJSONObject(i).getString("title");
//
//                    String project_Description = jsonArr.getJSONObject(i).getString("preview_description");
//                    Integer owner_ID = jsonArr.getJSONObject(i).getInt("owner_id");
//                    Integer date = jsonArr.getJSONObject(i).getInt("time_submitted");
//                    Utilities ut = new Utilities();
//                    String converted_date = ut.date_converter(date);
//
//                    String project_type = jsonArr.getJSONObject(i).getString("type");
//                    String skills = jsonArr.getJSONObject(i).getString("seo_url");
//                    String skillarr[] = skills.split("/");
//                    skills = skillarr[0];
//                    Freelancelot proj_det = new Freelancelot(owner_ID, converted_date,project_ID, project_title, project_Description, project_type, skills, "", 1L,"");
//                    projects.add(proj_det);
//                }
//                projectList.setProjectList(projects);
//                 skills_active.put(searchTerm,projectList);
//            }
//            conn.disconnect();
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return skills_active;
//    }
}
