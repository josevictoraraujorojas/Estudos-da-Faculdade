package Java.TerceiroPeriodo.POO.Biblioteca.Parte4;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class JpanelObras extends JPanel {
    JPanel painel;
    JLabel textoLivro;
    JList livro;
    JLabel textoFotografia;
    JList fotografia;
    JLabel textoMidiaaudio;
    JList midiaaudio;
    JScrollPane scrollPane1;
    JScrollPane scrollPane2;
    JScrollPane scrollPane3;
    JLabel textoTipoObra;
    JComboBox tipoObra;
    ArrayList<JPanel> tiposDeCadastroObras;

    String[] livros = {"jose", "dany", "ari"};
    String[] fotografias = {"cristiane", "junior", "paulo"};
    String[] midiasaudio = {"funcionario1", "funcionario2", "funcionario3"};

    public JpanelObras() {
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createLineBorder(Color.black));
        Font fonte = new Font("Arial", Font.BOLD, 20);

        GridBagConstraints textoLivroC = new GridBagConstraints();


        GridBagConstraints textoMidiaAudioC= new GridBagConstraints();


        GridBagConstraints textoFotografiaC = new GridBagConstraints();
        textoFotografiaC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints livroC = new GridBagConstraints();


        GridBagConstraints fotografiaC = new GridBagConstraints();


        GridBagConstraints midiaAudioC = new GridBagConstraints();


        GridBagConstraints scrollPane1C = new GridBagConstraints();


        GridBagConstraints scrollPane2C = new GridBagConstraints();

        GridBagConstraints scrollPane3C = new GridBagConstraints();
        scrollPane3C.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints textoTipoObrasC = new GridBagConstraints();

        GridBagConstraints tipoObraC = new GridBagConstraints();
        tipoObraC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints tiposDeCadastroUsuarioC = new GridBagConstraints();


        textoLivro = new JLabel("Livros cadastrados");
        textoLivro.setFont(fonte);
        add(textoLivro, textoLivroC);

        textoMidiaaudio = new JLabel("Midias audio cadastradas");
        textoMidiaaudio.setFont(fonte);
        add(textoMidiaaudio, textoFotografiaC);

        textoFotografia = new JLabel("Fotografias cadastradas");
        textoFotografia.setFont(fonte);
        add(textoFotografia, textoMidiaAudioC);

        livro = new JList(livros);
        livro.setFont(fonte);
        add(livro, livroC);


        scrollPane1 = new JScrollPane(livro);
        scrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scrollPane1, scrollPane1C);


        midiaaudio = new JList(midiasaudio);
        midiaaudio.setFont(fonte);
        add(midiaaudio, midiaAudioC);


        scrollPane2 = new JScrollPane(midiaaudio);
        scrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scrollPane2, scrollPane2C);


        fotografia = new JList(fotografias);
        fotografia.setFont(fonte);
        add(fotografia, fotografiaC);


        scrollPane3 = new JScrollPane(fotografia);
        scrollPane3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scrollPane3, scrollPane3C);

        textoTipoObra = new JLabel("Qual o tipo de obra que sera cadastrado:");
        textoTipoObra.setFont(fonte);
        add(textoTipoObra, textoTipoObrasC);


        tipoObra = new JComboBox<>();
        tipoObra.setFont(fonte);
        for (String s : Arrays.asList("Livro", "Midia Audio", "Fotografia")) {
            tipoObra.addItem(s);
        }
        add(tipoObra, tipoObraC);


        tiposDeCadastroObras = new ArrayList<>();
        tiposDeCadastroObras.add(new JpanelCadastroLivro());
        tiposDeCadastroObras.add(new JpanelCadastroMidiaAudio());
        tiposDeCadastroObras.add(new JpanelCadastroFotografia());

        for (JPanel p : tiposDeCadastroObras) {
            add(p, tiposDeCadastroUsuarioC);
            p.setVisible(false);

        }

        tipoObra.addActionListener(e -> {
            if (Objects.equals(tipoObra.getSelectedItem(), "Livro")) {
                for (JPanel p : tiposDeCadastroObras) {
                    if (p instanceof JpanelCadastroLivro) {
                        p.setVisible(true);
                    } else {
                        p.setVisible(false);
                    }
                }
            } else if (Objects.equals(tipoObra.getSelectedItem(), "Fotografia")) {
                for (JPanel p : tiposDeCadastroObras) {
                    if (p instanceof JpanelCadastroFotografia) {
                        p.setVisible(true);
                    } else {
                        p.setVisible(false);
                    }
                }
            } else if (Objects.equals(tipoObra.getSelectedItem(), "Midia Audio")) {
                for (JPanel p : tiposDeCadastroObras) {
                    if (p instanceof JpanelCadastroMidiaAudio) {
                        p.setVisible(true);
                    } else {
                        p.setVisible(false);
                    }
                }
            }
        });
    }

}
