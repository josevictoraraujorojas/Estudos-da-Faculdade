package Java.TerceiroPeriodo.POO.Heranca;

public class Teste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Jose");
        funcionario.setRg("083593951-01");
        funcionario.setCartao("RH789");

        System.out.printf("Funcionario:%s\nRg:%s\nCartao:%s\n",funcionario.getNome(),funcionario.getRg(),funcionario.getCartao());
    }
}
