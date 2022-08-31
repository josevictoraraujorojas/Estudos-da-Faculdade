package Java.Lista06;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Ex2 {

     //determina o tamanho do jogo
    public static int jogoTamanho=5;
    //determina o tamanho do navio
    public static int naviosQuantidade =3;
    public static int navioTamanho=3;
    //variável global do tabuleiro com todos os navios
    public  static String[][] hack = criandoTabuleiro();
    //variável global do tabuleiro do jogador
    public static String[][] jogo = criandoTabuleiro();

    //garante jogadas diferente
    public static boolean diferentesJogadas(int f, int c)
    {
        return jogo[f][c].equals("-");
    }
    //atribui o valor do barco
    public static void barcoMostra (int f,int c)
    {
        jogo[f][c]=hack[f][c];
    }
    //atribui o valor bomba para o indicie
    public static void bombaMostra (int f,int c)
    {
        jogo[f][c]="O";
    }
    //verifica se alguma parte foi encontrada
    public static boolean parteEncontrada(int f, int c)
    {
        return hack[f][c].equals("T") || hack[f][c].equals("*") ;
    }

    //cria o tabuleiro do jogo
    public static String[][] criandoTabuleiro()
    {
        String[][] tabuleiro = new String[jogoTamanho][jogoTamanho];
        for (int i = 0; i < jogoTamanho; i++)
        {
            Arrays.fill(tabuleiro[i],"-");
        }
        return tabuleiro;
    }

    //imprimi o tabuleiro
    public static void imprimi(String[][] x)
    {
        for (int i = 1; i <=jogoTamanho; i++)
            System.out.printf("\t%d ", i );
        System.out.println();
        for (int i = 0; i < jogoTamanho; i++)
        {
            System.out.print((i+1)+" | ");
            for (int j = 0; j < jogoTamanho; j++)
            {
                System.out.printf("%s\t", x[i][j]);
            }
            System.out.println();
        }

    }

    //garante que os tres navio foram criado
    public static boolean garanteOsTresNavios(String[][] x,String y)
    {
        int count1=0;
        for (int i = 0; i < jogoTamanho; i++)
        {
            for (int j = 0; j < jogoTamanho; j++)
            {
                if (x [i][j].equals(y) ||x [i][j].equals("*") ){
                    count1++;
                }
            }
        }
        return count1 == navioTamanho*naviosQuantidade;
    }

    //cria os navios com 3 indicies de distância, assim se escolhe o número e depois pega os 2 indicies na frente dele
    //o primeiro número sempre esta entre 0 e 4
    public static void criaBarcos(String[][] x,String y){
        Random r = new Random();
        for (int i = 0; i < naviosQuantidade; i++) {
            int chance= r.nextInt(1,3);
            if (chance==1) {
                int linharandom = r.nextInt(0, jogoTamanho);
                int colunarandom = r.nextInt(0, jogoTamanho - navioTamanho + 1);
                x[linharandom][colunarandom]="*";
                x[linharandom][colunarandom+navioTamanho-1]="*";
                for (int j = 1; j < navioTamanho-1; j++)
                    x[linharandom][colunarandom + j] = y;
            }
            if (chance==2) {
                int linharandom = r.nextInt(0, jogoTamanho - navioTamanho + 1);
                int colunarandom = r.nextInt(0,jogoTamanho);
                x[linharandom+navioTamanho-1][colunarandom]="*";
                x[linharandom][colunarandom]="*";
                for (int j = 1; j < navioTamanho-1; j++)
                    x[linharandom+j][colunarandom] = y;
            }
        }
    }

    //menu do jogo batalha naval
    public static void menu() throws InterruptedException {
        Scanner ler = new Scanner(System.in);
        int linha;
        int coluna;
        int parteBarco =0;
        int jogada=0;

        String y = "T";

        //o laço roda ate que se cria os 3 navios
        do{
            hack=criandoTabuleiro();
            criaBarcos(hack,y);
        }while(!garanteOsTresNavios(hack,y));

        imprimi(hack);

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