package Java.TerceiroPeriodo.EstruturaDeDados;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AgendaDeEndereco {
    String nome;
    String enderco;
    String telefone;

    public void insereDados(String nome, String enderco, String telefone){
        Pattern pattern = Pattern.compile("[0-9]{9}");
        Matcher matcher = pattern.matcher(telefone);
        boolean verificaTelefone = matcher.matches();

        if (!verificaTelefone){
            System.out.println("valor do Telefone(NNNNNNNNN) invalido tente novamente");
            return;
        }

        this.nome=nome;
        this.enderco=enderco;
        this.telefone=telefone;
    }
    public void excluiDados(){
        this.nome=null;
        this.enderco=null;
        this.telefone=null;
    }

    public void consultaDados(){
        System.out.printf("nome:%s\nendereco:%s\ntelefone:%s\n",this.nome,this.enderco,this.telefone);
    }


}
