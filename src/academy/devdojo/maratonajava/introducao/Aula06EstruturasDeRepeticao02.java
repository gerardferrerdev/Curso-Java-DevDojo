package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //imprimir todos os numero pares de 0 ate 1000000
        int num = 1;
        int par = 0;
        while(num <= 376){
            par = num % 2;
            if ( par == 0){
                System.out.println(num);
            }
            num += 1;

        }
    }
}
