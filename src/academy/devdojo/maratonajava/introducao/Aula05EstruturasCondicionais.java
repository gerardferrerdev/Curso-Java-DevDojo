package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 10;
        boolean autorizado = idade > 18;
         if (autorizado){
             System.out.println("Permitido");
         }
         else {
             System.out.println("Não autorizado seu vadio");
         }

         int idadefut = 10;

         if (idadefut < 15) {
             System.out.println("Categoria infantil");
         }
         else if (idadefut >= 15 && idadefut<18) {
             System.out.println("Categoria juvenil");

         }
         else{
             System.out.println("Categoria adulto");
         }



    }
}
