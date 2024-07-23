package Java.TerceiroPeriodo.POO.Biblioteca.Parte4;

import javax.swing.*;
import java.awt.*;

public class GuiEditarFotografia extends JFrame {
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
    JLabel textoLocalDaFoto;
    JTextField localDaFoto;
    JLabel textoLegenda;
    JTextField legenda;
    JButton editar;
    JButton excluir;

    public GuiEditarFotografia() {
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

        GridBagConstraints textoLocalDaFotoc = new GridBagConstraints();

        GridBagConstraints localDaFotoc = new GridBagConstraints();
        localDaFotoc.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints textoLegendac = new GridBagConstraints();

        GridBagConstraints legendac = new GridBagConstraints();
        legendac.gridwidth = GridBagConstraints.REMAINDER;

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
        add(textoAno,textoAnoc);

        ano = new JTextField(10);
        ano.setFont(fonte);
        add(ano, anoc);

        textoLocalDaFoto = new JLabel("Local da foto");
        textoLocalDaFoto.setFont(fonte);
        add(textoLocalDaFoto, textoLocalDaFotoc);

        localDaFoto = new JTextField(10);
        localDaFoto.setFont(fonte);
        add(localDaFoto, localDaFotoc);

        textoLegenda = new JLabel("Legenda");
        textoLegenda.setFont(fonte);
        add(textoLegenda, textoLegendac);

        legenda = new JTextField(10);
        legenda.setFont(fonte);
        add(legenda, legendac);

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
