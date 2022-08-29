package Java.Lista06;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Ex2 {
    public  static String[][] tabuleiro = criandoTabuleiro();
    public static String[][] jogo = criandoTabuleiro();

    public static boolean diferentesJogadas(int f, int c)
    {
        return jogo[f][c].equals(" - ");
    }
    public static void barcoMostra (int f,int c)
    {
        jogo[f][c]=tabuleiro[f][c];
    }
    public static void bombaMostra (int f,int c)
    {
        jogo[f][c]=" * ";
    }
    public static boolean parteEncontrada(int f, int c)
    {
        return tabuleiro[f][c].equals("_Î_") || tabuleiro[f][c].equals("-Y-") ||tabuleiro[f][c].equals("-T-") ;
    }
    public static int barcosDestruidos()
    {
        int[] contadorDeBarcos={0,0,0};
        int barco=0;
        for (int i = 0; i < 5 ; i++) {
            Arrays.fill(contadorDeBarcos,0);
            for (int j = 0; j < 5 ; j++) {
                if (jogo[i][j].equals("_Î_")||jogo[j][i].equals("_Î_")) {
                    contadorDeBarcos[0]++;
                }
                 if (jogo[i][j].equals("-Y-")||jogo[j][i].equals("-Y-")){
                    contadorDeBarcos[1]++;
                }
                 if (jogo[i][j].equals("-T-")||jogo[j][i].equals("-T-")){
                    contadorDeBarcos[2]++;
                }
            }
            if (contadorDeBarcos[0]==3||contadorDeBarcos[1]==3||contadorDeBarcos[2]==3) {
                barco++;
            }
        }
        return barco;
    }

    public static String[][] criandoTabuleiro(){
        String[][] tabuleiro = new String[5][5];
        for (int i = 0; i < 5; i++) {
            Arrays.fill(tabuleiro[i]," - ");
        }
        return tabuleiro;
    }
    //imprimi o tabuleiro

    public static void imprimi(String[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.printf("%s\t", x[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean garanteOsTresNavios()
    {
        int count1=0;
        int count2=0;
        int count3=0;

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                switch (tabuleiro[i][j]) {
                    case "_Î_" -> count1++;
                    case "-Y-" -> count2++;
                    case "-T-" -> count3++;
                }
            }
        }
        return count1 == 3 && count2 == 3 && count3 == 3;
    }

    //cria os navios com 3 indicies de distância, foi feito pegando o número anterior e o próximo
    public static void criaBarcos (String y)
    {
        Random r = new Random();
        int posssibilidade = r.nextInt( 1,3);
        int linharandom;
        int colunarandom;
        //linha

            if (posssibilidade == 1) {
                linharandom = r.nextInt(0, 5);
                colunarandom = r.nextInt(0, 3);
                for (int i = 0; i < 3; i++)
                tabuleiro[linharandom][colunarandom + i] = y;

            }
            if (posssibilidade == 2) {
                linharandom = r.nextInt(0, 3);
                colunarandom = r.nextInt(0, 5);
                for (int i = 0; i < 3; i++)
                    tabuleiro[linharandom+i][colunarandom] = y;
            }
        }
        public static void menu() throws InterruptedException {
            Scanner ler = new Scanner(System.in);
            int linha;
            int coluna;
            int parteBarco =0;
            int jogada=0;
            String primeiroBarco="_Î_";
            String segundoBarco="-Y-";
            String terceiroBarco="-T-";


            //o laço roda ate que se cria os 3 navios
            do
            {
                //zera o tabuleiro caso ele perca um navio
                tabuleiro = criandoTabuleiro();
                criaBarcos(primeiroBarco);
                criaBarcos(segundoBarco);
                criaBarcos(terceiroBarco);
                garanteOsTresNavios();
            }while (!garanteOsTresNavios());
            imprimi(tabuleiro);


            //menu do jogo
            System.out.println("Você está jogando batalha naval");
            System.out.println("Neste jogo você tem que afundar tres navios");
            imprimi(jogo);

            //termina o jogo quando todas as partes dos barcos forem destruídas
            while (parteBarco!=9)
            {
                //faz a jogada
                jogada++;
                Thread.sleep(1000);
                System.out.println("Jogada: " + jogada);
                Thread.sleep(1000);
                System.out.println("escolha uma coordenada para jogar a bomba");
                linha = ler.nextInt();
                coluna = ler.nextInt();
                linha -= 1;
                coluna -= 1;

                //verifica se a jogada é diferente
                while (!diferentesJogadas(linha, coluna)) {
                    System.out.println("Jogada ja feita escolha outra jogada");
                    System.out.println("Escolha a linha e a coluna ");
                    linha = ler.nextInt();
                    coluna = ler.nextInt();
                    linha -= 1;
                    coluna -= 1;
                }


                if (parteEncontrada(linha, coluna))
                {
                    parteBarco++;
                    Thread.sleep(1000);
                    System.out.println("total de partes destruída " + parteBarco);
                    Thread.sleep(1000);
                    barcoMostra(linha, coluna);
                    Thread.sleep(1000);
                    System.out.println("Total de barcos afundados: "+barcosDestruidos());
                    Thread.sleep(1000);
                } else
                {
                    bombaMostra(linha, coluna);
                    Thread.sleep(1000);
                    System.out.println("Nenhum barco encontrado");
                }
                Thread.sleep(1000);
                imprimi(jogo);

            }
            Thread.sleep(1000);
            System.out.println("Parabens capitão!!!! voce destruiu todos os navios");
        }


    //cria o tabuleiro
    public static void main(String[] args) throws InterruptedException {
        menu();
    }
}