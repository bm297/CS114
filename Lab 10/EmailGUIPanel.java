//********************************************************************
//  EmailGUIPanel.java       
//
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EmailGUIPanel extends JPanel
{
   private EmailFieldPanel toPanel, ccPanel, bccPanel, subjectPanel;
   private EmailFieldPanel messagePanel;
   private JLabel resultLabel;
   private JButton sendButton;

   //-----------------------------------------------------------------
   //  Constructor: Sets up the main GUI components.
   //-----------------------------------------------------------------
   public EmailGUIPanel()
   {
      toPanel = new EmailFieldPanel("To:", 30);
      ccPanel = new EmailFieldPanel("CC:", 30);
      bccPanel = new EmailFieldPanel("BCC:", 30);
      subjectPanel = new EmailFieldPanel("Subject:", 30);
      messagePanel = new EmailFieldPanel("Message:", 30);
      resultLabel = new JLabel ("------");
      
      sendButton = new JButton("Send");
      sendButton.addActionListener(new SendListener());

      add(toPanel);
      add(ccPanel);
      add(bccPanel);
      add(subjectPanel);
      add(messagePanel);
      add(sendButton);
      add(resultLabel);

      setPreferredSize (new Dimension(500, 325));
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
         System.out.println("To: " + toPanel.getFieldText());
         System.out.println("CC: " + ccPanel.getFieldText());
         System.out.println("BCC: " + bccPanel.getFieldText());
         System.out.println("Subject: " + subjectPanel.getFieldText());
         System.out.println("Message: " + messagePanel.getFieldText());
         resultLabel.setText("Message printed");
      }
   }
}
