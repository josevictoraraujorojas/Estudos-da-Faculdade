package Java.Periodo3.POO.Biblioteca.Parte4;

import javax.swing.*;
import java.awt.*;

public class GuiEditarReserva extends JFrame {
    JLabel textotitulo;
    JTextField titulo;
    JLabel textoDataReserva;
    JTextField dataReserva;
    JLabel textoHoraReserva;
    JTextField horaReserva;
    JButton editar;
    JButton apagar;

    public GuiEditarReserva() {
        setLayout(new GridBagLayout());
        setBackground(Color.WHITE);
        Font fonte = new Font("Arial", Font.BOLD, 20);

        GridBagConstraints textotituloC = new GridBagConstraints();

        GridBagConstraints tituloC = new GridBagConstraints();
        tituloC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints textoDataEmprestimoC = new GridBagConstraints();

        GridBagConstraints dataEmprestimoC = new GridBagConstraints();
        dataEmprestimoC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints textoHoraEmprestimoC = new GridBagConstraints();

        GridBagConstraints horaEmprestimoC = new GridBagConstraints();
        horaEmprestimoC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints editarC = new GridBagConstraints();

        GridBagConstraints apagarC = new GridBagConstraints();
        apagarC.gridwidth = GridBagConstraints.REMAINDER;

        textotitulo = new JLabel("Titulo da obra");
        textotitulo.setFont(fonte);
        add(textotitulo, textotituloC);

        titulo = new JTextField(10);
        titulo.setFont(fonte);
        add(titulo, tituloC);

        textoDataReserva = new JLabel("Data reserva");
        textoDataReserva.setFont(fonte);
        add(textoDataReserva, textoDataEmprestimoC);

        dataReserva = new JTextField(10);
        dataReserva.setFont(fonte);
        add(dataReserva, dataEmprestimoC);

        textoHoraReserva = new JLabel("Hora reserva");
        textoHoraReserva.setFont(fonte);
        add(textoHoraReserva, textoHoraEmprestimoC);

        horaReserva = new JTextField(10);
        horaReserva.setFont(fonte);
        add(horaReserva, horaEmprestimoC);

        editar = new JButton("editar");
        editar.setFont(fonte);
        editar.setBackground(Color.green);
        add(editar, editarC);

        apagar = new JButton("Apagar");
        apagar.setFont(fonte);
        apagar.setBackground(Color.red);
        add(apagar, apagarC);
    }
}
