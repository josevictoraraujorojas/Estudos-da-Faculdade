package Java.Lista05;

public class Ex5 {
    public static void main(String[] args) {
        int [][] identidade = new int[5][5];

        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                identidade[i][j]=0;
                if (i==j){
                    identidade[i][j]=1;
                }
                System.out.printf("%d\t ", identidade[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
