import java.io.*;
import java.util.Scanner;

public class LinkedListLab4{
	public static <E> void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);
		String getInput;

		LList<String> Dlist = new LList<String>();


		File it = new File("Src/test.dat");
		BufferedReader br = null;

		if (it.exists()){
			try{
				br = new BufferedReader(new FileReader(it));
				String rc = null;
				while ((rc = br.readLine()) != null){
					Dlist.append(rc);
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



		System.out.println(Dlist + "\nThe size of Dlist is " + Dlist.length());

		Dlist.moveToPos(4);
		System.out.println("The value of 5th record is " + Dlist.getValue());


		//Part B
		do{
			Dlist.moveToStart();
			System.out.print("Enter a number to be removed from the list or values 't' to terminate ");
			getInput = sc.nextLine();
			for (int i=0; i<Dlist.length(); i++){
				if(getInput.equals(Dlist.getValue())){
					System.out.println(Dlist.getValue() + " deleted");
					Dlist.remove();
					System.out.println("The size of Dlist is " + Dlist.length());
				}
				else{
					Dlist.next();
				}
			}

		}while(!getInput.equals("t") && Dlist.length() > 0 && Dlist != null);
		do{
			Dlist.moveToStart();
			System.out.println("Enter a number to be added to the list or t to end");
			getInput = sc.nextLine();
			for (int i=0; i<= Dlist.length(); i++){
				if(getInput.equals(Dlist.getValue()) && Dlist.length() != 0){
					System.out.println("number already on the list ");
					break;
				}
				else if (getInput.equalsIgnoreCase("t")){
					break;
				}
				else if (Dlist.length() == 0 || Dlist.currPos()==Dlist.length()){
					Dlist.moveToStart();
					Dlist.insert(getInput);
					System.out.println(Dlist + " \nThe size of Dlst is " + Dlist.length());
					break;
				}
				else{
					Dlist.next();
				}
			}//end of 2nd For
		}while(!getInput.equals("t") && Dlist.length() > 0 && Dlist != null);//end of main For
		System.out.println("BYE");
		
		
		//Part B: reverse LList
		

		System.out.println("The list in the reverse order: ");
		Dlist.reverse();		//invoke the reverse function
		System.out.println(Dlist + "\n printed in reverse order above");
	}
}