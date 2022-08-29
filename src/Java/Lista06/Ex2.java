package Java.Lista06;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Ex2 {

     //determina o tamanho do jogo
    public static int jogoTamanho=5;
    //determina o tamanho do navio
    public static int navioTamanho=3;
    public static int naviosQuantidade=3;
    //variável global do tabuleiro com todos os navios
    public  static String[][] tabuleiro = criandoTabuleiro();
    //variável global do tabuleiro do jogador
    public static String[][] jogo = criandoTabuleiro();

    //garante jogadas diferente
    public static boolean diferentesJogadas(int f, int c)
    {
        return jogo[f][c].equals(" - ");
    }
    //atribui o valor do barco
    public static void barcoMostra (int f,int c)
    {
        jogo[f][c]=tabuleiro[f][c];
    }
    //atribui o valor bomba para o indicie
    public static void bombaMostra (int f,int c)
    {
        jogo[f][c]=" * ";
    }
    //verifica se alguma parte foi encontrada
    public static boolean parteEncontrada(int f, int c)
    {
        return tabuleiro[f][c].equals("_Î_") || tabuleiro[f][c].equals("-Y-") ||tabuleiro[f][c].equals("-T-") ;
    }

    //cria o tabuleiro do jogo
    public static String[][] criandoTabuleiro()
    {
        String[][] tabuleiro = new String[jogoTamanho][jogoTamanho];
        for (int i = 0; i < jogoTamanho; i++)
        {
            Arrays.fill(tabuleiro[i]," - ");
        }
        return tabuleiro;
    }

    //imprimi o tabuleiro
    public static void imprimi(String[][] x)
    {
        for (int i = 0; i < jogoTamanho; i++)
        {
            for (int j = 0; j < jogoTamanho; j++)
            {
                System.out.printf("%s\t", x[i][j]);
            }
            System.out.println();
        }
    }

    //garante que os tres navio foram criado
    public static boolean garanteOsTresNavios()
    {
        int count1=0;
        int count2=0;
        int count3=0;

        for (int i = 0; i < jogoTamanho; i++)
        {
            for (int j = 0; j < jogoTamanho; j++)
            {
                switch (tabuleiro[i][j])
                {
                    case "_Î_" -> count1++;
                    case "-Y-" -> count2++;
                    case "-T-" -> count3++;
                }
            }
        }
        return count1 == navioTamanho && count2 == navioTamanho && count3 == navioTamanho;
    }

    //faz a contagem dos barcos destruídos
    public static int barcosDestruidos()
    {
        int[] contadorDeBarcos = new int[naviosQuantidade];
        int barco=0;
        for (int i = 0; i < jogoTamanho; i++)
        {
            Arrays.fill(contadorDeBarcos,0);
            for (int j = 0; j < jogoTamanho ; j++)
            {
                if (jogo[i][j].equals("_Î_")||jogo[j][i].equals("_Î_"))
                {
                    contadorDeBarcos[0]++;
                }
                if (jogo[i][j].equals("-Y-")||jogo[j][i].equals("-Y-"))
                {
                    contadorDeBarcos[1]++;
                }
                if (jogo[i][j].equals("-T-")||jogo[j][i].equals("-T-"))
                {
                    contadorDeBarcos[2]++;
                }
            }
            if (contadorDeBarcos[0]==navioTamanho||contadorDeBarcos[1]==navioTamanho||contadorDeBarcos[2]==navioTamanho)
            {
                barco++;
            }
        }
        return barco;
    }

    //cria os navios com 3 indicies de distância, assim se escolhe o número e depois pega os 2 indicies na frente dele
    //o primeiro número sempre esta entre 0 e 2
    public static void criaBarcos (String y)
    {
        Random r = new Random();
        int posssibilidade = r.nextInt( 1,3);
        int linharandom;
        int colunarandom;
        //linha

        if (posssibilidade == 1)
        {
            linharandom = r.nextInt(0, jogoTamanho);
            colunarandom = r.nextInt(0, jogoTamanho-navioTamanho+1);
            for (int i = 0; i < navioTamanho; i++)
                tabuleiro[linharandom][colunarandom + i] = y;

        }
        if (posssibilidade == 2)
        {
            linharandom = r.nextInt(0, jogoTamanho-navioTamanho+1);
            colunarandom = r.nextInt(0, jogoTamanho);
            for (int i = 0; i < navioTamanho; i++)
                tabuleiro[linharandom+i][colunarandom] = y;
        }
    }

    //menu do jogo batalha naval
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
        while (parteBarco!=navioTamanho*naviosQuantidade)
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
            while (!diferentesJogadas(linha, coluna))
            {
                System.out.println("Jogada ja feita escolha outra jogada");
                System.out.println("Escolha a linha e a coluna ");
                linha = ler.nextInt();
                coluna = ler.nextInt();
                linha -= 1;
                coluna -= 1;
            }

            //verifica se alguma parte do barco foi encontrada
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
            }
            //se nenhuma parte foi encontrada ele considera como bomba
            else
            {
                bombaMostra(linha, coluna);
                Thread.sleep(1000);
                System.out.println("Nenhum barco encontrado");
            }
            Thread.sleep(1000);
            imprimi(jogo);

        }
        //fim do jogo
        Thread.sleep(1000);
        System.out.println("Parabens capitão!!!! voce destruiu todos os navios");
    }

    public static void main(String[] args) throws InterruptedException {
        menu();
    }
}
