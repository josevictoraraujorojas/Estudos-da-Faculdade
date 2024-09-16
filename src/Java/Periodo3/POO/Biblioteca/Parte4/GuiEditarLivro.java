package Java.Periodo3.POO.Biblioteca.Parte4;

import javax.swing.*;
import java.awt.*;

public class GuiEditarLivro extends JFrame {
    JLabel textoTitulo;
    JTextField titulo;
    JLabel textoAutor;
    JTextField autor;
    JLabel textoGenero;
    JTextField genero;
    JLabel textoEditora;
    JTextField editora;
    JLabel textoAno;
    JTextField ano;
    JLabel textoEdicao;
    JTextField edicao;
    JLabel textoNumeroPaginas;
    JTextField numeroPaginas;
    JButton editar;
    JButton excluir;

    public GuiEditarLivro() {
        setLayout(new GridBagLayout());
        setBackground(Color.WHITE);
        Font fonte = new Font("Arial", Font.BOLD, 20);

        GridBagConstraints textoTituloc = new GridBagConstraints();

        GridBagConstraints tituloc = new GridBagConstraints();
        tituloc.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints textoAutorc = new GridBagConstraints();

        GridBagConstraints autorc = new GridBagConstraints();
        autorc.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints textoGeneroc = new GridBagConstraints();

        GridBagConstraints generoc = new GridBagConstraints();
        generoc.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints textoEditorac = new GridBagConstraints();

        GridBagConstraints editorac = new GridBagConstraints();
        editorac.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints textoAnoc = new GridBagConstraints();

        GridBagConstraints anoc = new GridBagConstraints();
        anoc.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints textoEdicaoc = new GridBagConstraints();

        GridBagConstraints edicaoc = new GridBagConstraints();
        edicaoc.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints textoNumeroPaginasc = new GridBagConstraints();

        GridBagConstraints numeroPaginasc = new GridBagConstraints();
        numeroPaginasc.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints editarC = new GridBagConstraints();


        GridBagConstraints excluirC = new GridBagConstraints();
        excluirC.gridwidth = GridBagConstraints.REMAINDER;

        textoTitulo = new JLabel("Titulo");
        textoTitulo.setFont(fonte);
        add(textoTitulo, textoTituloc);

        titulo = new JTextField(10);
        titulo.setFont(fonte);
        add(titulo, tituloc);

        textoAutor = new JLabel("Autor");
        textoAutor.setFont(fonte);
        add(textoAutor, textoAutorc);

        autor = new JTextField(10);
        autor.setFont(fonte);
        add(autor, autorc);

        textoGenero = new JLabel("Genero");
        textoGenero.setFont(fonte);
        add(textoGenero, textoGeneroc);

        genero = new JTextField(10);
        genero.setFont(fonte);
        add(genero, generoc);

        textoEditora = new JLabel("Editora");
        textoEditora.setFont(fonte);
        add(textoEditora, textoEditorac);

        editora = new JTextField(10);
        editora.setFont(fonte);
        add(editora, editorac);

        textoAno = new JLabel("Ano");
        textoAno.setFont(fonte);
        add(textoAno, textoAnoc);

        ano = new JTextField(10);
        ano.setFont(fonte);
        add(ano, anoc);

        textoEdicao = new JLabel("Edicao");
        textoEdicao.setFont(fonte);
        add(textoEdicao, textoEdicaoc);

        edicao = new JTextField(10);
        edicao.setFont(fonte);
        add(edicao, edicaoc);

        textoNumeroPaginas = new JLabel("Numero Paginas");
        textoNumeroPaginas.setFont(fonte);
        add(textoNumeroPaginas, textoNumeroPaginasc);

        numeroPaginas = new JTextField(10);
        numeroPaginas.setFont(fonte);
        add(numeroPaginas, numeroPaginasc);

        editar = new JButton("Editar");
        editar.setFont(fonte);
        editar.setBackground(Color.YELLOW);
        add(editar, editarC);

        excluir = new JButton("Excluir");
        excluir.setFont(fonte);
        excluir.setBackground(Color.RED);
        add(excluir, excluirC);
    }
}
