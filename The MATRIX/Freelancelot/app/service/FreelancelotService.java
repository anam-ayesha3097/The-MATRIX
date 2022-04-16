package service;


import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;

/**
 * Freelancelot Service class interface
 * 
 * @author Sankeerth Koduri Anam Ayesha Shaikh
 *
 */
public interface FreelancelotService {

	public LinkedHashMap<String, FreelaancelotList> queryApi(String keyword) throws ExecutionException, InterruptedException;
}
