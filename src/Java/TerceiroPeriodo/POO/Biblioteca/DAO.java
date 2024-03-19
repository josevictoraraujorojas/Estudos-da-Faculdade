package Java.TerceiroPeriodo.POO.Biblioteca;

public interface DAO {
    public void gravar() throws Exception;

    public boolean excluir() throws Exception;

     public Object ler() throws Exception;

    public void atualizar() throws Exception;

}
