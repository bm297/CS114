import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class EmployerList
{
	private TreeSet<String> nameSet;

	/**
	 * Sets up the domain blocker by reading in the blocked domain names from
	 * a file and storing them in a TreeSet.
	 * @throws FileNotFoundException
	 */
	public EmployerList() throws FileNotFoundException
	{
		nameSet = new TreeSet<String>();

		File inputFile = new File("src/test.txt");
		Scanner scan = new Scanner(inputFile);

		while (scan.hasNextLine())
		{
			String[] tokens = scan.nextLine().split(","); //delimit the line by comma ","
			nameSet.add(tokens[0].toLowerCase()); //add to the first index(name) to the set
		}
	}

	/**
	 * Checks to see if the specified name is on the list.
	 */
	public boolean nameOnList(String name)
	{
		return nameSet.contains(name);
	}
}
