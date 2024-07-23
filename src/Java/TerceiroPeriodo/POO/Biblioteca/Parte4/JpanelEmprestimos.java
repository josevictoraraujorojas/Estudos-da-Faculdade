package Java.TerceiroPeriodo.POO.Biblioteca.Parte4;

import javax.swing.*;
import java.awt.*;

public class JpanelEmprestimos extends JPanel{
    JLabel textoEmprestimo;
    JList emprestimo;
    JScrollPane scrollPane;
    JLabel textoCadastrar;
    JLabel textotitulo;
    JTextField titulo;
    JLabel textoDataEmprestimo;
    JTextField dataEmprestimo;
    JLabel textoHoraEmprestimo;
    JTextField horaEmprestimo;
    JButton cadastrar;

    String[] emprestimos = {"jose", "dany", "ari"};

    public JpanelEmprestimos() {
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createLineBorder(Color.black));
        Font fonte = new Font("Arial", Font.BOLD, 20);

        GridBagConstraints textoEmprestimoC = new GridBagConstraints();
        textoEmprestimoC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints emprestimoC = new GridBagConstraints();
        emprestimoC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints scrollPaneC = new GridBagConstraints();
        scrollPaneC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints textoCadastrarC = new GridBagConstraints();
        textoCadastrarC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints textotituloC = new GridBagConstraints();

        GridBagConstraints tituloC = new GridBagConstraints();
        tituloC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints textoDataEmprestimoC = new GridBagConstraints();

        GridBagConstraints dataEmprestimoC = new GridBagConstraints();
        dataEmprestimoC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints textoHoraEmprestimoC = new GridBagConstraints();

        GridBagConstraints horaEmprestimoC = new GridBagConstraints();
        horaEmprestimoC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints cadastrarC = new GridBagConstraints();
        cadastrarC.gridwidth = GridBagConstraints.REMAINDER;

        textoEmprestimo = new JLabel("Emprestimos");
        textoEmprestimo.setFont(fonte);
        add(textoEmprestimo, textoEmprestimoC);

        emprestimo = new JList(emprestimos);
        emprestimo.setFont(fonte);
        add(emprestimo, emprestimoC);

        scrollPane = new JScrollPane(emprestimo);
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

        textoDataEmprestimo = new JLabel("Data Emprestimo");
        textoDataEmprestimo.setFont(fonte);
        add(textoDataEmprestimo, textoDataEmprestimoC);

        dataEmprestimo = new JTextField(10);
        dataEmprestimo.setFont(fonte);
        add(dataEmprestimo, dataEmprestimoC);

        textoHoraEmprestimo = new JLabel("Hora Emprestimo");
        textoHoraEmprestimo.setFont(fonte);
        add(textoHoraEmprestimo, textoHoraEmprestimoC);

        horaEmprestimo = new JTextField(10);
        horaEmprestimo.setFont(fonte);
        add(horaEmprestimo, horaEmprestimoC);

        cadastrar = new JButton("Cadastrar");
        cadastrar.setFont(fonte);
        cadastrar.setBackground(Color.green);
        add(cadastrar, cadastrarC);




    }
}
