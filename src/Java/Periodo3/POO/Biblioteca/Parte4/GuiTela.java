package Java.Periodo3.POO.Biblioteca.Parte4;

import javax.swing.*;
import java.awt.*;

public class GuiTela extends JFrame{


    public GuiTela(){
        super("bibliotecas");
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.ipadx = 400;
        gbc.ipady = 750;

        GridBagConstraints c = new GridBagConstraints();

        JpanelMenu login = new JpanelMenu();
        add(login,c);



    }
}
