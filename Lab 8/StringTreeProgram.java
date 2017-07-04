import java.util.Scanner;

public class StringTreeProgram {
	public static void main(String[] args){
		StringTree sTree = new StringTree();
		Scanner scan = new Scanner(System.in);

		boolean done = false;
		while(!done){
			System.out.println("Enter a string to add to the tree. (Enter done to exit)");
			String str = scan.nextLine();
			if(str.equalsIgnoreCase("done")){
				done = true;
			}else{
				sTree.addString(str);
			}
		}//end of while loop
		
		System.out.println("Printed by iterative method(Stack)");  sTree.traverseWithStack();;

	} //end of main
} //end of program
