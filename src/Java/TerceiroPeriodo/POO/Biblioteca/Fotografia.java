package Java.TerceiroPeriodo.POO.Biblioteca;

public class Fotografia extends Obra{
    String localDaFoto;
    String legenda;
    String cameraUtilizada;

    public Fotografia(String titulo, String autor, String area, String editora, String ano, String localDaFoto, String legenda, String cameraUtilizada) {
        super(titulo, autor, area, editora, ano);
        this.localDaFoto = localDaFoto;
        this.legenda = legenda;
        this.cameraUtilizada = cameraUtilizada;
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
}
