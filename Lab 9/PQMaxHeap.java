import java.util.PriorityQueue;
import java.util.Collections;
import java.io.*;

public class PQMaxHeap {
	public static void main(String[] args) throws IOException{
		
		//Read the file
		FileReader file = new FileReader("src/inventory.txt");
		BufferedReader data = new BufferedReader(file);
		
		//Instantiate a max heap Priority Queue  
		PriorityQueue pq = new PriorityQueue(Collections.reverseOrder());
		
		//Build the priority queue with data from file
		String line;
		while((line= data.readLine()) != null){
			pq.offer(line); //Insert values
			System.out.println(pq.toString());
		}
		
		//Display the max heap priority queue
		System.out.println(pq.toString());
		
		//Remove the root
		pq.remove(); //the head of PQ is the highest priority
		System.out.println("After root removal " + pq.toString());
	}
}
