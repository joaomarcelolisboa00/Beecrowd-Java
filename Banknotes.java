import java.util.Scanner;

public class Banknotes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int value = scan.nextInt();


        int nota100 = 0;
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;
        int nota1 = 0;

        int i = value;

        while (value > 0){

           nota100 = value/100;
           value = value - (100*nota100);

           nota50 = value/50;
           value = value - (50*nota50);

           nota20 = value/20;
           value = value - (20*nota20);

           nota10 = value/10;
           value = value - (10*nota10);

           nota5 = value/5;
           value = value - (5*nota5);

            nota2 = value/2;
            value = value - (2*nota2);

            nota1 = value/1;
            value = value - (1*nota1);



        }
        System.out.println(i);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");

    }
}
