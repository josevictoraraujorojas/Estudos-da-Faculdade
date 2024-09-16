package Java.Periodo3.POO.Biblioteca.Parte3;

public class Aluno extends Pessoa{
    private long id;
    private String email;

    public long getRa() {
        return id;
    }

    public void setRa(long ra) {
        this.id = ra;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
