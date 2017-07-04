import java.io.*;
import java.util.Scanner;

public class StackTokenTest{
	public static <E> void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);
		String getInput;

		LStack<String> LinkedStack = new LStack<String>();


		File it = new File("Src/test.dat");
		BufferedReader br = null;

		if (it.exists()){
			try{
				br = new BufferedReader(new FileReader(it));
				String rc = null;
				while ((rc = br.readLine()) != null){
					LinkedStack.push(rc);
				}
			}
			catch (IOException e){
				System.err.format("IOException:, %s%n, x");
			}
			finally {
				try{
					if (br != null) {
						br.close();
					}
				}
				catch (IOException e){}
			}
		}
		System.out.println("Part 1A\n" + LinkedStack);
		System.out.println("The size of the Linked Stack: " + LinkedStack.length() + "\n");
		
		//Part 1B
		//Checking each record if it starts and ends with parentheses
		//Valid if match and invalid if it does not
		System.out.println("Part 1B");
		while (LinkedStack.length() > 0 ){
			if (LinkedStack.topValue().startsWith("(")  && LinkedStack.topValue().endsWith(")")) {
				System.out.println(LinkedStack.topValue() + ": Valid");
				LinkedStack.pop();
			}
			else{
				System.out.println(LinkedStack.topValue() + ": Invalid");
				LinkedStack.pop();
				
			}
		}//end for loop
		
		//Part 2
		File it1 = new File("Src/testALL.dat");
		BufferedReader br1 = null;

		if (it1.exists()){
			try{
				br1 = new BufferedReader(new FileReader(it1));
				String rc = null;
				while ((rc = br1.readLine()) != null){
					LinkedStack.push(rc);
				}
			}
			catch (IOException e){
				System.err.format("IOException:, %s%n, x");
			}
			finally {
				try{
					if (br1 != null) {
						br1.close();
					}
				}
				catch (IOException e){}
			}
		}//end if, creating the LStack
		
		
		//Part 2
		//Checking if the record starts and ends with parentheses/curly bracket/bracket
		////Valid if match and invalid if it does not
		System.out.println("\nPart 2");
		while (LinkedStack.length() > 0 ){
			if (LinkedStack.topValue().startsWith("(")  && LinkedStack.topValue().endsWith(")")) {
				System.out.println(LinkedStack.topValue() + ": Valid");
				LinkedStack.pop();
			}
			if (LinkedStack.topValue().startsWith("{")  && LinkedStack.topValue().endsWith("}")) {
				System.out.println(LinkedStack.topValue() + ": Valid");
				LinkedStack.pop();
			}
			if (LinkedStack.topValue().startsWith("[")  && LinkedStack.topValue().endsWith("]")) {
				System.out.println(LinkedStack.topValue() + ": Valid");
				LinkedStack.pop();
			}
			else{
				System.out.println(LinkedStack.topValue() + ": Invalid");
				LinkedStack.pop();
				
			}
		}//end for loop
		
	}
}