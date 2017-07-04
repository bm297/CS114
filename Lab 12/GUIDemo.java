import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GUIDemo extends JFrame {

	public static void main(String[] args) throws IOException{
		frame();
	}

	public static void frame() throws IOException{

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

		//Apply the Merge Sort algorithm to the array
		MergeSort.Sort(array2);

		//Calculate the time the Merge Sort
		long merEstimatedTime = System.nanoTime() - insEstimatedTime;

		//Apply the Quick Sort algorithm to the array
		QuickSort.Sort(array3);

		//Calculate the time the Quick Sort
		long sorEstimatedTime = System.nanoTime() - merEstimatedTime;

		JFrame frame = new JFrame();
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setTitle("Sorting Algorithm Comparison");
		frame.setResizable(false);

		//Create JPanel
		JPanel panel = new JPanel();

		//Buttons
		JButton button1 = new JButton("Insertion Sort");
		JButton button2 = new JButton("Merge Sort");
		JButton button3 = new JButton("Quick Sort");

		//Buttons Size
		button1.setPreferredSize(new Dimension(150, 50));
		button2.setPreferredSize(new Dimension(150, 50));
		button3.setPreferredSize(new Dimension(150, 50));

		//Create TextArea
		JTextArea textArea = new JTextArea(20, 41);
		textArea.setText("");

		JScrollPane scrollBar1 = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		//Add frame to the panel
		frame.add(panel);

		//Add buttons to the panel
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);

		//Implement Listeners 
		class listenForButton implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if(e.getSource() == button1){
					textArea.append("\nThe Insertion Sort elapsed: " + insEstimatedTime + " Nanoseconds");
				}
			}
		}

		class listenForButton2 implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if(e.getSource() == button2){
					textArea.append("\nThe Merge Sort elapsed: " + merEstimatedTime + " Nanoseconds");
				}
			}
		}

		class listenForButton3 implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if(e.getSource() == button3){
					textArea.append("\nThe Quick Sort elapsed: " + sorEstimatedTime + " Nanoseconds");

				}
			}
		}

		listenForButton insortButton = new listenForButton();
		listenForButton2 mergeButton = new listenForButton2();
		listenForButton3 quickButton = new listenForButton3();


		button1.addActionListener(insortButton);
		button2.addActionListener(mergeButton);
		button3.addActionListener(quickButton);

		//Add JText to the panel
		panel.add(scrollBar1);

		frame.setVisible(true);

	}



}
