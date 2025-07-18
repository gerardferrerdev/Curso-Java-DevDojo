package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.professor;

public class professorTeste {
    public static void main(String[] args) {
        professor professor = new professor();
        professor.nome = "Hermes";
        professor.idade = 30;
        professor.sexo = 'M';
        System.out.println("\nNome: "+professor.nome+" \nIdade: "+professor.idade+ "\nSexo: "+professor.sexo);
    }
}
