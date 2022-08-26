package Java.Lista06;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Ex2 {

    public static void main(String[] args) throws InterruptedException {
        Scanner ler = new Scanner(System.in);
        String[][] tabuleiro = criandoTabuleiro();
        String[][] jogo = criandoTabuleiro();
        int[] verificacao = new int[1];
        int linha;
        int coluna;
        int parteBarco =0;
        int jogada=0;
        String primeiroBarco="_Î_";
        String segundoBarco="-Y-";
        String terceiroBarco="-T-";


        //o laço roda ate que se cria 9 "/"
        do
        {
            //zera o tabuleiro caso ele passe de 9 "/"
            tabuleiro = criandoTabuleiro();


            criaBarcos(tabuleiro,primeiroBarco);
            criaBarcos(tabuleiro,segundoBarco);
            criaBarcos(tabuleiro,terceiroBarco);


            tresNavios(tabuleiro,verificacao);

        }while (verificacao[0]!=1);
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
            while (!diferentesJogadas(linha, coluna, jogo)) {
                System.out.println("Jogada ja feita escolha outra jogada");
                System.out.println("Escolha a linha e a coluna ");
                linha = ler.nextInt();
                coluna = ler.nextInt();
                linha -= 1;
                coluna -= 1;
            }


            if (verificaParteDoBarco(linha, coluna, tabuleiro))
            {
                parteBarco++;
                Thread.sleep(1000);
                System.out.println("total de partes destruída " + parteBarco);
                Thread.sleep(1000);
                mostrabarco(linha, coluna, jogo,tabuleiro);
                Thread.sleep(1000);
                System.out.println("Total de barcos afundados: "+barcoDestruido(jogo));
                Thread.sleep(1000);
            } else
            {
                escolhebomba(linha, coluna, jogo);
                Thread.sleep(1000);
                System.out.println("Nenhum barco encontrado");
            }

            Thread.sleep(1000);
            imprimi(jogo);
        }
        System.out.println("Parabens capitão!!!! voce destruiu todos os navios em "+jogada+" jogadas");
    }
    public static boolean diferentesJogadas(int f, int c, String[][] x)
    {
        return x[f][c].equals(" - ");
    }
    public static boolean verificaParteDoBarco(int f, int c, String[][] x)
    {
        return x[f][c].equals("_Î_") || x[f][c].equals("-Y-") ||x[f][c].equals("-T-")  ;
    }
    public static int barcoDestruido(String[][] x)
    {
        int primeiroBarco=0;
        int segundoBarco=0;
        int terceiroBarco=0;
        int barco=0;
        for (int i = 0; i < 5 ; i++) {
            primeiroBarco=0;
            segundoBarco=0;
            terceiroBarco=0;
            for (int j = 0; j < 5 ; j++) {
                if (x[i][j].equals("_Î_")){
                    primeiroBarco++;
                }else if (x[j][i].equals("_Î_")){
                    primeiroBarco++;
                }
                if (x[i][j].equals("-Y-")){
                    segundoBarco++;
                }else if (x[j][i].equals("-Y-")){
                    segundoBarco++;
                }
                if (x[i][j].equals("-T-")){
                    terceiroBarco++;
                }else if (x[j][i].equals("-T-")){
                    terceiroBarco++;
                }

            }
            if (primeiroBarco==3 || segundoBarco==3 || terceiroBarco==3) {
                barco++;
            }
        }
        return barco;
    }
    public static void escolhebomba (int f,int c,String[][] x)
    {
        x[f][c]=" * ";
    }
    public static void mostrabarco (int f,int c,String[][] x,String[][]y)
    {
        x[f][c]=y[f][c];
    }

    //certifica que terão 3 navios no jogo
    public static void tresNavios (String[][] x,int[] y)
    {
        int count1=0;
        int count2=0;
        int count3=0;

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if (x[i][j].equals("_Î_"))
                {
                    count1++;
                }
                if (x[i][j].equals("-Y-"))
                {
                    count2++;
                }
                if (x[i][j].equals("-T-"))
                {
                    count3++;
                }
            }
        }
        if (count1 == 3 && count2 == 3 && count3 == 3){
            y[0]=1;
        }
    }

    //cria os navios com 3 indicies de distância, fiz isso eliminando o primeiro e o último indice
    //assim atribuindo um valor aleatório depois pegando o número anterior e o da frente
    public static void criaBarcos (String[][] x,String y)
    {
        Random r = new Random();
        int posssibilidadeLinha = r.nextInt( 1,3);
            //linha possibilidade 1
            if (posssibilidadeLinha == 1 )
            {
                int linharandom= r.nextInt(0,5);
                int colunarandom= r.nextInt(1,4);
                x[linharandom][colunarandom-1] = y;
                x[linharandom][colunarandom] = y;
                x[linharandom][colunarandom+1] = y;
            }
            //coluna possibilidade 2
            if (posssibilidadeLinha == 2 )
            {
                int linharandom= r.nextInt(1,4);
                int colunarandom= r.nextInt(0,5);
                x[linharandom-1][colunarandom] = y;
                x[linharandom][colunarandom] = y;
                x[linharandom+1][colunarandom] = y;
            }
    }

    //cria o tabuleiro
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
}
