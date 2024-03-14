package Java.TerceiroPeriodo.POO.Interface;

public class Cliente implements  DAO{
    private int codigo;
    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public void inserir() {

    }

    @Override
    public void excluir() {

    }

    @Override
    public void localizar() {

    }
}
