package Java.TerceiroPeriodo.POO.Biblioteca.Parte1;

public class Obra {
    protected String titulo;
    protected String autor;
    protected String area;
    protected String editora;
    protected String ano;

    public Obra(String titulo, String autor, String area, String editora, String ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.area = area;
        this.editora = editora;
        this.ano = ano;
    }
    public Obra(){

    }

    public void abrir(){

    };
    public void fechar(){

    };

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return area;
    }

    public void setGenero(String area) {
        this.area = area;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    @Override
    public String toString() {
        return "Obra{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", area='" + area + '\'' +
                ", editora='" + editora + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }
}
