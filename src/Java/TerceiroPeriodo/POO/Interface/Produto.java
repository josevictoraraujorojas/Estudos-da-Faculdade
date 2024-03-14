package Java.TerceiroPeriodo.POO.Interface;

public class Produto implements DAO,Estoque{
    private int numero;
    private String descricao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    @Override
    public void baixar() {

    }
}
