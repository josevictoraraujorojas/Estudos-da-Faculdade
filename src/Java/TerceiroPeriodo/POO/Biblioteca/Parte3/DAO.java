package Java.TerceiroPeriodo.POO.Biblioteca.Parte3;

public interface DAO {
    void gravar() throws Exception;

    boolean excluir() throws Exception;

    void atualizar() throws Exception;

    Object ler(String dataDoEmprestimo) throws Exception;
}
