package Java.TerceiroPeriodo.POO.Biblioteca.Parte3;

public class Fotografia extends Obra {
    String localDaFoto;
    String legenda;
    String cameraUtilizada;

    public Fotografia(){

    }

    public Fotografia(String titulo, String autor, String area, String editora,Boolean digital ,String ano, String localDaFoto, String legenda, String cameraUtilizada) {
        super(titulo, autor, area, editora,ano,digital);
        this.localDaFoto = localDaFoto;
        this.legenda = legenda;
        this.cameraUtilizada = cameraUtilizada;
    }

    @Override
    public void abrir() {
        System.out.println("Fotografia esta aberta para visualizacao");
    }

    @Override
    public void fechar() {
        System.out.println("Fotografia nao esta mais disponivel");
    }

    public String getLocalDaFoto() {
        return localDaFoto;
    }

    public void setLocalDaFoto(String localDaFoto) {
        this.localDaFoto = localDaFoto;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

    public String getCameraUtilizada() {
        return cameraUtilizada;
    }

    public void setCameraUtilizada(String cameraUtilizada) {
        this.cameraUtilizada = cameraUtilizada;
    }


    @Override
    public String toString() {
        return "Fotografia{" +
                "localDaFoto='" + localDaFoto + '\'' +
                ", legenda='" + legenda + '\'' +
                ", cameraUtilizada='" + cameraUtilizada + '\'' +
                "} " + super.toString();
    }

    @Override
    public void gravar() throws Exception {

    }

    @Override
    public boolean excluir() throws Exception {
        return false;
    }

    @Override
    public void atualizar() throws Exception {

    }

    @Override
    public Object ler(String dataDoEmprestimo) throws Exception {
        return null;
    }
}
