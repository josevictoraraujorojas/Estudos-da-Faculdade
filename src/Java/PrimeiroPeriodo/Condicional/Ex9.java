package Java.PrimeiroPeriodo.Condicional;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
//        Quest�o 9 Julgue o seguinte item, considerando a proposi��o P: ?Se o
//        respons�vel pela indica��o fizer sua parte e seus aliados trabalharem duro, vencer�o.?.
//        A nega��o da proposi��o P pode ser expressa por ?Se o respons�vel pela indica��o n�o fizer sua parte ou seus
//        aliados n�o trabalharem duro, n�o vencer�o.?.
//        (a) Certo
//                (b) Errado
//        Errado, pois, as duas op��es tem que estar negando

        boolean responsavel;
        boolean aliados;
        Scanner ler = new Scanner(System.in);
        System.out.println("Se o respons�vel pela indica��o fez sua parte e os aliados trabalharam duro, eles vencer�o");
                System.out.println("respons�vel fazer sua parte (true ou false):");
        responsavel = ler.nextBoolean();
        System.out.println("aliados trabalharem duro (true ou false):");
        aliados = ler.nextBoolean();
        if (responsavel==true && aliados==true)
        {
            System.out.println("Se o respons�vel pela indica��o fez sua parte e os aliados trabalharam duro, eles vencer�o. TRUE");
        }
        else if (responsavel==true && aliados==false)
        {
            System.out.println("Se o respons�vel pela indica��o fez sua parte e os aliados N�O trabalharam duro, eles N�O vencer�o. FALSE");
        }
        else if (responsavel==false && aliados==true) {
            System.out.println("Se o respons�vel pela indica��o N�O fez sua parte e os aliados trabalharam duro, eles N�O vencer�o. FALSE");
        }
        else
        {
            System.out.println("Se o respons�vel pela indica��o N�O fez sua parte e os aliados N�O trabalharam duro, eles N�O vencer�o. true");
        }
    }
}
