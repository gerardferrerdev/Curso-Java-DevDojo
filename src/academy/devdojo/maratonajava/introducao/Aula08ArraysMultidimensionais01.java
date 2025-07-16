package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int [][] dia = new int [3][2];
        dia [0][0]= 1;
        dia [0][1]= 2;
        dia [1][0]= 4;
        dia [1][1]= 5;
        dia [2][0]= 7;
        dia [2][1]= 8;
                for (int i = 0; i < dia.length ; i++) {
            for (int j = 0; j < dia [i].length ; j++) {
                System.out.println(dia[i][j]);
            }

            System.out.println("--------------------------------------");

            for (int[]arrBase : dia){
                for ( int num : arrBase){
                    System.out.println(num);
                }
            }

        }
    }
}
