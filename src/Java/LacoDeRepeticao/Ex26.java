package Java.LacoDeRepeticao;

import javax.swing.*;

public class Ex26 {
    public static void main(String[] args) {
//        Questão 26 Faça um programa em Java que leia um número N e outro X. Imprima todos os números entre N e
//        X. Se algum dos números for 13, parar o laço e imprimir a mensagem ?Número 13 encontrado! "com o JOptionPane
//        com a imagem de erro. Utilize o laço for o comando break.

        int i;
        int limite;
        i = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
        limite = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero"));
        JOptionPane.showMessageDialog(null, "esses sao os numeros inteiros entre " + i + " e " + limite, "intervalo", JOptionPane.DEFAULT_OPTION);
        for (i = i; i <= limite; i++) {
            JOptionPane.showMessageDialog(null, i, "numeros", JOptionPane.DEFAULT_OPTION);
            if (i == 13) {
                JOptionPane.showMessageDialog(null, "numero 13 encontrado", "ERRO 404", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
    }
}
