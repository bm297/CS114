import java.io.*;
import java.util.Arrays;

public class MaxHeapProgram {
	public static void main(String[] args) throws IOException{

		//Read the file
		FileReader file = new FileReader("src/inventory.txt");
		BufferedReader data = new BufferedReader(file);

		//Build the array
		String[] array = new String[9];
		for(int i=0; i< array.length; i++){		
			MaxHeap heap = new MaxHeap(array, i, array.length);
			heap.insert(data.readLine());
			System.out.println(heap.display());
		}
		
		//Remove the root
		MaxHeap heap = new MaxHeap(array, 9, array.length);
		heap.removemax(); //remove the root
		System.out.println("\nAfter root removal " + heap.display());


	} //End main
}
