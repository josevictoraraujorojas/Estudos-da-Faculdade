package Java.Periodo3.POO.InterfaceGrafica.gui2;

import java.awt.*;
import javax.swing.JFrame; // provides basic window features
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // loads images

public class LabelFrame extends JFrame 
{
   private JLabel label1; // JLabel with just text
   private JLabel label2; // JLabel constructed with text and icon
   private JLabel label3; // JLabel with added text and icon

   // LabelFrame constructor adds JLabels to JFrame
   public LabelFrame()
   {
      super( "BUG" );
      setLayout( new FlowLayout() ); // set frame layout

      // JLabel constructor with a string argument
      Icon bug1 = new ImageIcon(getClass().getResource("BUG.png"));
      label1 = new JLabel( "CriCriCriCri" );
      label1.setToolTipText( "BUG1" );
      label1.setIcon(bug1);
      label1.setVerticalTextPosition(SwingConstants.TOP);
      label1.setHorizontalTextPosition(SwingConstants.CENTER);
      add( label1 ); // add label1 to JFrame

      // JLabel constructor with string, Icon and alignment arguments
      Icon bug2 = new ImageIcon( getClass().getResource( "BUG2.jpg" ) );
      label2 = new JLabel();
      label2.setIcon(bug2);
      label2.setText("ZZZzzzzZZZ");
      label2.setVerticalTextPosition(SwingConstants.TOP);
      label2.setHorizontalTextPosition(SwingConstants.CENTER);
      label2.setToolTipText( "BUG2" );
      add( label2 ); // add label2 to JFrame

      label3 = new JLabel(); // JLabel constructor no arguments
      Icon bug3 = new ImageIcon( getClass().getResource( "BUG3.png" ) );
      label3.setText( "BuzBuzBuz" );
      label3.setIcon( bug3 ); // add icon to JLabel
      label3.setHorizontalTextPosition( SwingConstants.CENTER );
      label3.setVerticalTextPosition( SwingConstants.TOP );
      label3.setToolTipText( "BUG3" );
      add( label3 ); // add label3 to JFrame
   } // end LabelFrame constructor
} // end class LabelFrame


/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
