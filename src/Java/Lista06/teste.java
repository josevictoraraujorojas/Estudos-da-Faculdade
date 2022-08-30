package Java.Lista06;

import java.util.Arrays;
import java.util.Random;

public class teste {
 public static    int jogoTamanho=7;
    public static  int quantidadeNavio=6;
    public static   int navioTamanho=2;
    public static void main(String[] args) {

        String y = "*-*";
        int jogoTamanho=7;
        int navioTamanho=4;
        int quantidadeNavio=5;

        String[][] x = new String[7][7];

      do{
           x=criandoTabuleiro();
           criacao(x,y);
       }while (!garanteOsTresNavios(x));
        imprimi(x);
    }
    public static void imprimi(String[][] x)
    {
        for (int i = 1; i <=jogoTamanho; i++)
            System.out.printf("\t %d", i );
        System.out.println();
        for (int i = 0; i < jogoTamanho; i++)
        {
            System.out.print((i+1)+" | ");
            for (int j = 0; j < jogoTamanho; j++)
            {
                System.out.printf("%s\t", x[i][j]);
            }
            System.out.println();
        }

    }
    public static String[][] criandoTabuleiro()
    {
        String[][] tabuleiro = new String[jogoTamanho][jogoTamanho];
        for (int i = 0; i < jogoTamanho; i++)
        {
            Arrays.fill(tabuleiro[i]," - ");
        }
        return tabuleiro;
    }
    public static boolean garanteOsTresNavios(String[][] x)
    {
        int count1=0;
        for (int i = 0; i < jogoTamanho; i++)
        {
            for (int j = 0; j < jogoTamanho; j++)
            {
                    if (x [i][j].equals("*-*") ){
                        count1++;
                    }
            }
        }
        return count1 == navioTamanho*quantidadeNavio;
    }
    public static void criacao(String[][] x,String y){
        Random r = new Random();
        for (int i = 0; i < quantidadeNavio; i++) {
            int linharandom = r.nextInt(0, jogoTamanho);
            int colunarandom = r.nextInt(0, jogoTamanho - navioTamanho + 1);
            for (int j = 0; j < navioTamanho; j++)
                x[linharandom][colunarandom + j] = y;
        }
    }
}
