package Java.Periodo3.POO.Biblioteca.Parte4;

import javax.swing.*;
import java.awt.*;

public class JpanelLogin extends JPanel {
    JPanel painelLogin;
    JLabel textoLogin;
    JTextField login;
    JLabel textoSenha;
    JTextField senha;
    JButton logar;

    public JpanelLogin() {
        setLayout(new GridBagLayout());
        Font fonte = new Font("Arial", Font.BOLD, 20);

        GridBagConstraints painelLoginc = new GridBagConstraints();
        painelLoginc.ipadx=300;
        painelLoginc.ipady=300;

        GridBagConstraints textoLoginc = new GridBagConstraints();

        GridBagConstraints loginC = new GridBagConstraints();
        loginC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints textoSenhaC = new GridBagConstraints();

        GridBagConstraints senhaC = new GridBagConstraints();
        senhaC.gridwidth = GridBagConstraints.REMAINDER;

        GridBagConstraints logarC = new GridBagConstraints();
        logarC.gridwidth = GridBagConstraints.CENTER;

        painelLogin = new JPanel();
        painelLogin.setLayout(new GridBagLayout());
        painelLogin.setBorder(BorderFactory.createLineBorder(Color.black));
        painelLogin.setBackground(Color.white);
        add(painelLogin,painelLoginc);

        textoLogin = new JLabel("Login:");
        textoLogin.setFont(fonte);
        painelLogin.add(textoLogin,textoLoginc);

        login = new JTextField();
        login.setColumns(10);
        painelLogin.add(login,loginC);

        textoSenha = new JLabel("Senha:");
        textoSenha.setFont(fonte);
        painelLogin.add(textoSenha,textoSenhaC);

        senha = new JTextField();
        senha.setColumns(10);
        painelLogin.add(senha,senhaC);

        logar = new JButton("Logar");
        painelLogin.add(logar,logarC);

    }
}
