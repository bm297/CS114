import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class HashTableProgram {
	public static void main(String[] args) throws IOException{

		//Initializing a Hash Table
		HashMap hashMap = new HashMap(400);

		//Read data from file
		FileReader file = new FileReader("src/inventory.txt");
		BufferedReader data = new BufferedReader(file);

		//Build the Hash Table from the file
		String line;
		while((line= data.readLine()) != null){
			hashMap.put(line, line);
		} //end while

		//Search and delete by user input
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a key to delete the value. The key string is the same as the value");
		String userInput = scan.nextLine();

		//Check if the record in the Hash Table
		if(hashMap.containsKey(userInput)){
			hashMap.remove(userInput);
			System.out.println("The record has been removed");
		}
		else{
			System.out.println("The record cannot be found.");
		}

	}

}
