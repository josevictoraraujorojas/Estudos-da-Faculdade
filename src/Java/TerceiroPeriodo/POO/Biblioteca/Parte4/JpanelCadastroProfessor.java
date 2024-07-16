package Java.TerceiroPeriodo.POO.Biblioteca.Parte4;

import javax.swing.*;
import java.awt.*;

public class JpanelCadastroProfessor extends JPanel{
    JLabel textoNome;
    JTextField nome;
    JLabel textoSenha;
    JTextField senha;
    JLabel textoSexo;
    JComboBox sexo;
    JLabel textoTelefone;
    JTextField telefone;
    JLabel textoCursoMinistrados;
    JTextField cursoMinistrados;
    JLabel textoIdade;
    JTextField idade;
    JLabel textoFormacaoAcademica;
    JTextField formacaoAcademica;

    public JpanelCadastroProfessor() {
        setLayout(new GridBagLayout());
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        Font fonte = new Font("Arial", Font.BOLD, 20);

        GridBagConstraints textoNomeC = new GridBagConstraints();

        GridBagConstraints nomeC = new GridBagConstraints();
        nomeC.gridwidth=GridBagConstraints.REMAINDER;

        GridBagConstraints textoSenhaC = new GridBagConstraints();

        GridBagConstraints senhaC = new GridBagConstraints();
        senhaC.gridwidth=GridBagConstraints.REMAINDER;

        GridBagConstraints textoSexoC = new GridBagConstraints();

        GridBagConstraints sexoC = new GridBagConstraints();
        sexoC.gridwidth=GridBagConstraints.REMAINDER;

        GridBagConstraints textoTelefoneC = new GridBagConstraints();

        GridBagConstraints telefoneC = new GridBagConstraints();
        telefoneC.gridwidth=GridBagConstraints.REMAINDER;

        GridBagConstraints textoCursoMinistradosC = new GridBagConstraints();

        GridBagConstraints cursoMinistradosC = new GridBagConstraints();
        cursoMinistradosC.gridwidth=GridBagConstraints.REMAINDER;

        GridBagConstraints textoIdadeC = new GridBagConstraints();

        GridBagConstraints idadeC = new GridBagConstraints();
        idadeC.gridwidth=GridBagConstraints.REMAINDER;

        GridBagConstraints textoFormacaoAcademicaC = new GridBagConstraints();

        GridBagConstraints formacaoAcademicaC = new GridBagConstraints();
        formacaoAcademicaC.gridwidth=GridBagConstraints.REMAINDER;

        textoNome = new JLabel("Nome:");
        textoNome.setFont(fonte);
        add(textoNome,textoNomeC);

        nome = new JTextField(10);
        nome.setFont(fonte);
        add(nome,nomeC);

        textoSenha = new JLabel("Senha:");
        textoSenha.setFont(fonte);
        add(textoSenha,textoSenhaC);

        senha = new JTextField(10);
        senha.setFont(fonte);
        add(senha,senhaC);

        textoSexo = new JLabel("Sexo:");
        textoSexo.setFont(fonte);
        add(textoSexo,textoSexoC);

        sexo = new JComboBox<>();
        sexo.setFont(fonte);
        sexo.addItem("Masculino");
        sexo.addItem("Feminino");
        add(sexo,sexoC);

        textoTelefone = new JLabel("Telefone:");
        textoTelefone.setFont(fonte);
        add(textoTelefone,textoTelefoneC);

        telefone = new JTextField(10);
        telefone.setFont(fonte);
        add(telefone,telefoneC);


        textoIdade = new JLabel("Idade:");
        textoIdade.setFont(fonte);
        add(textoIdade,textoIdadeC);

        idade = new JTextField(10);
        idade.setFont(fonte);
        add(idade,idadeC);

        textoCursoMinistrados = new JLabel("Cursos Ministrados:");
        textoCursoMinistrados.setFont(fonte);
        add(textoCursoMinistrados,textoCursoMinistradosC);

        cursoMinistrados = new JTextField(10);
        cursoMinistrados.setFont(fonte);
        add(cursoMinistrados,cursoMinistradosC);

        textoFormacaoAcademica = new JLabel("Formacao academica:");
        textoFormacaoAcademica.setFont(fonte);
        add(textoFormacaoAcademica, textoFormacaoAcademicaC);

        formacaoAcademica = new JTextField(10);
        formacaoAcademica.setFont(fonte);
        add(formacaoAcademica,formacaoAcademicaC);
    }
}
