package Java.Lista06;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String[][] jogo = new String[3][3];
        Scanner ler = new Scanner(System.in);

        String player1;
        String player2;
        int linhap1;
        int colunap1;
        int linhap2;
        int colunap2;

        System.out.println("informe seu nome P1");
        player1 = ler.next();
        System.out.println("informe seu nome P2");
        player2 = ler.next();

        for (int i = 0; i < 3; i++) {

            Arrays.fill(jogo[i],".");
        }

        while (true)
        {
            //jogada do player1
            System.out.println("Escolha a linha e a coluna "+player1);
            linhap1= ler.nextInt();
            colunap1= ler.nextInt();
            linhap1-=1;
            colunap1-=1;

            //verifica se a jogada do player1 pode ser feita
            while (!diferentesJogadas(linhap1, colunap1, jogo))
            {
                System.out.println("Jogada ja feita escolha outra jogada");
                System.out.println("Escolha a linha e a coluna "+player1);
                linhap1= ler.nextInt();
                colunap1= ler.nextInt();
                linhap1-=1;
                colunap1-=1;
            }

            //faz a jogada do player1 e depois imprimi o jogo
            xEscolha(linhap1,colunap1, jogo);
            imprimi(jogo);

            //verificação se o player1 ganhou o jogo ou se deu velha
            if (Velha(jogo))
            {
                System.out.println("deu velha ninguém ganhou");
                break;
            }
            if (linha(jogo)||coluna(jogo)||principalDiagonal(jogo)||secundaria(jogo))
            {
                System.out.println(player1+" ganhou !!!");
                break;
            }

            //jogada do player2
            System.out.println("Escolha a linha e a coluna "+player2);
            linhap2= ler.nextInt();
            colunap2= ler.nextInt();
            linhap2-=1;
            colunap2-=1;

            //verifica se a jogada do player2 pode ser feita
            while (!diferentesJogadas(linhap2,colunap2, jogo))
            {
                System.out.println("Jogada ja feita escolha outra jogada");
                System.out.println("Escolha a linha e a coluna "+player2);
                linhap2= ler.nextInt();
                colunap2= ler.nextInt();
                linhap2-=1;
                colunap2-=1;
            }

            //faz a jogada do player2 e depois imprimi o jogo
            bolaEscolha(linhap2,colunap2, jogo);
            imprimi(jogo);

            //verificação se o player2 ganhou o jogo ou se deu velha
            if (Velha(jogo)){
                System.out.println("deu velha ninguém ganhou");
                break;
            }
            if (linha(jogo)||coluna(jogo)||principalDiagonal(jogo)||secundaria(jogo))
            {
                System.out.println(player2+" ganhou !!!");
                break;
            }
        }
    }

//    Imprimi o jogo
    public static void imprimi(String[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.printf("%s\t", x[i][j]);
            }
            System.out.println();
        }
    }

//    verifica se deu velha
    public static boolean Velha(String[][] x){
        int count=0;
        for (int i = 0; i < x.length; i++)
        {
            for (int j = 0; j < x[0].length; j++)
            {
                if (!(x[i][j].equals(".")))
                {
                    count++;
                }
            }
        }
        return count == 9;
    }

    //faz a jogada do x
    public static void xEscolha(int f, int c, String[][] x) {
        x[f][c] = "X";
    }

    //faz a jogada da bola
    public static void bolaEscolha(int f, int c, String[][] x) {
        x[f][c] = "O";
    }

    //verifica se as jogadas são diferente
    public static boolean diferentesJogadas(int f, int c, String[][] x) {
        return x[f][c].equals(".");
    }

    //Verifica se ganhou pela linha
    public static boolean linha(String[][] y) {
        int bola = 0;
        int x = 0;
        for (int i = 0; i < y.length; i++) {
            if (bola == y.length) {
                break;
            } else if (x == y.length) {
                break;
            }
            bola = 0;
            x = 0;
            for (int j = 0; j < y[0].length; j++) {

                if (y[i][j].equals("X"))
                {
                    x++;
                } else if (y[i][j].equals("O"))
                {
                    bola++;
                }
            }
        }
        if (bola == y.length)
        {
            return true;
        } else return x == y.length;
    }

    //Verifica se ganhou pela coluna
    public static boolean coluna(String[][] y) {
        int bola = 0;
        int x = 0;
        for (int i = 0; i < y.length; i++)
        {
            if (bola == y.length) {
                break;
            } else if (x == y.length) {
                break;
            }
            bola = 0;
            x = 0;
            for (int j = 0; j < y[0].length; j++)
            {

                if (y[j][i].equals("X") )
                {
                    x++;
                }
                else if (y[j][i].equals("O") )
                {
                    bola++;
                }
            }
        }
        if (bola == y.length)
        {
            return true;
        } else return x == y.length;
    }

    //Verifica se ganhou pela diagonal principal
    public static boolean principalDiagonal(String[][] y) {
        int bola = 0;
        int x = 0;
        for (int i = 0; i < y.length; i++)
        {
            if (bola == y.length)
            {
                break;
            } else if (x == y.length)
            {
                break;
            }

            for (int j = 0; j < y[0].length; j++)
            {

                if (i == j && y[i][j].equals("X") )
                {
                    x++;
                }
                else if (i == j && y[i][j].equals("O"))
                {
                    bola++;
                }
            }
        }
        if (bola == y.length)
        {
            return true;
        } else return x == y.length;
    }

    //Verifica se ganhou pela diagonal secundaria
    public static boolean secundaria(String[][] y) {
        int bola = 0;
        int x = 0;
        for (int i = 0; i < y.length; i++)
        {
            if (bola == y.length)
            {
                break;
            } else if (x == y.length)
            {
                break;
            }

            for (int j = 0; j < y[0].length; j++)
            {

                if (i+j == 2 && y[i][j].equals("X"))
                {
                    x++;
                }
                else if (i+j == 2 && y[i][j].equals("O"))
                {
                    bola++;
                }
            }
        }
        if (bola == y.length)
        {
            return true;
        } else return x == y.length;
    }
}