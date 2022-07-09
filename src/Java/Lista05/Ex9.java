package Java.Lista05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        String[][] assentos = new String[3][4];
        Scanner ler = new Scanner(System.in);
        String nome;
        int fila;
        int coluna;
        int cheio =0;


        System.out.println("Bem vindo. No nosso cinema temos 3 fileiras com 4 colunas de assento");
        for (int i=0;i<3;i++){
            Arrays.fill(assentos[i],".");
        }
        imprimiAssentos(assentos);

        do {
            cheio++;
            System.out.println("Faça sua reserva");
            System.out.print("informe seu nome a fileira e a coluna:");
            nome = ler.next();
            fila = ler.nextInt();
            coluna = ler.nextInt();

            while (!verificaAssento(fila, coluna, assentos)) {
                System.out.print("informe seu nome a fileira e a coluna:");
                nome = ler.next();
                fila = ler.nextInt();
                coluna = ler.nextInt();
            }
            inicializaReserva(nome, fila, coluna, assentos);
            System.out.println("Mapa dos assentos");
            imprimiAssentos(assentos);

        }while (!(cheio==12||nome.equals("0")&&fila==0&&coluna==0));
        System.out.println("fim do programa");

    }

    public static void imprimiAssentos (String[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.printf("%s\t", x[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean verificaAssento(int f,int c,String[][] x){
        return x[f][c].equals(".");
    }

    public static void inicializaReserva (String n ,int f,int c,String[][] x) {
        x[f][c]=n;
    }
}

