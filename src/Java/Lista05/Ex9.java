package Java.Lista05;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        String[][] assentos = new String[3][4];
        Scanner ler = new Scanner(System.in);
        String nome;
        int fila;
        int coluna;


        System.out.println("Bem vindo. No nosso cinema temos 3 fileiras com 4 colunas de assento");
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                assentos[i][j]=".";
            }
        }
        imprimiAssentos(assentos);

        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.println("Faça sua reserva");
                System.out.print("informe seu nome:");
                nome= ler.next();
                System.out.print("informe a fila do seu assento:");
                fila= ler.nextInt();
                System.out.print("informe a coluna do seu assento:");
                coluna= ler.nextInt();
                fila-=1;
                coluna-=1;
                while (!verificaAssento(fila, coluna, assentos)){
                    System.out.println("Esse assento ja esta ocupado informe novamente");
                    System.out.print("informe seu nome:");
                    nome= ler.next();
                    System.out.print("informe a fila do seu assento:");
                    fila= ler.nextInt();
                    System.out.print("informe a coluna do seu assento:");
                    coluna= ler.nextInt();
                    fila-=1;
                    coluna-=1;
                }
                inicializaReserva(nome,fila,coluna,assentos);
                System.out.println("Mapa dos assentos");
                imprimiAssentos(assentos);

            }
        }


    }
    public static void imprimiAssentos (String[][] x) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%s\t             ", x[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean verificaAssento(int f,int c,String[][] x){
        if (x[f][c].equals(".")){
             return true;
        }else {
             return false;
        }
    }

    public static void inicializaReserva (String n ,int f,int c,String[][] x) {
        x[f][c]=n;
    }
}
