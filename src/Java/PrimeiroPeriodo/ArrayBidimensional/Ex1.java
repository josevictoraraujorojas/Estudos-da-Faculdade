package Java.PrimeiroPeriodo.ArrayBidimensional;

import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
//        Questão  1  Considerando  a  seguinte  declaração  Random rand = new Random();
//        ,  qual  o  intervalo  de  valores de números aleatórios que podem ser gerados em cada item?

                Random rand = new Random();
        // nao tera intervalo de valores, na lista falta ponto e virgula

        int random1 = rand.nextInt(47) + 1;
        //numero de 1 a 47

        int random2 = rand.nextInt(8) + 23;
        // numero de 23 a 30 //
        int random3 = rand.nextInt(5)*2+4;
        // 4 a 12 de 2 em 2
        // 0 = 4
        //1 = 6
        //2 = 8
        //3 = 10
        //4 = 12
    }
}
