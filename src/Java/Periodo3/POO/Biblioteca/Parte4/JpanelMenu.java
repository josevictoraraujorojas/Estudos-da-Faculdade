package Java.Periodo3.POO.Biblioteca.Parte4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JpanelMenu extends JPanel {
    JPanel menu;
    JButton bibliotecas;
    JButton minhasObras;
    JButton meusEmprestimosEReservas;
    JButton obras;
    JButton usuarios;
    JButton emprestimos;
    JButton reservas;



    public JpanelMenu() {

        setLayout(new GridBagLayout());
        Font fonte = new Font("Arial", Font.BOLD, 20);

        GridBagConstraints menuC = new GridBagConstraints();
        menuC.ipadx=35;
        menuC.ipady=700;

        GridBagConstraints bibliotecaC = new GridBagConstraints();
        bibliotecaC.weightx=1;
        bibliotecaC.weighty=1;
        bibliotecaC.gridy=1;
        bibliotecaC.fill = GridBagConstraints.BOTH;
        bibliotecaC.gridwidth=GridBagConstraints.REMAINDER;


        GridBagConstraints minhasObrasC = new GridBagConstraints();
        minhasObrasC.weightx=1;
        minhasObrasC.weighty=1;
        minhasObrasC.fill = GridBagConstraints.BOTH;
        minhasObrasC.gridwidth=GridBagConstraints.REMAINDER;

        GridBagConstraints meusEmprestimosEReservasC = new GridBagConstraints();
        meusEmprestimosEReservasC.weightx=1;
        meusEmprestimosEReservasC.weighty=1;
        meusEmprestimosEReservasC.fill = GridBagConstraints.BOTH;
        meusEmprestimosEReservasC.gridwidth=GridBagConstraints.REMAINDER;

        GridBagConstraints obrasC = new GridBagConstraints();
        obrasC.weightx=1;
        obrasC.weighty=1;
        obrasC.fill = GridBagConstraints.BOTH;
        obrasC.gridwidth=GridBagConstraints.REMAINDER;

        GridBagConstraints usuariosC = new GridBagConstraints();
        usuariosC.weightx=1;
        usuariosC.weighty=1;
        usuariosC.fill = GridBagConstraints.BOTH;
        usuariosC.gridwidth=GridBagConstraints.REMAINDER;

        GridBagConstraints emprestimosC = new GridBagConstraints();
        emprestimosC.weightx=1;
        emprestimosC.weighty=1;
        emprestimosC.fill = GridBagConstraints.BOTH;
        emprestimosC.gridwidth=GridBagConstraints.REMAINDER;

        GridBagConstraints reservasC = new GridBagConstraints();
        reservasC.weightx=1;
        reservasC.weighty=1;
        reservasC.fill = GridBagConstraints.BOTH;
        reservasC.gridwidth=GridBagConstraints.REMAINDER;



        menu = new JPanel();
        menu.setLayout(new GridBagLayout());
        menu.setBackground(Color.WHITE);
        menu.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(menu,menuC);

        JpanelObras obra = new JpanelObras();
        obra.setVisible(false);
        add(obra,new GridBagConstraints());

        JpanelUsuarios cadastro = new  JpanelUsuarios();
        cadastro.setVisible(false);
        add(cadastro,new GridBagConstraints());

        JpanelEmprestimos emprestimo =  new JpanelEmprestimos();
        emprestimo.setVisible(false);
        add(emprestimo,new GridBagConstraints());

        JpanelReserva reserva =  new JpanelReserva();
        reserva.setVisible(false);
        add(reserva,new GridBagConstraints());

        JpanelMeusEmprestimosReservas emprestimosReservas =  new JpanelMeusEmprestimosReservas();
        emprestimosReservas.setVisible(false);
        add(emprestimosReservas,new GridBagConstraints());

        JpanelBiblioteca biblioteca =  new JpanelBiblioteca();
        biblioteca.setVisible(false);
        add(biblioteca,new GridBagConstraints());

        JpanelMinhasObras minhasObra =  new JpanelMinhasObras();
        minhasObra.setVisible(false);
        add(minhasObra,new GridBagConstraints());

        bibliotecas = new JButton("Biblioteca");
        menu.add(bibliotecas,bibliotecaC);
        bibliotecas.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                minhasObra.setVisible(false);
                cadastro.setVisible(false);
                emprestimosReservas.setVisible(false);
                obra.setVisible(false);
                emprestimo.setVisible(false);
                reserva.setVisible(false);
                biblioteca.setVisible(true);
            }
        });

        minhasObras = new JButton("Minhas Obras");
        menu.add(minhasObras,minhasObrasC);
        minhasObras.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                biblioteca.setVisible(false);
                cadastro.setVisible(false);
                emprestimosReservas.setVisible(false);
                obra.setVisible(false);
                emprestimo.setVisible(false);
                reserva.setVisible(false);
                minhasObra.setVisible(true);
            }
        });



        meusEmprestimosEReservas  = new JButton("Meus Emprestimos/Reservas");
        menu.add(meusEmprestimosEReservas,meusEmprestimosEReservasC);
        meusEmprestimosEReservas.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                biblioteca.setVisible(false);
                minhasObra.setVisible(false);
                cadastro.setVisible(false);
                obra.setVisible(false);
                emprestimo.setVisible(false);
                reserva.setVisible(false);
                emprestimosReservas.setVisible(true);
            }
        });

        obras = new JButton("Gerenciar Obras");
        menu.add(obras, obrasC);
        obras.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                biblioteca.setVisible(false);
                minhasObra.setVisible(false);
                cadastro.setVisible(false);
                emprestimosReservas.setVisible(false);
                emprestimo.setVisible(false);
                reserva.setVisible(false);
                obra.setVisible(true);

            }
        });


        usuarios = new JButton("Gerenciar Usuario");
        menu.add(usuarios,usuariosC);
        usuarios.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                biblioteca.setVisible(false);
                minhasObra.setVisible(false);
                obra.setVisible(false);
                emprestimosReservas.setVisible(false);
                emprestimo.setVisible(false);
                reserva.setVisible(false);
                cadastro.setVisible(true);
            }
        });

        emprestimos = new JButton("Gerenciar Emprestimos");
        menu.add(emprestimos,emprestimosC);
        emprestimos.addActionListener( new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                biblioteca.setVisible(false);
                minhasObra.setVisible(false);
                cadastro.setVisible(false);
                emprestimosReservas.setVisible(false);
                obra.setVisible(false);
                reserva.setVisible(false);
                emprestimo.setVisible(true);
            }
        });

        reservas = new JButton("Gerenciar Reservas");
        menu.add(reservas,reservasC);
        reservas.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                biblioteca.setVisible(false);
                minhasObra.setVisible(false);
                cadastro.setVisible(false);
                emprestimosReservas.setVisible(false);
                obra.setVisible(false);
                emprestimo.setVisible(false);
                reserva.setVisible(true);
            }
        });


    }
}
