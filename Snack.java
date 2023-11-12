import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtd, productCode;
        double total = 0;

        //System.out.println("Informe o codigo do produto: ");
        productCode = scan.nextInt();
        //System.out.println("Informe a quantidade: ");
        qtd = scan.nextInt();


        switch (productCode) {
            case 1: //cachorro quente
                total = 4 * qtd;
                break;
            case 2: //X-salada
                total = 4.5 * qtd;
                break;
            case 3://X-bacon
                total = 5 * qtd;
                break;
            case 4://Torrada simples
                total = 2 * qtd;
                break;
            case 5://Refrigerante
                total = 1.5 * qtd;
                break;
            default:
                System.out.println("Codigo invalido");
                break;
        }

        System.out.printf("Total: R$ %.2f",total);
        System.out.println();

    }
}
