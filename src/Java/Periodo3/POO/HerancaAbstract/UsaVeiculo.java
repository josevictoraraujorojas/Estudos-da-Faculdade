package Java.Periodo3.POO.HerancaAbstract;

public class UsaVeiculo {
    public static void main(String[] args) {
        Aviao aviao = new Aviao();
        aviao.ligar();
        System.out.println(aviao.status);
        aviao.acelerar();
        System.out.println(aviao.velocidade);
        aviao.desligar();
        System.out.println(aviao.status);

        Automovel automovel = new Automovel();
        automovel.ligar();
        System.out.println(automovel.status);
        automovel.acelerar();
        System.out.println(automovel.velocidade);
        automovel.desligar();
        System.out.println(automovel.status);
    }
}
