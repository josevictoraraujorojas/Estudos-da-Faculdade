package Java.PrimeiroPeriodo.LacoDeRepeticao;

import javax.swing.*;

public class Ex19 {
    public static void main(String[] args) {
//        Quest�o 19 Reescreva o programa da quest�o anterior para corrigir o erro que ocorre quando o usu�rio digita
//        por exemplo, 10 e 5. Quando o usu�rio digita esses n�meros o programa imprime 0 como a soma pois o la�o for
//        foi programado para somar em ordem crescente. Verifique se os n�meros digitados em inicio e em fim est�o em
//        ordem crescente (inicio � fim), e caso o fim seja maior que inicio, ent�o devemos trocar os valores das vari�veis
//        de lugar para poder somar os n�meros.

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
