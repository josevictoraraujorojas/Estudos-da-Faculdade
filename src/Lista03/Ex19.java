package Lista03;

import javax.swing.*;

public class Ex19 {
    public static void main(String[] args) {
        int i;
        int soma=0;
        int inicio , fim;
        int auxiliar;
        inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial"));
        fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final"));
        if (inicio>fim)
        {
            auxiliar=inicio;
            inicio=fim;
            fim=auxiliar;
        }
        for(i=inicio; i<=fim; i++)
        {
            soma+=i;
        }
        JOptionPane.showMessageDialog(null ,"A soma dos numeros e " + soma);
    }
}
