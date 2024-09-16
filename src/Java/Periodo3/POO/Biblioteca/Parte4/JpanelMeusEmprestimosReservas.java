package Java.Periodo3.POO.Biblioteca.Parte4;

import javax.swing.*;
import java.awt.*;

public class JpanelMeusEmprestimosReservas extends JPanel {
    JLabel textoReserva;
    JList reserva;
    JLabel textoEmprestimo;
    JList emprestimo;
    JScrollPane scrollPane1;
    JScrollPane scrollPane2;

    String[] emprestimos = {"jose", "dany", "ari"};

    public JpanelMeusEmprestimosReservas() {
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createLineBorder(Color.black));
        Font fonte = new Font("Arial", Font.BOLD, 20);

        GridBagConstraints textoEmprestimoC = new GridBagConstraints();

        GridBagConstraints textoReservaC = new GridBagConstraints();
        textoReservaC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints emprestimoC = new GridBagConstraints();


        GridBagConstraints scrollPane1C = new GridBagConstraints();



        GridBagConstraints reservaC = new GridBagConstraints();


        GridBagConstraints scrollPane2C = new GridBagConstraints();


        textoEmprestimo = new JLabel("Emprestimos");
        textoEmprestimo.setFont(fonte);
        add(textoEmprestimo, textoEmprestimoC);

        textoReserva = new JLabel("Reserva");
        textoReserva.setFont(fonte);
        add(textoReserva, textoReservaC);

        emprestimo = new JList(emprestimos);
        emprestimo.setFont(fonte);
        add(emprestimo, emprestimoC);

        scrollPane1 = new JScrollPane(emprestimo);
        scrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scrollPane1, scrollPane1C);


        reserva = new JList(emprestimos);
        reserva.setFont(fonte);
        add(reserva, reservaC);

        scrollPane2 = new JScrollPane(reserva);
        scrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scrollPane2, scrollPane2C);
    }
}
