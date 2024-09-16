package Java.Periodo3.POO.InterfaceGrafica.gui15_funcoes;// Fig. 14.45: PanelFrame.java
// Using a JPanel to help lay out components.
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


import javax.swing.JButton;

public class PanelFrame extends JFrame 
{
   private JPanel buttonJPanel; // panel to hold buttons
   private JButton[] buttons; // array of buttons

   // no-argument constructor
   public PanelFrame()
   {
      super( "Panel Demo" );
      buttons = new JButton[ 6 ]; // create buttons array
      buttonJPanel = new JPanel(); // set up panel
      buttonJPanel.setLayout( new GridLayout( 2, buttons.length,20,20 ) );

      // create and add buttons
      for ( int count = 0; count < buttons.length; count++ ) 
      {
         buttons[ count ] = new JButton( "Button " + ( count + 1 ) );
         buttonJPanel.add( buttons[ count ] ); // add button to panel
         buttons[count].addActionListener(new ButtonHandler());
      } // end for

      add( buttonJPanel, BorderLayout.CENTER ); // add panel to JFrame
      add(addPainelNorte(),BorderLayout.NORTH);
      add(addPainelOeste(),BorderLayout.WEST);
      
   } // end PanelFrame constructor
   
   private class ButtonHandler implements ActionListener 
   {
      // handle button event
      public void actionPerformed( ActionEvent event )
      {
         JOptionPane.showMessageDialog( null, String.format(
            "You pressed: %s", event.getActionCommand() ) );
      } // end method actionPerformed
   } // end private inner class ButtonHandler
   
   
    private JPanel addPainelNorte() {
   	 JPanel norte = new JPanel(); // set up panel
	 FlowLayout layout = new FlowLayout();
	 JLabel [] funcoes = new JLabel[3]; 
	 norte.setLayout( layout);
	 layout.setAlignment( FlowLayout.LEFT );
     layout.layoutContainer( norte );
     funcoes[0] = new JLabel("Arquivo");
     funcoes[1] = new JLabel("Editar");
     funcoes[2] = new JLabel("Ajuda");
     norte.add(funcoes[0]);
     norte.add(funcoes[1]);
     norte.add(funcoes[2]);
     return norte;
    }
    
    private JPanel addPainelOeste() {
      	JPanel oeste = new JPanel(); // set up panel
      	GridLayout layout = new GridLayout(4,1,10,10);
      	JTextField [] funcoes = new JTextField[4]; 
   	 
   	 oeste.setLayout( layout);
   	 //layout.setAlignment( FlowLayout.LEFT );
        layout.layoutContainer( oeste );
        funcoes[0] = new JTextField("Cadastrar");
        funcoes[1] = new JTextField("Listar");
        funcoes[2] = new JTextField("Excluir");
        funcoes[3] = new JTextField("Atualizar");
        
        funcoes[0].addActionListener(new Cadastrar());
        funcoes[1].addActionListener(new Listar());
        funcoes[2].addActionListener(new Excluir());
        funcoes[3].addActionListener(new Atualizar());

        oeste.add(funcoes[0]);
        oeste.add(funcoes[1]);
        oeste.add(funcoes[2]);
        oeste.add(funcoes[3]);
        return oeste;
       }
    
    private class Cadastrar implements ActionListener
    {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog( null, String.format(
	             "You pressed: %s", "Cadastrar" ) );
		
	}

	
    } // end private inner class ButtonHandler
    
    private class Excluir implements ActionListener
    {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			 JOptionPane.showMessageDialog( null, String.format(
		             "You pressed: %s", "Excluir" ) );
			
		}	
    } 
    
    
    private class Listar implements ActionListener
    {

		@Override
		public void actionPerformed(ActionEvent e) {
			 JOptionPane.showMessageDialog( null, String.format(
	             "You pressed: %s", "Listar" ) );
	}

    } // end private inner class ButtonHandler
    
    private class Atualizar implements ActionListener
    {

	@Override
	public void actionPerformed(ActionEvent e) {
		 JOptionPane.showMessageDialog( null, String.format(
        "You pressed: %s", "Atualizar" ) );
	}
    } 
    
} // end class PanelFrame


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
