package Java.Lista03;

import javax.swing.*;

public class Ex20 {
    public static void main(String[] args) {
//        Quest�o 20 Reescreva o programa da quest�o anterior para que o usu�rio possa calcular a soma da sequ�ncia de
//        n�meros quantas vezes ele quiser. Utilize o comando JOptionPane.showConfirmDialog para verificar se o usu�rio
//        deseja calcular a soma de outra sequ�ncia ou n�o (pesquise sobre como funciona o comando).

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
