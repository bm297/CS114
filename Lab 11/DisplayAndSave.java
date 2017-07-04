import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayAndSave extends JFrame{   

    public DisplayAndSave(){
        fileRead();
        panels();         
    }

    //Setting up the GUI
    private JList list;
    private String storeAllString="";
    private JButton saveCloseBtn = new JButton("Save Changes and Close");
    private JButton closeButton = new JButton("Exit Without Saving");
    private JFrame frame=new JFrame("Modifying file in JText");
    
   // private JTextArea textArea = new JTextArea(storeAllString,0,70);
    private JTextArea textArea = new JTextArea();

    //Return close button
    private JButton getCloseButton(){
        return closeButton;
     }     

    //Read the file method
    private void fileRead(){
        try{    
          FileReader read = new FileReader("src/njit_lab.txt");
          Scanner scan = new Scanner(read);
             while(scan.hasNextLine()){
              String temp=scan.nextLine()+"\n";
              storeAllString=storeAllString+temp;
             }
             textArea.setText(storeAllString);
      }
        catch (Exception exception)
         {
         exception.printStackTrace();
         }
    }      

    //Build the panels
    private void panels(){  

        //The main panel
         JPanel panel = new JPanel(new GridLayout(1,1));
         panel.setBorder(new EmptyBorder(5, 5, 5, 5));
         
         //The right panel
         JPanel rightPanel = new JPanel(new GridLayout(15,0,10,10));
         rightPanel.setBorder(new EmptyBorder(15, 5, 5, 10));
         
        // JTextArea textArea = new JTextArea(storeAllString,0,70);
          JScrollPane scrollBarForTextArea=new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
          panel.add(scrollBarForTextArea); 
          
         frame.add(panel);
         frame.getContentPane().add(rightPanel,BorderLayout.EAST);
         
        //Selection JList 
     	String[] fileNames = { "njit lab","file 2" };
     	list = new JList (fileNames);
         list.setSelectionMode (ListSelectionModel.SINGLE_SELECTION);
         JScrollPane scrollPanel = new JScrollPane(list);
         rightPanel.add (scrollPanel);
         scrollPanel.setBackground (Color.white);
         scrollPanel.setPreferredSize(new Dimension(200,400)  );
         
         rightPanel.add(saveCloseBtn);
         rightPanel.add(closeButton);
         closeButton.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e)
                    {
                        frame.dispose();

                    }
        });
          saveCloseBtn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                saveBtn();
                frame.dispose();

            }
        });
           frame.setSize(1000, 700);
           frame.setVisible(true);   
           frame.setLocationRelativeTo(null);

}
    //Update and save the file
    private void saveBtn(){
        File file = null;
        FileWriter out=null;


        try {
            file = new File("src/njit_lab.txt");
            out = new FileWriter(file);     
            out.write(textArea.getText());
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(this, "File is updated");
  }
    public static void main(String[] arg)
    {
        new DisplayAndSave();
    }
}