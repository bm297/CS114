import java.io.*;
import java.util.Random;

public class QueueProgram {
	public static void main(String[] args) throws IOException{

		Random generator = new Random();
		LQueue<String> queue = new LQueue<String>();
		LQueue<String> queue2 = new LQueue<String>();

		//1A: generating a random num in range [1,5]
		int num = generator.nextInt(5) + 1;
		System.out.println("Part: A\n" + "First seed: " + num);

		//1B:		
		Reader theFile = new FileReader("src/test.dat");
		BufferedReader bf = new BufferedReader(theFile);

		String string, temp;
		int i=0;
		System.out.println("\nPart B\n" + "Date from test file: ");
		
		while ((string = bf.readLine()) != null){
			System.out.println(string);
			i++;
			if( i == num){
				queue.enqueue(string);
				temp = queue.dequeue();
				queue2.enqueue(temp);
				num = generator.nextInt(5) + 1;
				i=0;
			}
			else{
				queue.enqueue(string);
			}
		}
		bf.close();		
		System.out.println("1st Queue: " + queue);
		System.out.println("2st Queue: " + queue2);

	}
}
