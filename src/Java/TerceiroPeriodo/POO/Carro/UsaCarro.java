package Java.TerceiroPeriodo.POO.Carro;

public class UsaCarro {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Pessoa pessoa = new Pessoa("jose","preto","magro",18, carro);
        carro.setCor("vermelho");
        carro.setNumPortas(4);
        carro.setDono(pessoa);
        carro.setTipo("gol");
        carro.setPlaca("AAA-1A11");
        carro.setNumPortas(4);

        System.out.printf("----carro----\n cor:%s\n tipo:%s\n placa:%s\n portas:%d\n dono:%s\n-------------\n"
                , carro.getCor(), carro.getTipo(), carro.getPlaca(), carro.getNumPortas(), carro.getDono().getNome());

        pessoa.ligarCarro();
        pessoa.acelerarCarro();
        pessoa.freaeCarro();
        pessoa.desligarCarro();
    }
}
