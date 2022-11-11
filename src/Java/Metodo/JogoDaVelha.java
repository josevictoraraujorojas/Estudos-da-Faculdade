package Java.Metodo;
import java.util.Arrays;
import java.util.Scanner;
public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] fimDoJogo= new int[1];
        String[][] jogo = new String[3][3];

        String x="X";
        String bola="O";
        String player1;
        String player2;

        System.out.println("informe seu nome P1");
        player1 = ler.next();
        System.out.println("informe seu nome P2");
        player2 = ler.next();

        for (int i = 0; i < 3; i++) {
            Arrays.fill(jogo[i],".");
        }

        //rodando o jogo
        while (fimDoJogo[0]!=1)
        {
            //player1
            menu(jogo,player1,x,fimDoJogo);
            //player2
            menu(jogo,player2,bola,fimDoJogo);
        }
    }

//    menu do jogo
    public static void menu(String[][] jogo,String player,String jogada,int[] y){
        Scanner ler = new Scanner(System.in);
        int linha;
        int coluna;

        System.out.println("Escolha a linha e a coluna "+player);
        linha= ler.nextInt();
        coluna= ler.nextInt();
        linha-=1;
        coluna-=1;

        //verifica se a jogada do "player" pode ser feita
        while (!diferentesJogadas(linha, coluna, jogo))
        {
            System.out.println("Jogada ja feita escolha outra jogada");
            System.out.println("Escolha a linha e a coluna "+player);
            linha= ler.nextInt();
            coluna= ler.nextInt();
            linha-=1;
            coluna-=1;
        }

        //faz a jogada do player e depois imprimi o jogo
        escolha(jogada,linha,coluna, jogo);
        imprimi(jogo);

        //verificação se o "player" ganhou o jogo ou se deu velha
        if (Velha(jogo))
        {
            System.out.println("deu velha ninguém ganhou");
            y[0]=1;
        }
        if (linha(jogo)||coluna(jogo)||principalDiagonal(jogo)||secundaria(jogo))
        {
            System.out.println(player+" ganhou !!!");
            y[0]=1;
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
    public static void escolha(String y, int f, int c, String[][] x) {
        x[f][c] = y;
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