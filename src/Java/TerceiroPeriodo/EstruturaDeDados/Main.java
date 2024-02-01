package Java.TerceiroPeriodo.EstruturaDeDados;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Teste de cliente-----------------------");

        ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente cl1 = new Cliente();
        cl1.insereDados("Jose Victor", (short) 2004,70000.00f);
        Cliente cl2 = new Cliente();
        cl2.insereDados("Joao Marcos", (short) 2003,50000.00f);
        Cliente cl3 = new Cliente();
        cl3.insereDados("Debora", (short) 1999,1000.00f);
        clientes.add(cl1);
        clientes.add(cl2);
        clientes.add(cl3);
        System.out.println(consultaClientesAcimaDaMedia(clientes));
        System.out.println(consultaAnoDeNascimentoEspecifico(clientes));




    }

    public static StringBuilder consultaClientesAcimaDaMedia (ArrayList<Cliente> clientes){
        StringBuilder clientesAcimaDaMedia = new StringBuilder();
        float media = 0;
        for (Cliente cliente:clientes) {
            media += cliente.rendaMensal;
        }
        media/=clientes.size();

        for (Cliente cliente:clientes) {
            if (cliente.rendaMensal>media){
                clientesAcimaDaMedia.append(cliente.nome).append("\n");
            }
        }
        return clientesAcimaDaMedia;
    }

    public static StringBuilder consultaAnoDeNascimentoEspecifico (ArrayList<Cliente> clientes){
        StringBuilder clientesAnoDeNascimentoEspecifico = new StringBuilder();

        for (Cliente cliente:clientes) {
            if (cliente.anoDeNascimento>1980&&cliente.anoDeNascimento<2000){
                clientesAnoDeNascimentoEspecifico.append(cliente.nome).append("\n");
            }
        }
        return clientesAnoDeNascimentoEspecifico;
    }


}
