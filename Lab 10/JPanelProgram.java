//********************************************************************
//  EmailGUI.java    
//
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

import javax.swing.*;

public class JPanelProgram
{
	//-----------------------------------------------------------------
	//  Creates and displays the GUI.
	//-----------------------------------------------------------------
	public static void main (String[] args)
	{
		JFrame frame = new JFrame ("Hash Table GUI");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new PanelProgramGUI());
		frame.pack();
		frame.setVisible(true);      
	}
}

//********************************************************************
//PanelProgramGUI.java       
//
//********************************************************************


class PanelProgramGUI extends JPanel
{
	public PanelFieldProgram keyPanel, valuePanel, keyPanel2, valuePanel2, keyPanel3, valuePanel3, keyPanel4, valuePanel4;
	public PanelFieldProgram messagePanel;
	private JLabel resultLabel;
	private JButton sendButton;

	//-----------------------------------------------------------------
	//  Constructor: Sets up the main GUI components.
	//-----------------------------------------------------------------
	public PanelProgramGUI()
	{
		//1st record
		keyPanel = new PanelFieldProgram("Key:", 30);
		valuePanel = new PanelFieldProgram("Value:", 30);

		//2st record
		keyPanel2 = new PanelFieldProgram("Key:", 30);
		valuePanel2 = new PanelFieldProgram("Value:", 30);

		//3st record
		keyPanel3 = new PanelFieldProgram("Key:", 30);
		valuePanel3 = new PanelFieldProgram("Value:", 30);

		//4st record
		keyPanel4 = new PanelFieldProgram("Key:", 30);
		valuePanel4 = new PanelFieldProgram("Value:", 30);


		messagePanel = new PanelFieldProgram("Search:", 30);
		resultLabel = new JLabel ("");

		sendButton = new JButton("Send");
		sendButton.addActionListener(new SendListener());

		add(keyPanel);
		add(valuePanel);

		add(keyPanel2);
		add(valuePanel2);

		add(keyPanel3);
		add(valuePanel3);

		add(keyPanel4);
		add(valuePanel4);

		add(messagePanel);
		add(sendButton);
		add(resultLabel);

		setPreferredSize (new Dimension(500, 450));
		setBackground (Color.yellow);

	}

	//*****************************************************************
	//  Represents an action listener for the send button.
	//*****************************************************************
	private class SendListener implements ActionListener
	{
		//--------------------------------------------------------------
		//  Prints the field information to standard output.
		//--------------------------------------------------------------
		public void actionPerformed (ActionEvent event)
		{

			System.out.println("The Hash Table has been created.");

			//Build the Hash Table from user
			HashMap hashMap = new HashMap(4);
			hashMap.put(keyPanel.getFieldText(), valuePanel.getFieldText());
			hashMap.put(keyPanel2.getFieldText(), valuePanel2.getFieldText());
			hashMap.put(keyPanel3.getFieldText(), valuePanel3.getFieldText());
			hashMap.put(keyPanel4.getFieldText(), valuePanel4.getFieldText());
			System.out.println(hashMap.toString());

			boolean isFound = hashMap.containsKey(messagePanel.getFieldText());
			if(isFound){
				resultLabel.setText("Record is found");;
			}
			else{
				resultLabel.setText("Record is not found");;
			}


			//boolean isFound = (hashMap.containsKey(myPanel.messagePanel));
			//System.exit(0);

		}
	}
}

class PanelFieldProgram extends JPanel
{
	private JLabel label;
	private JTextField field;

	//-----------------------------------------------------------------
	//  Constructor: Sets up the field and label combination.
	//-----------------------------------------------------------------
	public PanelFieldProgram(String labelText, int fieldLength)
	{
		label = new JLabel(labelText);
		field = new JTextField(fieldLength);

		add(label);
		add(field);

		setPreferredSize (new Dimension(500, 40));
		setBackground (Color.yellow);
	}

	//--------------------------------------------------------------
	//  Prints the field information to standard output.
	//--------------------------------------------------------------
	public String getFieldText()
	{
		return field.getText();
	}
}

