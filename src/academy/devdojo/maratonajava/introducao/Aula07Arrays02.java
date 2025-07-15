package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, float e double 0
        //char 0
        //boplean false
        //String null
        String [] nomes = new String [3];
        nomes [0]= "Gerard";
        nomes[1]="Nina";
        nomes[2]="Heitor";
        for (int i = 0; i <nomes.length; i++) {
            System.out.println(nomes[i]);

        }
    }
}
