import java.util.HashMap;
import java.util.Scanner;

public class StaffManagement {
	public static void main(String[] args){

		Staff staff = new Staff();
		
		staff.addEmployee(new StaffEmployee("Sam", "123 Main Line","555-0469", "123-45-6789", 2423.07));
		staff.addEmployee(new StaffEmployee("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15));
		staff.addEmployee(new StaffEmployee("Woody", "789 Off Rocker","555-0000", "010-20-3040", 1169.23));
		staff.addEmployee(new StaffEmployee("Diane", "678 Fifth Ave.","555-0690", "958-47-3625", 1001.55));
		staff.addEmployee(new StaffEmployee("Norm", "987 Suds Blvd.","555-8374","456-78-9000", 1100.2));
		staff.addEmployee(new StaffEmployee("Cliff", "321 Duds Lane","555-7282","110-222-1111",2221.0));
		
		Scanner scan = new Scanner(System.in);
		String employeeSSN;
		StaffEmployee staffM;
		
		do
		{
			System.out.print("Enter employer Social Security Number (DONE to quit): ");
			employeeSSN = scan.nextLine();
			if (!employeeSSN.equalsIgnoreCase("DONE"))
			{
				staffM = staff.getEmployee(employeeSSN);
				if (staffM == null)
					System.out.println("User not found.");
				else
					System.out.println(staffM);
			}
		} while (!employeeSSN.equalsIgnoreCase("DONE"));

		// print all users
		System.out.println("\nAll Users:\n");
		for (String employeeID : staff.getEmployeeIds())
			System.out.println(staff.getEmployee(employeeID));
	}
}