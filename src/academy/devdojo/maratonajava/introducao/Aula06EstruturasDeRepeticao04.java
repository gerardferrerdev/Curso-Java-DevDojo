package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //dado um valor de um carro, descubra quantas vezes ele pode ser parcelado
        //condição valorParcela <= 1000
        double valorTotal = 12000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal/parcela;
            if (valorParcela >= 1000) {
                System.out.println("parcela " + parcela + " R$ " + valorParcela);
            }else{
                break;
            }

        }

    }
}
