package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int count = 0;
        int num = 7;
        int resu =0;
        System.out.println("-----------------------------------");
        System.out.println("               TABUADA");
        System.out.println("-----------------------------------");
        while (count <= 10) {
            resu = (num * count);
            System.out.println("|"+num + "x" + count + " = " + resu);
            count += 1;
        }
        System.out.println("-----------------------------------");
    }
}
