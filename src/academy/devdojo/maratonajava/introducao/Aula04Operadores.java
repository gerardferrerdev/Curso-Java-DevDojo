package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int nomero01= 10;
        int numero02 = 20;
        System.out.println(nomero01+numero02);

        // %
        int resto01 = 20 % 2;
        System.out.println(resto01);

        int resto02 = 101 % 2;
        System.out.println(resto02);

        // <menor que >maior que <=menor ou igual que >=maior ou igual que ==igual !=diferente de
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualOuMaiorQueVinte = 10 >= 20;
        boolean isDezIgualOuMenorQueVinte = 10 <= 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualOuMaiorQueVinte "+isDezIgualOuMaiorQueVinte);
        System.out.println("isDezIgualOuMenorQueVinte "+isDezIgualOuMenorQueVinte);
        System.out.println("isDesIgualAVinte "+ isDezIgualAVinte);
        System.out.println("isDezDiferenteDeVinte "+isDezDiferenteDeVinte);

        // &&(and) ||(or) !(not)
        int idade = 29;
        float salario = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade <= 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorDoPS = 5000;

        boolean pscompravel = valorTotalContaCorrente > valorDoPS || valorTotalContaPoupanca > valorDoPS;
        System.out.println("pscompravel "+pscompravel);

        // = += -= /= *= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -=1000;
        bonus +=3000;

        System.out.println("bonus "+bonus);



    }
}
