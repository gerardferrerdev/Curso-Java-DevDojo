package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.pessoa;

public class pessoaTest01 {
    public static void main(String[] args) {
        pessoa pessoa = new pessoa();
        pessoa.nome = "Jõa Vinicius";
        pessoa.idade = 20;
        pessoa.Sexo = "bem suspeito";

        System.out.println("O "+ pessoa.nome + " é um cara que ne, ama o beicin, está no auge dos seus "+pessoa.idade+ " anos, e sua sexualidade é "+pessoa.Sexo);
    }

}
