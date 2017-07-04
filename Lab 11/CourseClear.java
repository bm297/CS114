import java.util.Iterator;

public class CourseClear {
	public static void main(String[] args) throws Exception
	{
		//Load all the records from the program
		ProgramOfStudy records = ProgramOfStudy.load("src/ProgramOfStudy");

		//Displaying all the records before deletion
		System.out.println(records);

		//Iterate over the records of the program
		System.out.println("Removing courses without grades.\n");

		//Initialize the iterator
		Iterator<Course> iterator = records.iterator();

		//Iterate through the list (courses) and remove courses with no grades
		while (iterator.hasNext())
		{
			Course course = iterator.next();
			if (!course.taken())
				iterator.remove();
		}

		//Displaying all the records after deletion
		System.out.println(records);
	}
}
