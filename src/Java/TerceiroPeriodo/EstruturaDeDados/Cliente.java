package Java.TerceiroPeriodo.EstruturaDeDados;

import java.util.ArrayList;

public class Cliente {
    String nome;
    short anoDeNascimento;
    float rendaMensal;

    public void insereDados(String nome,short anoDeNascimento, float rendaMensal){
        if (anoDeNascimento>2024){
            System.out.println("valor de ano de nascimento invalido tente novamente");
            return;
        }

        this.nome=nome;
        this.anoDeNascimento=anoDeNascimento;
        this.rendaMensal=rendaMensal;
    }

    public void excluiDados(){
        this.nome=null;
        this.anoDeNascimento=0;
        this.rendaMensal=0.00f;
    }

    public void consultaDados(){
        System.out.printf("Nome:%s\nAno de nascimento:%d\nRenda mensal:%f\n",this.nome,this.anoDeNascimento,this.rendaMensal);
    }


}
