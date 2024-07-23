package Java.TerceiroPeriodo.POO.Biblioteca.Parte4;

import javax.swing.*;
import java.awt.*;

public class JpanelCadastroMidiaAudio extends JPanel{
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
    JLabel textoDuracao;
    JTextField duaracao;
    JLabel textoAlbum;
    JTextField album;;
    JButton cadastrar;

    public JpanelCadastroMidiaAudio() {
        setLayout(new GridBagLayout());
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
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

        GridBagConstraints textoAlbumc = new GridBagConstraints();

        GridBagConstraints albumc = new GridBagConstraints();
        albumc.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints textoObrac = new GridBagConstraints();

        GridBagConstraints obrac = new GridBagConstraints();
        obrac.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints cadastrarc = new GridBagConstraints();
        cadastrarc.gridwidth = GridBagConstraints.REMAINDER;

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

        textoDuracao = new JLabel("Duracao");
        textoDuracao.setFont(fonte);
        add(textoDuracao, textoAlbumc);

        duaracao = new JTextField(10);
        duaracao.setFont(fonte);
        add(duaracao, albumc);

        textoAlbum = new JLabel("Album");
        textoAlbum.setFont(fonte);
        add(textoAlbum, textoObrac);

        album = new JTextField(10);
        album.setFont(fonte);
        add(album, obrac);

        cadastrar = new JButton("Cadastrar");
        cadastrar.setFont(fonte);
        cadastrar.setBackground(Color.GREEN);
        add(cadastrar,cadastrarc);

    }


}
