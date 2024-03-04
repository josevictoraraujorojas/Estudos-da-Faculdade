package Java.TerceiroPeriodo.POO.Funcionario;

public class Teste {
    public static void main(String[] args) {
        Secretaria secretaria = new Secretaria("jose",2000,"1221321321");
        Gerente gerente = new Gerente("Dany",2000,2);
        System.out.println(secretaria);
        System.out.println(gerente);
    }
}
