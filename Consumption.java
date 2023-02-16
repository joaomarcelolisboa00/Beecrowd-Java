import java.util.Scanner;

public class Consumption {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int distance = scan.nextInt();
        float spent = scan.nextFloat();
        float consumption;

        consumption = distance/spent;

        System.out.println(String.format("%.3f km/l", consumption));



    }
}