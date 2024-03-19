package Java.TerceiroPeriodo.POO.Biblioteca;

public class Orientador extends Pessoa{
    private long id;
    private String email;

    public long getCod() {
        return id;
    }

    public void setCod(long cod) {
        this.id = cod;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
