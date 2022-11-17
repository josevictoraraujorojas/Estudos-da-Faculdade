package Java.PrimeiroPeriodo.Condicional;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
//        Questão 9 Julgue o seguinte item, considerando a proposição P: ?Se o
//        responsável pela indicação fizer sua parte e seus aliados trabalharem duro, vencerão.?.
//        A negação da proposição P pode ser expressa por ?Se o responsável pela indicação não fizer sua parte ou seus
//        aliados não trabalharem duro, não vencerão.?.
//        (a) Certo
//                (b) Errado
//        Errado, pois, as duas opções tem que estar negando

        boolean responsavel;
        boolean aliados;
        Scanner ler = new Scanner(System.in);
        System.out.println("Se o responsável pela indicação fez sua parte e os aliados trabalharam duro, eles vencerão");
                System.out.println("responsável fazer sua parte (true ou false):");
        responsavel = ler.nextBoolean();
        System.out.println("aliados trabalharem duro (true ou false):");
        aliados = ler.nextBoolean();
        if (responsavel==true && aliados==true)
        {
            System.out.println("Se o responsável pela indicação fez sua parte e os aliados trabalharam duro, eles vencerão. TRUE");
        }
        else if (responsavel==true && aliados==false)
        {
            System.out.println("Se o responsável pela indicação fez sua parte e os aliados NÃO trabalharam duro, eles NÃO vencerão. FALSE");
        }
        else if (responsavel==false && aliados==true) {
            System.out.println("Se o responsável pela indicação NÃO fez sua parte e os aliados trabalharam duro, eles NÃO vencerão. FALSE");
        }
        else
        {
            System.out.println("Se o responsável pela indicação NÃO fez sua parte e os aliados NÃO trabalharam duro, eles NÃO vencerão. true");
        }
    }
}
