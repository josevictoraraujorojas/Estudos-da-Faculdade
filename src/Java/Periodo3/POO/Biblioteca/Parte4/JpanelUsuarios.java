package Java.Periodo3.POO.Biblioteca.Parte4;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class JpanelUsuarios extends JPanel {
    JPanel painel;
    JLabel textoEstudante;
    JList estudante;
    JLabel textoFuncionario;
    JList funcionario;
    JLabel textoProfessor;
    JList professor;
    JScrollPane scrollPane1;
    JScrollPane scrollPane2;
    JScrollPane scrollPane3;
    JLabel textoTipoUsuario;
    JComboBox tipoUsuario;
    ArrayList<JPanel> tiposDeCadastroUsuario;

    String[] estudantes = {"jose","dany","ari"};
    String[] professores = {"cristiane","junior","paulo"};
    String[] funcionarios = {"funcionario1","funcionario2","funcionario3"};


    public JpanelUsuarios(){
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createLineBorder(Color.black));
        Font fonte = new Font("Arial", Font.BOLD, 20);

        GridBagConstraints textoEstudantesC = new GridBagConstraints();


        GridBagConstraints textoProfessorC = new GridBagConstraints();


        GridBagConstraints textoFuncionarioC = new GridBagConstraints();
        textoFuncionarioC.gridwidth=GridBagConstraints.REMAINDER;

        GridBagConstraints estudanteC = new GridBagConstraints();


        GridBagConstraints professorC = new GridBagConstraints();


        GridBagConstraints funcionarioC = new GridBagConstraints();


        GridBagConstraints scrollPane1C = new GridBagConstraints();


        GridBagConstraints scrollPane2C = new GridBagConstraints();

        GridBagConstraints scrollPane3C = new GridBagConstraints();
        scrollPane3C.gridwidth=GridBagConstraints.REMAINDER;

        GridBagConstraints textoTipoUsuarioC = new GridBagConstraints();

        GridBagConstraints tipoUsuarioC = new GridBagConstraints();
        tipoUsuarioC.gridwidth=GridBagConstraints.REMAINDER;

        GridBagConstraints tiposDeCadastroUsuarioC = new GridBagConstraints();




        textoEstudante = new JLabel("Estudantes cadastrados");
        textoEstudante.setFont(fonte);
        add(textoEstudante, textoEstudantesC);

        textoProfessor = new JLabel("Professores cadastrados");
        textoProfessor.setFont(fonte);
        add(textoProfessor, textoProfessorC);

        textoFuncionario = new JLabel("Funcionarios cadastrados");
        textoFuncionario.setFont(fonte);
        add(textoFuncionario, textoFuncionarioC);

        estudante = new JList(estudantes);
        estudante.setFont(fonte);
        add(estudante, estudanteC);


        scrollPane1 = new JScrollPane(estudante);
        scrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scrollPane1, scrollPane1C);



        professor = new JList(professores);
        professor.setFont(fonte);
        add(professor, professorC);


        scrollPane2 = new JScrollPane(professor);
        scrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scrollPane2, scrollPane2C);



        funcionario = new JList(funcionarios);
        funcionario.setFont(fonte);
        add(funcionario, funcionarioC);


        scrollPane3= new JScrollPane(funcionario);
        scrollPane3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scrollPane3, scrollPane3C);

        textoTipoUsuario = new JLabel("Qual o tipo de usuario que sera cadastrado:");
        textoTipoUsuario.setFont(fonte);
        add(textoTipoUsuario,textoTipoUsuarioC);


        tipoUsuario = new JComboBox<>();
        tipoUsuario.setFont(fonte);
        for (String s : Arrays.asList("Estudante", "Professor", "Funcionario")) {
            tipoUsuario.addItem(s);
        }
        add(tipoUsuario,tipoUsuarioC);


        tiposDeCadastroUsuario = new ArrayList<>();
        tiposDeCadastroUsuario.add(new JpanelCadastroProfessor());
        tiposDeCadastroUsuario.add(new JpanelCadastroFuncionario());
        tiposDeCadastroUsuario.add(new JpanelCadastroEstudante());

        for (JPanel p : tiposDeCadastroUsuario) {
            add(p,tiposDeCadastroUsuarioC);
            p.setVisible(false);

        }

        tipoUsuario.addActionListener(e -> {
            if (Objects.equals(tipoUsuario.getSelectedItem(), "Estudante")) {
                for (JPanel p : tiposDeCadastroUsuario) {
                    if (p instanceof JpanelCadastroEstudante) {
                        p.setVisible(true);
                    } else {
                        p.setVisible(false);
                    }
                }
            }else if (Objects.equals(tipoUsuario.getSelectedItem(), "Professor")) {
                for (JPanel p : tiposDeCadastroUsuario) {
                    if (p instanceof JpanelCadastroProfessor) {
                        p.setVisible(true);
                    }else {
                        p.setVisible(false);
                    }
                }
            }else if (Objects.equals(tipoUsuario.getSelectedItem(), "Funcionario")) {
                for (JPanel p : tiposDeCadastroUsuario) {
                    if (p instanceof JpanelCadastroFuncionario) {
                        p.setVisible(true);
                    }else {
                        p.setVisible(false);
                    }
                }
            }
        });
    }

}
