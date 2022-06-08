package Lista03;

import java.util.Random;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
//        Questão 14 Faça um programa que simule um jogo de dados. O jogo precisa de dois participantes (peça o
//        nome dos jogadores). A cada rodada, cada participante deve sortear um número para o seu dado (use a classe
//                Random). Se o valor sorteado pelo jogador 1 for maior que o valor sorteado pelo jogador 2, o jogador 1 ganha 1 ponto.
//                Se o valor sorteado pelo jogador 2 for maior que o valor sorteado pelo jogador 1, o jogador 2 ganha 1 um. Se o
//        número sorteado nos dois dados forem iguais, ninguém pontua. O jogo acaba quando um jogador ganha
//        pontuando 11 pontos. Ao final do jogo exiba uma mensagem de parabéns ao jogador que ganhou e informe a
//        pontuação de cada jogador naquela rodada.

        String player1;
        String player2;
        String inutil1;
        String inutil2;
        String jogar;
        int dado1;
        int dado2;
        int ponto1;
        int ponto2;
        Scanner ler = new Scanner(System.in);
        Random r = new Random();
        dado1=0;
        dado2=0;
        ponto1 = 0;
        ponto2 = 0;

        System.out.println("informe o nome do player1:");
        player1 = ler.next();
        System.out.println("bem vindo player1: " + player1);
        System.out.println("informe o nome do player2:");
        player2 = ler.next();
        System.out.println("bem vindo player2: " + player2);
        System.out.println("Este e um jogo de dados, o player que tirar o maior numero ganha 1 ponto, o jogo termina quando algum dos players tiver 11 pontos");
                System.out.println("para jogar o dado basta ecrever dado");

        while (ponto1<11 && ponto2<11)
        {
            System.out.println("jogue o dado " + player1);
            inutil1 = ler.next();
            while (!(inutil1.equals("dado"))) {
                System.out.println("resposta invalida");
                System.out.println("jogue o dado " + player1);
                inutil1 = ler.next();
            }
            System.out.println(player1 + " jogou o dado e deu:");
            dado1 = r.nextInt(6) + 1;
            System.out.println(dado1);
            System.out.println(" jogue o dado " + player2);
            inutil2 = ler.next();
            while (!(inutil2.equals("dado"))) {
                System.out.println("resposta invalida");
                System.out.println("jogue o dado " + player2);
                inutil2 = ler.next();
            }
            System.out.println(player2 + " jogou o dado e deu:");
            dado2 = r.nextInt(6) + 1;
            System.out.println(dado2);
            if (dado1 > dado2) {
                ponto1++;
                System.out.println(player1 + " ganhou");
                System.out.println(player1 + " esta com " + ponto1 + " pontos");
            } else if (dado2 > dado1) {
                ponto2++;
                System.out.println(player2 + " ganhou");
                System.out.println(player2 + " esta com " + ponto2 + " pontos");
            } else {
                System.out.println("deu empate, ninguem pontuou nessa rodada");
            }
            if (ponto1 == 11) {
                System.out.println(player1 + " ganhou!!!!!");
            } else if (ponto2 == 11) {
                System.out.println(player2 + " ganhou!!!!!");
            }
        }
    }
}
