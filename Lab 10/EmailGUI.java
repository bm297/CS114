//********************************************************************
//  EmailGUI.java    
//
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EmailGUI
{
   //-----------------------------------------------------------------
   //  Creates and displays the GUI.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Prototype Email GUI");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(new EmailGUIPanel());
      frame.pack();
      frame.setVisible(true);
   }
}