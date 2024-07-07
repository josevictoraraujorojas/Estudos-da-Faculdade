package Java.TerceiroPeriodo.POO.Biblioteca.Parte3;

public class MidiaAudio extends Obra{

    private int duracao;

    private String Album;

    private String letra;
    public MidiaAudio(){

    }

    public MidiaAudio(String titulo, String autor, String area, String editora, String ano, boolean digital, int duracao, String album, String letra) {
        super(titulo, autor, area, editora, ano, digital);
        this.duracao = duracao;
        Album = album;
        this.letra = letra;
    }

    @Override
    public void abrir() {
        System.out.println("Midia em execucao");
    }

    @Override
    public void fechar() {
        System.out.println("Midia foi interrompida");
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
