package Java.TerceiroPeriodo.POO.Biblioteca.Parte4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class JpanelMenu extends JPanel {
    JPanel menu;
    JButton biblioteca;
    JButton minhasObras;
    JButton meusEmprestimosEReservas;
    JButton livros;
    JButton usuarios;


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

        GridBagConstraints livrosC = new GridBagConstraints();
        livrosC.weightx=1;
        livrosC.weighty=1;
        livrosC.fill = GridBagConstraints.BOTH;
        livrosC.gridwidth=GridBagConstraints.REMAINDER;

        GridBagConstraints usuariosC = new GridBagConstraints();
        usuariosC.weightx=1;
        usuariosC.weighty=1;
        usuariosC.fill = GridBagConstraints.BOTH;
        usuariosC.gridwidth=GridBagConstraints.REMAINDER;



        menu = new JPanel();
        menu.setLayout(new GridBagLayout());
        menu.setBackground(Color.WHITE);
        menu.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(menu,menuC);

        biblioteca = new JButton("Biblioteca");
        menu.add(biblioteca,bibliotecaC);

        minhasObras = new JButton("Minhas Obras");
        menu.add(minhasObras,minhasObrasC);

        meusEmprestimosEReservas  = new JButton("Meus Emprestimos");
        menu.add(meusEmprestimosEReservas,meusEmprestimosEReservasC);

        livros = new JButton("Gerenciar Livros");
        menu.add(livros, livrosC);

        JpanelUsuarios cadastro = new  JpanelUsuarios();
        cadastro.setVisible(false);
        add(cadastro,new GridBagConstraints());

        usuarios = new JButton("Gerenciar Usuario");
        menu.add(usuarios,usuariosC);
        usuarios.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cadastro.setVisible(true);
            }
        });


    }
}
