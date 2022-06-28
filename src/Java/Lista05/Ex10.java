package Java.Lista05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        String[][] velha = new String[3][3];
        Scanner ler = new Scanner(System.in);
        String player1;
        String player2;
        int linhap1;
        int colunap1;
        int linhap2;
        int colunap2;
        int jogadas=1;

        System.out.println("informe seu nome P1");
        player1 = ler.next();
        System.out.println("informe seu nome P2");
        player2 = ler.next();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                velha[i][j]=".";
            }
        }

        while (jogadas<9){
            jogadas++;
            System.out.println("Escolha a linha "+player1);
            linhap1= ler.nextInt();
            System.out.println("Escolha a coluna "+player1);
            colunap1= ler.nextInt();

            while (!jogadaDiferentes(linhap1, colunap1, velha)){
                System.out.println("Joga ja feita escolha outra jogada");
                System.out.println("Escolha a linha "+player1);
                linhap1= ler.nextInt();
                System.out.println("Escolha a coluna "+player1);
                colunap1= ler.nextInt();
            }
            escolheX(linhap1,colunap1,velha);
            imprimiVelha(velha);
            if (verificavelha(velha)){
                System.out.println("deu velha ninguem ganhou");
                break;
            }
            if (verifica(velha)){
                System.out.println(player1+" ganhou !!!");
                break;
            }


            System.out.println("Escolha a linha "+player2);
            linhap2= ler.nextInt();
            System.out.println("Escolha a coluna "+player2);
            colunap2= ler.nextInt();

            while (!jogadaDiferentes(linhap2,colunap2,velha)){
                System.out.println("Joga ja feita escolha outra jogada");
                System.out.println("Escolha a linha "+player2);
                linhap2= ler.nextInt();
                System.out.println("Escolha a coluna "+player2);
                colunap2= ler.nextInt();
            }
            escolhebola(linhap2,colunap2,velha);
            imprimiVelha(velha);
            if (verificavelha(velha)){
                System.out.println("deu velha ninguem ganhou");
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

        for (int i = 0; i < 3; i++) {

            if (count1 == 3) {
                break;
            }
            if (count2 == 3) {
                break;
            }
            if (count3 == 3) {
                break;
            }
            if (count4 == 3) {
                break;
            }
            if (count5 == 3) {
                break;
            }
            if (count6 == 3) {
                break;
            }
            if (count7 == 3) {
                break;
            }
            if (count8 == 3) {
                break;
            }

            count1 = 0;
            count2 = 0;
            count3 = 0;
            count4 = 0;
            for (int j = 0; j < 3; j++) {
                if (x[i][j].equals("X")) {
                    count1++;
                }if (x[i][j].equals("O")) {
                    count2++;
                }
                if (x[j][i].equals("X")) {
                    count3++;
                }
                if (x[j][i].equals("O")) {
                    count4++;
                }
                if (i == j && x[i][j].equals("X") ) {
                    count5++;
                }
                if (i == j && x[i][j].equals("O")) {
                    count6++;
                }
                if (i+j == 2 && x[i][j].equals("X")){
                    count7++;
                }
                if (i+j == 2 && x[i][j].equals("O")){
                    count8++;
                }
            }
        }



        if (count1 == 3) {
            return true;
        }
        if (count2 == 3) {
            return true;
        }
        if (count3 == 3) {
            return true;
        }
        if (count4 == 3) {
            return true;
        }
        if (count5 == 3) {
            return true;
        }
        if (count6 == 3) {
            return true;
        }
        if (count7 == 3) {
            return true;
        }
        return count8 == 3;
    }

    public static void imprimiVelha (String[][] x) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
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
    public static boolean jogadaDiferentes(int f,int c,String[][] x){
        return x[f][c].equals(".");
    }
    public static boolean verificavelha(String[][] x){
        int count=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!(x[i][j].equals("."))){
                    count++;
                }
            }
        }
        return count == 9;
    }
}
