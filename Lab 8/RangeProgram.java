import java.util.Random;
import java.util.Scanner;

public class RangeProgram {
	public static void main(String[] args){
		BST tree = new BST();
		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		tree.insert(25, 25);
		tree.insert(5, 5);
		tree.insert(18, 18);
		tree.insert(76, 76);
		tree.insert(36, 36);
		tree.insert(37, 37);
		tree.insert(101, 101);
		tree.insert(2, 2);
		tree.insert(54, 54);
		tree.insert(29, 29);

		System.out.println("Tree records: " + tree.toString());

		System.out.println("Enter a low value to search the tree: ");	
		int lowValue = scan.nextInt(); // read low value input

		System.out.println("Enter a high value to search the tree: ");
		int highValue = scan.nextInt();

		if(lowValue >= highValue){
			System.out.println("You're values have been switched");
			tree.printRange(tree.getRoot(), lowValue, highValue);
		}
		else {
			tree.printRange(tree.getRoot(), highValue, lowValue);		
		}
	}
}
