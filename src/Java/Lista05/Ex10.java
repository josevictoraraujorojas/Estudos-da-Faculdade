package Java.Lista05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
//        Questão 10 Volte as suas respostas do exercício 5. Desenvolva um jogo da velha completo.

        String[][] velha = new String[3][3];
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

            Arrays.fill(velha[i],".");
        }

        while (true){
            System.out.println("Escolha a linha e a coluna "+player1);
            linhap1= ler.nextInt();
            colunap1= ler.nextInt();
            linhap1-=1;
            colunap1-=1;

            while (!jogadasDiferentes(linhap1, colunap1, velha)){
                System.out.println("Joga ja feita escolha outra jogada");
                System.out.println("Escolha a linha e a coluna "+player1);
                linhap1= ler.nextInt();
                colunap1= ler.nextInt();
                linhap1-=1;
                colunap1-=1;
            }

            escolheX(linhap1,colunap1,velha);
            imprimiVelha(velha);

            if (verificaVelha(velha)){
                System.out.println("deu velha ninguém ganhou");
                break;
            }
            if (verifica(velha)){
                System.out.println(player1+" ganhou !!!");
                break;
            }


            System.out.println("Escolha a linha e a coluna "+player2);
            linhap2= ler.nextInt();
            colunap2= ler.nextInt();
            linhap2-=1;
            colunap2-=1;

            while (!jogadasDiferentes(linhap2,colunap2,velha)){
                System.out.println("Joga ja feita escolha outra jogada");
                System.out.println("Escolha a linha e a coluna "+player2);
                linhap2= ler.nextInt();
                colunap2= ler.nextInt();
                linhap2-=1;
                colunap2-=1;
            }

            escolhebola(linhap2,colunap2,velha);
            imprimiVelha(velha);

            if (verificaVelha(velha)){
                System.out.println("deu velha ninguém ganhou");
                break;
            }
            if (verifica(velha)){
                System.out.println(player2+" ganhou !!!");
                break;
            }
        }
    }

    public static boolean verifica(String[][] x) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;

        for (int i = 0; i < x.length; i++) {

            if (count1 == x.length) {
                break;
            }
            else if (count2 == x.length) {
                break;
            }
            else if (count3 == x.length) {
                break;
            }
            else if (count4 == x.length) {
                break;
            }
            else if (count5 == x.length) {
                break;
            }
            else if (count6 == x.length) {
                break;
            }
            else if (count7 == x.length) {
                break;
            }
            else if (count8 == x.length) {
                break;
            }

            count1 = 0;
            count2 = 0;
            count3 = 0;
            count4 = 0;
            for (int j = 0; j < x[0].length; j++) {
                if (x[i][j].equals("X"))
                {
                    count1++;
                }else if (x[i][j].equals("O"))
                {
                    count2++;
                }
                else if (x[j][i].equals("X") )
                {
                    count3++;
                }
                else if (x[j][i].equals("O") )
                {
                    count4++;
                }
                else if (i == j && x[i][j].equals("X") )
                {
                    count5++;
                }
                else if (i == j && x[i][j].equals("O"))
                {
                    count6++;
                }
                else if (i+j == 2 && x[i][j].equals("X"))
                {
                    count7++;
                }
                else if (i+j == 2 && x[i][j].equals("O"))
                {
                    count8++;
                }
            }
        }

        if (count1 == x.length)
        {
            return true;
        }
        else if (count2 == x.length)
        {
            return true;
        }
        else if (count3 == x.length)
        {
            return true;
        }
        else if (count4 == x.length)
        {
            return true;
        }
        else if (count5 == x.length)
        {
            return true;
        }
        else if (count6 == x.length)
        {
            return true;
        }
        else if (count7 == x.length)
        {
            return true;
        }
        return count8 == x.length;
    }

    public static void imprimiVelha (String[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.printf("%s\t", x[i][j]);
            }
            System.out.println();
        }
    }

    public static void escolheX (int f,int c,String[][] x) {
        x[f][c]="X";
    }

    public static void escolhebola (int f,int c,String[][] x) {
        x[f][c]="O";
    }

    public static boolean jogadasDiferentes(int f,int c,String[][] x){
        return x[f][c].equals(".");
    }

    public static boolean verificaVelha(String[][] x){
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
}