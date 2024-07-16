package Java.TerceiroPeriodo.POO.Biblioteca.Parte4;

import javax.swing.*;
import java.awt.*;


public class JpanelMenu extends JPanel {
    JPanel menu;
    JButton biblioteca;
    JButton minhasObras;
    JButton meusEmprestimosEReservas;
    JButton cadastrarLivro;
    JButton cadastrarUsuario;
    JButton excluirLivro;
    JButton excluirUsuario;


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

        GridBagConstraints cadastrarLivroC = new GridBagConstraints();
        cadastrarLivroC.weightx=1;
        cadastrarLivroC.weighty=1;
        cadastrarLivroC.fill = GridBagConstraints.BOTH;
        cadastrarLivroC.gridwidth=GridBagConstraints.REMAINDER;

        GridBagConstraints cadastrarUsuarioC = new GridBagConstraints();
        cadastrarUsuarioC.weightx=1;
        cadastrarUsuarioC.weighty=1;
        cadastrarUsuarioC.fill = GridBagConstraints.BOTH;
        cadastrarUsuarioC.gridwidth=GridBagConstraints.REMAINDER;

        GridBagConstraints excluirLivroC = new GridBagConstraints();
        excluirLivroC.weightx=1;
        excluirLivroC.weighty=1;
        excluirLivroC.fill = GridBagConstraints.BOTH;
        excluirLivroC.gridwidth=GridBagConstraints.REMAINDER;

        GridBagConstraints excluirUsuarioC = new GridBagConstraints();
        excluirUsuarioC.weightx=1;
        excluirUsuarioC.weighty=1;
        excluirUsuarioC.fill = GridBagConstraints.BOTH;
        excluirUsuarioC.gridwidth=GridBagConstraints.REMAINDER;


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

        cadastrarLivro = new JButton("Cadastrar Livro");
        menu.add(cadastrarLivro,cadastrarLivroC);

        cadastrarUsuario = new JButton("Cadastrar Usuario");
        menu.add(cadastrarUsuario,cadastrarUsuarioC);

        excluirLivro = new JButton("Excluir Livro");
        menu.add(excluirLivro,excluirLivroC);

        excluirUsuario = new JButton("Excluir Usuario");
        menu.add(excluirUsuario,excluirUsuarioC);

    }
}
