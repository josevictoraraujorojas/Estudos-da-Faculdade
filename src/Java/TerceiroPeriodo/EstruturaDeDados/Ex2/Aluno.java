package Java.TerceiroPeriodo.EstruturaDeDados.Ex2;

public class Aluno {
    public String nome;
    public int peso;
    public String dataNascimento;

    public Aluno(String nome, int peso, String dataNascimento) {
        this.nome = nome;
        this.peso = peso;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        boolean padraoData;
        padraoData=!dataNascimento.matches("\\d{2}/\\d{2}/\\d{4}");
        if (padraoData){
            System.out.println("Valor invalido, tente esse padrao 00/00/0000 ");
            return;
        }
        this.dataNascimento = dataNascimento;
    }
}
