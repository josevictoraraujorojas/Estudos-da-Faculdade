package Lista02;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
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
