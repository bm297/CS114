import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmployerListChecker
{
	/**
	 * Repeatedly reads a name interactively from the user and checks to
	 * see if that name is on the list.
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		EmployerList checker = new EmployerList();
		Scanner scan = new Scanner(System.in);

		String name;

		do
		{
			System.out.print("Enter an employer name to check (DONE to quit): ");
			name = scan.nextLine();

			if (!name.equalsIgnoreCase("DONE"))
			{
				if (checker.nameOnList(name.toLowerCase())) //lower user input to match record
					System.out.println("The name is on the list.");
				else
					System.out.println("The name is NOT on the list.");
			}
		} while (!name.equalsIgnoreCase("DONE"));
	}
}
