import java.util.HashMap;
import java.util.Set;

/**
 * Stores and manages a map of employee.
 * 
 */
public class Users
{
	private HashMap<String, User> employeeMap;
	
	/**
	 * Creates a user map to track Employees.
	 */
	public Users()
	{
		employeeMap = new HashMap<String, User>();
	}
	
	/**
	 * Adds a new user to the user map.
	 * 
	 * @param user the user to add
	 */
	public void addUser(User user)
	{
		employeeMap.put(user.getUserId(), user);
	}
	
	/**
	 * Retrieves and returns the specified user.
	 * 
	 * @param userId the user id of the target user
	 * @return the target user, or null if not found
	 */
	public User getUser(String userId)
	{
		return employeeMap.get(userId);
	}
	
	/**
	 * Returns a set of all user ids.
	 * 
	 * @return a set of all user ids in the map
	 */
	public Set<String> getUserIds()
	{
		return employeeMap.keySet();
	}
}
