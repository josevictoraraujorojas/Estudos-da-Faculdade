package Java.TerceiroPeriodo.EstruturaDeDados;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Teste de cliente-----------------------");

        ArrayList<Cliente> clientes = new ArrayList<>();

        Cliente cl1 = new Cliente("Jose Victor", (short) 2004,70000.00f);
        Cliente cl2 = new Cliente("Joao Marcos", (short) 2003,50000.00f);
        Cliente cl3 = new Cliente("Debora", (short) 1999,1000.00f);

        clientes.add(cl1);
        clientes.add(cl2);
        clientes.add(cl3);

        System.out.println(clientesRendaAcimaDaMedia(clientes));
        System.out.println(consultaAnoDeNascimentoEspecifico(clientes));




    }

    public static StringBuilder clientesRendaAcimaDaMedia(ArrayList<Cliente> clientes){
        StringBuilder clientesAcimaDaMedia = new StringBuilder();
        float media = 0;
        for (Cliente cliente:clientes) {
            media += cliente.getRendaMensal();
        }
        media/=clientes.size();

        for (Cliente cliente:clientes) {
            if (cliente.getRendaMensal()>media){
                clientesAcimaDaMedia.append(cliente.getNome()).append("\n");
            }
        }
        return clientesAcimaDaMedia;
    }

    public static StringBuilder consultaAnoDeNascimentoEspecifico (ArrayList<Cliente> clientes){
        StringBuilder AnoDeNascimentoEspecifico = new StringBuilder();

        for (Cliente cliente:clientes) {
            if (cliente.getAnoDeNascimento()>1980&&cliente.getAnoDeNascimento()<2000){
                AnoDeNascimentoEspecifico.append(cliente.getNome()).append("\n");
            }
        }
        return AnoDeNascimentoEspecifico;
    }


}
