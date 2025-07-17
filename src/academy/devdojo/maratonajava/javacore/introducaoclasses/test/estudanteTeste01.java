package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.estudante;

public class estudanteTeste01 {
    public static void main(String[] args) {
        estudante estudante = new estudante();
        estudante.nome = "Gerard";
        estudante.idade = 17;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
