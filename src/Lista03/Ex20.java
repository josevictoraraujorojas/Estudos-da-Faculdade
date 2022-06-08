package Lista03;

import javax.swing.*;

public class Ex20 {
    public static void main(String[] args) {
        int inicio,fim,i,soma,auxiliar,reutilizar;
        do {
            soma = 0;
            inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial"));
            fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final"));
            if (inicio > fim)
            {
                auxiliar = inicio;
                inicio = fim;
                fim = auxiliar;
            }
            for (i = inicio; i <= fim; i++)
            {
                soma += i;
            }
            JOptionPane.showMessageDialog(null, "A soma dos numeros e " + soma);

            reutilizar=JOptionPane.showConfirmDialog(null,"quer calcular de novo?","calcular",JOptionPane.YES_NO_OPTION);
        }while (reutilizar==(JOptionPane.YES_OPTION));
    }
}
