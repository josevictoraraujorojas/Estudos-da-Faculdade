package Java.TerceiroPeriodo.POO.Composicao;

public class Main {
    public static void main(String[] args) {

        Direcao direcao = new Direcao("preto",20,true);
        Motor motor = new Motor(200,"gasolina","314121231");
        Automovel automovel = new Automovel(motor,direcao);

        System.out.println("----Automovel----");
        System.out.println(automovel);


    }
}
