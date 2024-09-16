package Java.Periodo3.POO.InterfaceGrafica.gui3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestaEventos extends JFrame implements ActionListener {
    JButton botao;
    JLabel texto;
    JPanel painel;
    int count;

    public TestaEventos(){
        super("Swing Aplication");
        count = 0;
        painel= new JPanel();
        painel.setLayout(new BoxLayout(painel,BoxLayout.Y_AXIS));
        painel.add(botao);
        painel.add(texto);

        botao.addActionListener(this);
        getContentPane().add(painel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        texto.setText("numero de clicks "+count);
    }
}
