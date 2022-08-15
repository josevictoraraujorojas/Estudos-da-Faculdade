package Java.Lista05;

import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
//        Questão  2  Escreva  um  programa  em  Java  que  simule  o  lançamento  de  dois  dados  de  6  faces  até  que  o  resultado combinado seja 7.
//        Informe a quantidade de vezes que os dados foram lançados até que o resultado seja 7

        Random aleatorio =new Random();
        int countAte7=0;
        while (true) {
            int dado1 = aleatorio.nextInt(6) + 1;
            int dado2 = aleatorio.nextInt(6) + 1;
            System.out.println("dado1: "+dado1+" + "+"dado2: "+dado2+" = "+(dado1+dado2));
            countAte7++;
            if (dado1+dado2==7){

                break;
            }
        }
        System.out.println("quantidade de chances ate 7: "+countAte7);
    }
}
