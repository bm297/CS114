import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class BSTProgram {
	public static void main(String[] args) throws IOException{

		BST binaryTree = new BST();		

		FileReader file = new FileReader("src/inventory.txt");
		BufferedReader data = new BufferedReader(file);

		String line = null;
		while((line=data.readLine()) != null){
			binaryTree.insert(line, line); //populate binary tree
		} //end while loop

		System.out.println("The initial size of the tree: " + binaryTree.size());		
		System.out.println("The initial root of the tree: " + binaryTree.getRoot().key());

		//Accepting input from user to perform binary tree search
		System.out.println("Enter a parts number to perform binary tree search: ");
		Scanner searchInput = new Scanner(System.in); // read the input
		String searchData = searchInput.nextLine(); //store the input

		boolean found = false;
		while(!found){
			if (binaryTree.find(searchData) !=null ){
				System.out.println("Record is found.");
				found = true;
			}
			else{
				System.out.println("Record cannot be found, try again!");
			}
		}

		//Accepting input from user to perform a binary tree deletion
		System.out.println("\nEnter a parts number to delete from the binary tree: ");
		Scanner deleteInput = new Scanner(System.in); //read the input
		String deleteData = deleteInput.nextLine();

		found = false;
		while(!found){
			if(binaryTree.find(deleteData) != null){
				binaryTree.remove(deleteData);
				System.out.println("Record is found and deleted");
				found = true;
			}
			else{
				System.out.println("Record Not found, try again!");
			}
		}

		//Accepting input from user to perform a binary tree insertion
		System.out.println("\nEnter a parts number to insert to the binary tree (Hint) only accepting letter and numbers (eg. CT16C1288B):  ");
		Scanner insertInput = new Scanner(System.in);
		String insertData = insertInput.nextLine();

		for (int i = 0; i<insertData.length(); i++){
			if( Character.isLetter(insertData.charAt(i)) || Character.isDigit(insertData.charAt(i))){
				binaryTree.insert(insertData, insertData);
			}
			else{
				System.out.println("Input is invalid");
			}
		}//end for loop
		System.out.println("The input " + insertData + " is added to the binary tree.");
		
		//Traversing the tree
		binaryTree.printInOrder(); //print the tree in Inorder manner
		binaryTree.printPostOrder(); //print the tree in Postorder manner
		binaryTree.printPreOrder(); //print the tree in Preorder manner
	}
}
