package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salarioanual=45000;
        double a= 9.70;
        double b= 37.35;
        double c= 49.50;
        double a2= 9.70  / 100;
        double b2= 37.35 / 100;
        double c2= 49.50 / 100;
        double valorimposto;

        if (salarioanual<=34712){
            valorimposto = salarioanual * a2;
            System.out.println("você deve pagar "+a+"% do seu salario anual. E irá pagar "+valorimposto+" Reais.");
        } else if (salarioanual>34713 && salarioanual<68507) {
            valorimposto = salarioanual * b2;
            System.out.println("você deve pagar "+b+"% do seu salario anual.E irá pagar "+valorimposto+" Reais.");
        }
        else {
            valorimposto = salarioanual * c2;
            System.out.println("você deve pagar "+c+"% do seu salario anual.E irá pagar "+valorimposto+" Reais.");
        }
    }
}
