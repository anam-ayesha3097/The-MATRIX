package models;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class BusinessLogic {
    public static LinkedHashMap<String, FreelancelotList> projects_active= new LinkedHashMap<>();

    public static Freelancelot proj_det = null;
    static JSONObject result;
    static String jsonResult = null;

    public static CompletableFuture<LinkedHashMap<String, FreelancelotList>> getAPIDataAsync(String searchTerm ) {
        CompletableFuture<LinkedHashMap<String, FreelancelotList>> resultAPI = new CompletableFuture<>();
        return CompletableFuture.supplyAsync(() -> {
            try {
                return callAPI(searchTerm);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            return null;
        } );
    }


    public static LinkedHashMap<String, FreelancelotList> callAPI(String searchTerm) throws MalformedURLException {

        FreelancelotList projectList = new FreelancelotList();
        String searchURL = "\"";

        String [] searchSplit= searchTerm.split(" ");
        for(String sAppend: searchSplit)
            searchURL += sAppend+"%20";

        searchURL += "\"";
        System.out.println("String after process " +searchURL);

        try {
            URL url = new URL("https://www.freelancer.com/api/projects/0.1/projects/active?job_details=true&limit=10&preview_description=true&query="+ searchURL);
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


                JSONArray jsonArr = json.getJSONObject("result").getJSONArray("projects");
                Stream<JSONArray>  jsonArrayStream = Stream.generate(() -> jsonArr);
                System.out.println("*********JSON Array:************ " +jsonArr);

                System.out.println("\n\n ****** Project Details *****");

                ArrayList<Freelancelot> projects = new ArrayList<Freelancelot>();
                for(int i = 0; i < jsonArr.length(); i++){
                    Integer project_ID = jsonArr.getJSONObject(i).getInt("id");
                    String project_title = jsonArr.getJSONObject(i).getString("title");
                    String project_Description = jsonArr.getJSONObject(i).getString("preview_description");
                    Integer owner_ID = jsonArr.getJSONObject(i).getInt("owner_id");
                    Integer date = jsonArr.getJSONObject(i).getInt("time_submitted");
                    String project_type = jsonArr.getJSONObject(i).getString("type");
                    proj_det = new Freelancelot(owner_ID, date,project_ID, project_title, project_Description, project_type, "", "", 0L, "");
                    projects.add(proj_det);
                }
                projectList.setProjectList(projects);
                System.out.println(projectList);
                projects_active.put(searchTerm,projectList);
            }
            conn.disconnect();
        }  catch (IOException e) {
            e.printStackTrace();
        }
        return projects_active;
    }
}
