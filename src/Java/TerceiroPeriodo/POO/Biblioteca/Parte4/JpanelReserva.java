package Java.TerceiroPeriodo.POO.Biblioteca.Parte4;

import javax.swing.*;
import java.awt.*;

public class JpanelReserva extends JPanel {
    JLabel textoReserva;
    JList reserva;
    JScrollPane scrollPane;
    JLabel textoCadastrar;
    JLabel textotitulo;
    JTextField titulo;
    JLabel textoDataReserva;
    JTextField dataReserva;
    JLabel textoHoraReserva;
    JTextField horaReserva;
    JButton cadastrar;

    String[] emprestimos = {"jose", "dany", "ari"};

    public JpanelReserva() {
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createLineBorder(Color.black));
        Font fonte = new Font("Arial", Font.BOLD, 20);

        GridBagConstraints textoReservaC = new GridBagConstraints();
        textoReservaC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints reservaC = new GridBagConstraints();
        reservaC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints scrollPaneC = new GridBagConstraints();
        scrollPaneC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints textoCadastrarC = new GridBagConstraints();
        textoCadastrarC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints textotituloC = new GridBagConstraints();

        GridBagConstraints tituloC = new GridBagConstraints();
        tituloC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints textoDataReservaC = new GridBagConstraints();

        GridBagConstraints dataReservaC = new GridBagConstraints();
        dataReservaC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints textoHoraEmprestimoC = new GridBagConstraints();

        GridBagConstraints horaReservaC = new GridBagConstraints();
        horaReservaC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints cadastrarC = new GridBagConstraints();
        cadastrarC.gridwidth = GridBagConstraints.REMAINDER;

        textoReserva = new JLabel("Reserva");
        textoReserva.setFont(fonte);
        add(textoReserva, textoReservaC);

        reserva = new JList(emprestimos);
        reserva.setFont(fonte);
        add(reserva, reservaC);

        scrollPane = new JScrollPane(reserva);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scrollPane, scrollPaneC);

        textoCadastrar = new JLabel("Cadastrar reserva");
        textoCadastrar.setFont(fonte);
        add(textoCadastrar, textoCadastrarC);

        textotitulo = new JLabel("Titulo da obra");
        textotitulo.setFont(fonte);
        add(textotitulo, textotituloC);

        titulo = new JTextField(10);
        titulo.setFont(fonte);
        add(titulo, tituloC);

        textoDataReserva = new JLabel("Data reserva");
        textoDataReserva.setFont(fonte);
        add(textoDataReserva, textoDataReservaC);

        dataReserva = new JTextField(10);
        dataReserva.setFont(fonte);
        add(dataReserva, dataReservaC);

        textoHoraReserva = new JLabel("Hora reserva");
        textoHoraReserva.setFont(fonte);
        add(textoHoraReserva, textoHoraEmprestimoC);

        horaReserva = new JTextField(10);
        horaReserva.setFont(fonte);
        add(horaReserva, horaReservaC);

        cadastrar = new JButton("Cadastrar");
        cadastrar.setFont(fonte);
        cadastrar.setBackground(Color.green);
        add(cadastrar, cadastrarC);




    }
}
