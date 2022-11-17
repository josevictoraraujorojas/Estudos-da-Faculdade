package Java.PrimeiroPeriodo.LacoDeRepeticao;

import javax.swing.*;

public class Ex19 {
    public static void main(String[] args) {
//        Questão 19 Reescreva o programa da questão anterior para corrigir o erro que ocorre quando o usuário digita
//        por exemplo, 10 e 5. Quando o usuário digita esses números o programa imprime 0 como a soma pois o laço for
//        foi programado para somar em ordem crescente. Verifique se os números digitados em inicio e em fim estão em
//        ordem crescente (inicio ¡ fim), e caso o fim seja maior que inicio, então devemos trocar os valores das variáveis
//        de lugar para poder somar os números.

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
