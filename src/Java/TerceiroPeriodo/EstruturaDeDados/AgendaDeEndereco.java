package Java.TerceiroPeriodo.EstruturaDeDados;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AgendaDeEndereco {
    private String nome;
    private String enderco;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderco() {
        return enderco;
    }

    public void setEnderco(String enderco) {
        this.enderco = enderco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        Pattern pattern = Pattern.compile("[0-9]{9}");
        Matcher matcher = pattern.matcher(telefone);
        boolean verificaTelefone = matcher.matches();

        if (!verificaTelefone){
            System.out.println("valor do Telefone(NNNNNNNNN) invalido tente novamente");
            return;
        }
        this.telefone = telefone;
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
