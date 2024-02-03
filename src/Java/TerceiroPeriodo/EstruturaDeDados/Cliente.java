package Java.TerceiroPeriodo.EstruturaDeDados;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private short anoDeNascimento;

    public Cliente(String nome, short anoDeNascimento, float rendaMensal) {
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;
        this.rendaMensal = rendaMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(short anoDeNascimento) {
        if (anoDeNascimento>2024){
            System.out.println("valor de ano de nascimento invalido tente novamente");
            return;
        }
        this.anoDeNascimento = anoDeNascimento;
    }

    public float getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(float rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    private float rendaMensal;

    public void excluiDados(){
        this.nome=null;
        this.anoDeNascimento=0;
        this.rendaMensal=0.00f;
    }


}
