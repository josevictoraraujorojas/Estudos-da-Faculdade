package Java.TerceiroPeriodo.POO.Biblioteca.Parte3;

import java.io.Serializable;

public abstract class Obra implements Serializable {
    protected String titulo;
    protected String autor;
    protected String genero;
    protected String editora;
    protected String ano;
    protected boolean digital;

    public Obra(String titulo, String autor, String area, String editora, String ano, boolean digital) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = area;
        this.editora = editora;
        this.ano = ano;
        this.digital=digital;
    }
    public Obra(){

    }

    public abstract void abrir();
    public abstract void fechar();

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
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    @Override
    public String toString() {
        return "Obra{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", editora='" + editora + '\'' +
                ", ano='" + ano + '\'' +
                ", digital=" + digital +
                '}';
    }
}
