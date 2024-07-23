package Java.TerceiroPeriodo.POO.Biblioteca.Parte4;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GuiTela janela = new GuiTela();
        janela.setVisible(true);
        janela.setSize(1700,1000);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
