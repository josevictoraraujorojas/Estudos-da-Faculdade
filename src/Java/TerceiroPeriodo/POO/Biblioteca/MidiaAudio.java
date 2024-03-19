package Java.TerceiroPeriodo.POO.Biblioteca;

public class MidiaAudio extends Obra{

    private int duracao;

    private String Album;

    private String letra;

    public MidiaAudio(String titulo, String autor, String area, String editora, String ano, int duracao, String album, String letra) {
        super(titulo, autor, area, editora, ano);
        this.duracao = duracao;
        Album = album;
        this.letra = letra;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "MidiaAudio{" +
                "duracao=" + duracao +
                ", Album='" + Album + '\'' +
                ", letra='" + letra + '\'' +
                "} " + super.toString();
    }


}
