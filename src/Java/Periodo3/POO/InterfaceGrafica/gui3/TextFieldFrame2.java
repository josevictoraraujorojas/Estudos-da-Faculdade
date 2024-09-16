package Java.Periodo3.POO.InterfaceGrafica.gui3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TextFieldFrame2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtCaixaDeTexto;
	private JTextField txtCaixaComTexto;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextFieldFrame2 frame = new TextFieldFrame2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TextFieldFrame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtCaixaDeTexto = new JTextField();
		txtCaixaDeTexto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			       String string = String.format( "passwordField: %s", 
			               e.getActionCommand() );

			         // display JTextField content
			         JOptionPane.showMessageDialog( null, string ); 

			}
		});
		txtCaixaDeTexto.setText("Caixa de texto n\u00E3o edit\u00E1vel");
		txtCaixaDeTexto.setEditable(false);
		contentPane.add(txtCaixaDeTexto);
		txtCaixaDeTexto.setColumns(10);
		
		txtCaixaComTexto = new JTextField();
		txtCaixaComTexto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			       String string = String.format( "passwordField: %s", 
			               e.getActionCommand() );

			         // display JTextField content
			         JOptionPane.showMessageDialog( null, string ); 


			}
		});
		txtCaixaComTexto.setText("caixa com texto");
		contentPane.add(txtCaixaComTexto);
		txtCaixaComTexto.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			       String string = String.format( "passwordField: %s", 
			               e.getActionCommand() );

			         // display JTextField content
			         JOptionPane.showMessageDialog( null, string ); 


			}
		});
		passwordField.setColumns(12);
		contentPane.add(passwordField);
	}

}
