package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    //Dados os valores de 1 a 7, imprima se é dia util ou final de semana
    //considere 1 como domingo
    public static void main(String[] args) {
        int dia = 4;

        switch (dia){
            case 1:
                System.out.println("Hoje é Domingo, ou seja não é um dia útil.");
                break;
            case 2:
                System.out.println("Hoje é Segunda, portanto a menos que seja feriado, hoje é um dia útil.");
                break;
            case 3:
                System.out.println("Hoje é Terça, portanto a menos que seja feriado, hoje é um dia útil.");
                break;
            case 4:
                System.out.println("Hoje é Quarta, portanto a menos que seja feriado, hoje é um dia útil.");
                break;
            case 5:
                System.out.println("Hoje é Quinta, portanto a menos que seja feriado, hoje é um dia útil.");
                break;
            case 6:
                System.out.println("Hoje é Sexta, portanto a menos que seja feriado, hoje é um dia útil.");
                break;
            case 7:
                System.out.println("Hoje é Sábado, só é considerado dia útil para pagamento normalmente verifique com cautela.");
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
