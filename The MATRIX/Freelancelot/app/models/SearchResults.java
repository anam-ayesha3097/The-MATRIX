/**
 * 
 */
package models;

import service.FreelaancelotList;
import java.util.LinkedHashMap;


/**
 * Class to get the data of the API
 * @author Anam Ayesha Shaikh
 *
 */
public class SearchResults {
	private String keyword;
	private LinkedHashMap<String, FreelaancelotList> projects;

	public SearchResults(String keyword, LinkedHashMap<String, FreelaancelotList> projects) {
		this.keyword = keyword;
		this.projects = projects;
		//System.out.println("Inside Search Result Constructor");
	}
	
	
	/**Gets the Keyword i.e Search Term
	 * @return the keyword
	 */
	public String getKeyword() {
		return keyword;
	}
	/**
	 * @param keyword sets the search key
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	/**Gets the Projects
	 * @return the projects
	 */
	public LinkedHashMap<String, FreelaancelotList>  getProjects() {
		return projects;
	}
	/**
	 * @param projects sets the freelancelot keyword projects
	 */
	public void setProjects(LinkedHashMap<String, FreelaancelotList> projects) {
		this.projects = projects;
	}
}
