package Java.TerceiroPeriodo.POO;

public class UsaCarro {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("jose","preto","magro",18);
        Carro c = new Carro(p,"gol","vermelho","101909",4);
        System.out.println(c);
    }
}
