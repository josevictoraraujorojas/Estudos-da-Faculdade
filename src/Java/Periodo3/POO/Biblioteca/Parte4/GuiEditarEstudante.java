package Java.Periodo3.POO.Biblioteca.Parte4;

import javax.swing.*;
import java.awt.*;

public class GuiEditarEstudante extends JFrame {
        JLabel textoNome;
        JTextField nome;
        JLabel textoSenha;
        JTextField senha;
        JLabel textoSexo;
        JComboBox sexo;
        JLabel textoTelefone;
        JTextField telefone;
        JLabel textoCurso;
        JTextField curso;
        JLabel textoIdade;
        JTextField idade;
        JLabel textoPeriodo;
        JTextField periodo;
        JButton editar;
        JButton excluir;

        public GuiEditarEstudante() {

            setLayout(new GridBagLayout());
            setBackground(Color.WHITE);
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

            GridBagConstraints textoCursoC = new GridBagConstraints();

            GridBagConstraints cursoC = new GridBagConstraints();
            cursoC.gridwidth=GridBagConstraints.REMAINDER;

            GridBagConstraints textoIdadeC = new GridBagConstraints();

            GridBagConstraints idadeC = new GridBagConstraints();
            idadeC.gridwidth=GridBagConstraints.REMAINDER;

            GridBagConstraints textoPeriodoC = new GridBagConstraints();

            GridBagConstraints periodoC = new GridBagConstraints();
            periodoC.gridwidth=GridBagConstraints.REMAINDER;

            GridBagConstraints editarC = new GridBagConstraints();


            GridBagConstraints excluirC = new GridBagConstraints();
            excluirC.gridwidth=GridBagConstraints.REMAINDER;

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

            textoCurso = new JLabel("Curso:");
            textoCurso.setFont(fonte);
            add(textoCurso,textoCursoC);

            curso = new JTextField(10);
            curso.setFont(fonte);
            add(curso,cursoC);

            textoPeriodo = new JLabel("Periodo:");
            textoPeriodo.setFont(fonte);
            add(textoPeriodo,textoPeriodoC);

            periodo = new JTextField(10);
            periodo.setFont(fonte);
            add(periodo,periodoC);

            editar = new JButton("Editar");
            editar.setFont(fonte);
            editar.setBackground(Color.YELLOW);
            add(editar,editarC);

            excluir = new JButton("Excluir");
            excluir.setFont(fonte);
            excluir.setBackground(Color.RED);
            add(excluir,excluirC);

        }

    }
