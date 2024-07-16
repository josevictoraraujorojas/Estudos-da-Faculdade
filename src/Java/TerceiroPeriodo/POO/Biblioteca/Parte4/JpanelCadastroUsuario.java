package Java.TerceiroPeriodo.POO.Biblioteca.Parte4;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class JpanelCadastroUsuario extends JPanel {
    JLabel textoTipoUsuario;
    JComboBox tipoUsuario;

    public JpanelCadastroUsuario(){
        setLayout(new GridBagLayout());
        Font fonte = new Font("Arial", Font.BOLD, 20);

        GridBagConstraints textoTipoUsuarioC = new GridBagConstraints();

        GridBagConstraints tipoUsuarioC = new GridBagConstraints();
        tipoUsuarioC.gridwidth=GridBagConstraints.REMAINDER;

        textoTipoUsuario = new JLabel("Qual o tipo de usuario que sera cadastrado:");
        textoTipoUsuario.setFont(fonte);
        add(textoTipoUsuario,textoTipoUsuarioC);


        tipoUsuario = new JComboBox<>();
        tipoUsuario.setFont(fonte);
        for (String s : Arrays.asList("Estudante", "Professor", "Funcionario")) {
            tipoUsuario.addItem(s);
        }
        add(tipoUsuario,tipoUsuarioC);
    }

}
