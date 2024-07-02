package Java.TerceiroPeriodo.POO.InterfaceGrafica.gui15_funcoes;

import java.awt.GridLayout;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelNorte{
	 JPanel norte = new JPanel(); // set up panel
	 FlowLayout layout = new FlowLayout();
	 JLabel [] funcoes; 
	 
	 public PainelNorte() {
		 norte.setLayout( layout);
		 layout.setAlignment( FlowLayout.LEFT );
         layout.layoutContainer( norte );
         funcoes[0] = new JLabel("Arquivo");
         funcoes[1] = new JLabel("Editar");
         funcoes[2] = new JLabel("Ajuda");
         norte.add(funcoes[0]);
         norte.add(funcoes[1]);
         norte.add(funcoes[2]);
         
	 }
}
	 
