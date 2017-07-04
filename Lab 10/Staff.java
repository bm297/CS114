import java.util.HashMap;
//********************************************************************
//  Staff.java      
//
//  Represents the personnel staff of a particular business.
//********************************************************************
import java.util.Set;

public class Staff
{
   private HashMap<String, StaffEmployee> employeeMap;
   
	public Staff()
	{
		employeeMap = new HashMap<String, StaffEmployee>();
	}
	
	public void addEmployee(StaffEmployee employee)
	{
		employeeMap.put(employee.getEmployeeId(), employee);
	}
	
	public StaffEmployee getEmployee(String employeId)
	{
		return employeeMap.get(employeId);
	}
	
	public Set<String> getEmployeeIds()
	{
		return employeeMap.keySet();
	}
 }

