package academy.devdojo.maratonajava.introducao;
/*
Pratica

Crie variaveis para campos descritos abaixo entre <> e imprima a seguinte mensagem:

EU <Nome>, morando no endereço<Endereço>,
confirmo que recebi o salario de <Salario>, na data <Data>
*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Gerard";
        String endereco = "Senador antonio  lemos, castanhal, Pará";
        String data = "14/07/2025";
        double salario = 2500.99;
        String mensagem = "Eu "+nome+" morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data "+data;
            System.out.println(mensagem);
    }
}