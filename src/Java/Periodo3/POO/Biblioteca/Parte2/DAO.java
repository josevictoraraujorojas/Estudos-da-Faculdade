package Java.Periodo3.POO.Biblioteca.Parte2;

public interface DAO {
    public void gravar() throws Exception;

    public boolean excluir() throws Exception;

    public void atualizar() throws Exception;

    abstract Object ler(String dataDoEmprestimo) throws Exception;
}
