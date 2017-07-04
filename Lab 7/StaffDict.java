import java.io.*;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class StaffDict{
	public static void main(String[] args) throws IOException{

		UALdictionary<String, StaffMember> dict = new UALdictionary<String, StaffMember>();


		//Reading the file
		FileReader file = new FileReader("src/test.txt");
		BufferedReader scan = new BufferedReader(file);

		Scanner getInput = new Scanner(System.in);


		//Processing the file		
		String line; //blank line

		while((line = scan.readLine()) != null){
			String[] tokens = line.split(","); //delimit by comma ","
			double rate = Double.parseDouble(tokens[4]); //Parse in rate as double		
			StaffMember staff = new StaffMember(tokens[0], tokens[1], tokens[2], tokens[3], rate); //assign tokens to the constructor
			dict.insert(tokens[3], staff); //insert objects in dictionary with string key
		} //end of while loop

		System.out.println("The keys of the dictionary are: \n" + dict.toString());

		while(!(dict.size() == 0)){
			System.out.println("\nEnter Social Security number to delete (Enter end to exit): ");
			String input = getInput.next();

			if(dict.find(input) != null){
				dict.remove(input); //Remove record
				System.out.println("Record deleted");
			}

			else{	
				if(input.equalsIgnoreCase("END")){ //To exit
					System.exit(0);
				}
				else{
					System.out.println("No record, try again");
				}
			}


		}
		scan.close();
		getInput.close();
		System.out.println(dict);
	}

}


/*
staff.name = tokens[0];
staff.address = tokens[1];
staff.phone = tokens[2];
staff.SocialSec = tokens[3];
 */

/*
double d = Double.parseDouble(tokens[4]);
staff.SetStaffMember(tokens[0], tokens[1], tokens[2], tokens[3],  d);
 */