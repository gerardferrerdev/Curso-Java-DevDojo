package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        double salario = 6000;
        String doar = "Vou doar 500 para o DevDojo!";
        String ndoar = "Não tenho condições ainda, mas vou ter!";
        //(condição) ? verdadeira : falso
        String resultado = salario>5000 ? doar : ndoar;


        System.out.println(resultado);
    }
}
