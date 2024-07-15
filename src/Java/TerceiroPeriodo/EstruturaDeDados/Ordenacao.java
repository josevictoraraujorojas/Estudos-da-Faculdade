package Java.TerceiroPeriodo.EstruturaDeDados;

import java.util.Arrays;

public class Ordenacao {
    public static void main(String[] args) {
        //ex 03
        int[] vetor = new int[5];
        int countTroca = 0;
        int varredura = 5;
        int count = 0;

        vetor[0]= 5;
        vetor[1] = 4;
        vetor[2] = 3;
        vetor[3] = 2;
        vetor[4] = 1;
        System.out.println(Arrays.toString(vetor));

        for(int k = 0; k <= vetor.length-1; k++){
            countTroca=0;
            varredura--;
            for(int j=vetor.length-1; j>k ; j--){
                count++;
                if(vetor[j]<vetor[j-1]){
                    countTroca++;
                    int aux = vetor[j-1];
                    vetor[j-1]= vetor[j];
                    vetor[j]= aux;
                    System.out.println(Arrays.toString(vetor)+" troca:"+countTroca+" varredura:"+varredura+" count:"+count);
                }
            }
        }

    }

}
