package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    //Imprima os primeiros 25 numeros de um dado valor
    public static void main(String[] args) {
        int valormax = 45;
        int valorfinal = 0;
        for ( int i =0; i <= valormax ; i++) {
            valorfinal = i + valormax;
            if (i>25) {
                break;
            }
            System.out.println(valorfinal);
        }

    }
}
