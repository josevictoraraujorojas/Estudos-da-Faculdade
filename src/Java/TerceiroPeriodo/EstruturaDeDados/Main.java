package Java.TerceiroPeriodo.EstruturaDeDados;

public class Main {
    public static void main(String[] args) {
        System.out.println("Teste da agenda de endereco -----------------------");
        AgendaDeEndereco a1 = new AgendaDeEndereco();
        a1.insereDados("Jose Victor","Rua 2 Bairro Sao Francisco","999290687");
        a1.consultaDados();
        a1.excluiDados();
        a1.consultaDados();
        a1.insereDados("Jose Victor","Rua 2 Bairro Sao Francisco","99929068");
        a1.consultaDados();

        System.out.println("Teste dos carros de garagem -----------------------");
        CarroDeGaragem c1 = new CarroDeGaragem();
        c1.insereDados("fiat","palio","prata","AAA1A11");
        c1.consultaDados();
        c1.excluiDados();
        c1.consultaDados();
        c1.insereDados("fiat","palio","prata","AAA1A1A");
        c1.consultaDados();

        System.out.println("Teste de cliente-----------------------");
        Cliente cl1 = new Cliente();
        cl1.insereDados("Jose Victor", (short) 2004,70000.00f);
        cl1.consultaDados();
        cl1.excluiDados();
        cl1.consultaDados();
        cl1.insereDados("Jose Victor", (short) 3000,70000.00f);
        cl1.consultaDados();

    }
}
