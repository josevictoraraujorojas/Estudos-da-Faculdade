package Java.Periodo3.POO.InterfaceGrafica.gui3;// Fig. 14.9: TextFieldFrame.java
// Demonstrating the JTextField class.
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class TextFieldFrame extends JFrame 
{
   private JTextField textField1; // text field with set size
   private JTextField textField2; // text field constructed with text
   private JTextField textField3; // text field with text and size
   private JPasswordField passwordField; // password field with text

   private String login;

   private String telefone;

   private String senha;

   // TextFieldFrame constructor adds JTextFields to JFrame
   public TextFieldFrame()
   {
      super( "Testando JTextField e JPasswordField" );
      setLayout( new FlowLayout()); // set frame layout

      // construct textfield com 10 colunas
      textField1 = new JTextField("Login",10 );
      add( textField1 ); // add textField1 to JFrame

      // construct textfield tendo um texto default
      textField2 = new JTextField( "Telefone",10 );
      add( textField2 ); // add textField2 to JFrame

      // construct textfield tendo um texto default e com 21 colunas
      textField3 = new JTextField( "Nao consegue hihi", 10 );
      textField3.setEditable( false ); // disabilita edição
      add( textField3 ); // add textField3 to JFrame

      // construct passwordfield tendo um texto default
      passwordField = new JPasswordField( "xxxx",10 );
      add( passwordField ); // add passwordField to JFrame

      // registra os eventos handlers
      TextFieldHandler handler = new TextFieldHandler();
      textField1.addActionListener( handler );
      textField2.addActionListener( handler );
      textField3.addActionListener( handler );
      passwordField.addActionListener( handler );
   } // end TextFieldFrame constructor

   public String getLogin() {
      return login;
   }

   public void setLogin(String login) {
      this.login = login;
   }

   public String getTelefone() {
      return telefone;
   }

   public void setTelefone(String telefone) {
      this.telefone = telefone;
   }

   public String getSenha() {
      return senha;
   }

   public void setSenha(String senha) {
      this.senha = senha;
   }

   // private inner class for event handling
   private class TextFieldHandler implements ActionListener 
   {
      // process textfield events
      public void actionPerformed( ActionEvent event )
      {
         String string = ""; // declare string to display

         // user pressed Enter in JTextField textField1
         if ( event.getSource() == textField1) {
            setLogin(event.getActionCommand());
            string = String.format("login: %s", getLogin());
         }

         // user pressed Enter in JTextField textField2
         else if ( event.getSource() == textField2 ) {
            setTelefone(event.getActionCommand());
            string = String.format("Telefone: %s",
                    event.getActionCommand());
         }

         // user pressed Enter in JTextField textField3
         else if ( event.getSource() == textField3 ) {
            setSenha(event.getActionCommand());
            string = String.format("Troxa: %s",
                    event.getActionCommand());
         }

         // user pressed Enter in JTextField passwordField
         else if ( event.getSource() == passwordField ) {
            string = String.format("Eu sei sua senha: %s",
                    event.getActionCommand());
         }

         // display JTextField content
         JOptionPane.showMessageDialog( null, string ); 
      } // end method actionPerformed
   } // end private inner class TextFieldHandler
} // end class TextFieldFrame

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
