package Java.TerceiroPeriodo.POO.Exercicio01;

public class UsaCarro {
    public static void main(String[] args) {

        Carro c = new Carro();
        Pessoa p = new Pessoa("jose","preto","magro",18,c);
        c.setCor("vermelho");
        c.setNumPortas(4);
        c.setDono(p);
        c.setTipo("gol");
        c.setPlaca("1331a1");
        System.out.println(c);
        System.out.println(p);
    }
}
