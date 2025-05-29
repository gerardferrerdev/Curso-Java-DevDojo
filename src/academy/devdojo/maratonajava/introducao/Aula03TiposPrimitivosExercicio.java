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
        String endereco = "pará, castanhal, centro, senador lemos N220";
        double salario = 2000;
        String dataDoRecebimento = "27/05/2025";
        String mesagem = ("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salario de " + salario
                +", na data " + dataDoRecebimento);
        System.out.println(mesagem);
    }
}