package Java.Periodo1.ArrayBidimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
//        Questão 9 Escreva um programa que simule reservas de assentos em um cinema.  Vamos considerar uma sala com 3  fileiras  de  4  lugares  cada.   Defina  uma  matriz  de  3  contador  4  que  represente  a  sala.   O  programa  se  repete  até  que  o usuário digite 0 0 0 ou até que todos os assentos sejam ocupados.
//
//        Em  cada  execução  do  programa,  um  nome,  numero  de  fila  e  numero  de  assento  são  lidos.
//        Se  o  assento  ainda estiver  disponível,  o  nome  será  armazenado  na  linha  e  coluna  correspondentes  da  matriz.
//        Se  o  assento  já  estiver ocupado, o programa imprime “ocupado”.
//        Após cada reserva de assento, todas as reservas são impressas na tela.

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
            System.out.println("Fa�a sua reserva");
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

