package Java.TerceiroPeriodo.POO.Biblioteca.Parte4;

import javax.swing.*;
import java.awt.*;

public class GuiEditarFuncionario extends JFrame{
    JLabel textoNome;
    JTextField nome;
    JLabel textoSenha;
    JTextField senha;
    JLabel textoSexo;
    JComboBox sexo;
    JLabel textoTelefone;
    JTextField telefone;
    JLabel textoDepartamento;
    JTextField departamento;
    JLabel textoIdade;
    JTextField idade;
    JLabel textoCargo;
    JTextField cargo;
    JButton editar;
    JButton excluir;

    public GuiEditarFuncionario() {
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

        GridBagConstraints textoDepartamentoC = new GridBagConstraints();

        GridBagConstraints departamentoC = new GridBagConstraints();
        departamentoC.gridwidth=GridBagConstraints.REMAINDER;

        GridBagConstraints textoIdadeC = new GridBagConstraints();

        GridBagConstraints idadeC = new GridBagConstraints();
        idadeC.gridwidth=GridBagConstraints.REMAINDER;

        GridBagConstraints textoCargoC = new GridBagConstraints();

        GridBagConstraints cargoC = new GridBagConstraints();
        cargoC.gridwidth=GridBagConstraints.REMAINDER;

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

        textoDepartamento = new JLabel("Departamento:");
        textoDepartamento.setFont(fonte);
        add(textoDepartamento,textoDepartamentoC);

        departamento = new JTextField(10);
        departamento.setFont(fonte);
        add(departamento,departamentoC);

        textoCargo = new JLabel("Cargo:");
        textoCargo.setFont(fonte);
        add(textoCargo, textoCargoC);

        cargo = new JTextField(10);
        cargo.setFont(fonte);
        add(cargo,cargoC);

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
