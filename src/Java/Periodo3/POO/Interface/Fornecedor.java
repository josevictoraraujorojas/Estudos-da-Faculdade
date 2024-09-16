package Java.Periodo3.POO.Interface;

public class Fornecedor implements DAO{
    private String cnpj;
    private String razaoSocial;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
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
