package Java.TerceiroPeriodo.EstruturaDeDados;

import java.util.Arrays;

public class Ordenacao {
    public static void main(String[] args) {
        //ex 03
        Dado[] vetor = new Dado[5];
        int countTroca = 0;
        int varredura = 5;
        int count = 0;

        vetor[0]= new Dado(5,'a');
        vetor[1] = new Dado(0,'b');
        vetor[2] = new Dado(0,'c');
        vetor[3] =new Dado(0,'d');
        vetor[4] =new Dado(5,'e');
        System.out.println(Arrays.toString(vetor));

//        for(int k = 0; k <= vetor.length-1; k++){
//            countTroca=0;
//            varredura--;
//            for(int j=vetor.length-1; j>k ; j--){
//                count++;
//                if(vetor[j].numero<vetor[j-1].numero){
//                    countTroca++;
//                    Dado aux = vetor[j-1];
//                    vetor[j-1]= vetor[j];
//                    vetor[j]= aux;
//                    System.out.println(Arrays.toString(vetor)+" troca:"+countTroca+" varredura:"+varredura+" count:"+count);
//                }
//            }
//        }

        for ( int i = 0; i < vetor.length-1; i ++) {
            int min = i ;
            for ( int j = i + 1; j < vetor.length ; j ++) {
                if ( vetor [ j ].numero < vetor [min].numero ) {
                    min = j;
                }
            }
            Dado aux = vetor [min ] ;
            vetor [min] = vetor [ i ] ;
            vetor [ i ] = aux ;
        }
        System.out.println(Arrays.toString(vetor));
    }

}
