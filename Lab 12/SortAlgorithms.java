import java.io.*;
import java.lang.reflect.Array;

public class SortAlgorithms {
	public static void main(String[] args) throws IOException{

		final int MAXSIZE = 1127;

		//Read the file
		FileReader file = new FileReader("src/inventory.txt");
		BufferedReader data = new BufferedReader(file);

		//Create the arrays
		String[] array = new String[MAXSIZE]; //Insertion Sort
		String[] array2 = new String[MAXSIZE]; //Merge Sort
		String[] array3 = new String[MAXSIZE]; //Quick Sort

		//Build the Insertion Sort array
		for (int i = 0; i<array.length; i++){
			array[i] = data.readLine();
		} //end for loop

		//Build the Merge Sort array
		array2 = array;

		//Build the Quick Sort array
		array3 = array;

		//Mark the start time
		long startTime = System.nanoTime();

		//Apply the Insertion Sort algorithm to the array
		InsertionSort.Sort(array, MAXSIZE);		

		//Calculate the time the Insertion Sort
		long insEstimatedTime = System.nanoTime() - startTime;
		System.out.println("The Insertion Sort elapsed: " + insEstimatedTime + " Nanoseconds");

		//Apply the Merge Sort algorithm to the array
		MergeSort.Sort(array2);

		//Calculate the time the Merge Sort
		long merEstimatedTime = System.nanoTime() - insEstimatedTime;
		System.out.println("The Merge Sort elapsed: " + merEstimatedTime + " Nanoseconds");

		//Apply the Quick Sort algorithm to the array
		QuickSort.Sort(array3);

		//Calculate the time the Quick Sort
		long sorEstimatedTime = System.nanoTime() - merEstimatedTime;
		System.out.println("The Quick Sort elapsed: " + sorEstimatedTime + " Nanoseconds");

	}

}
