import java.util.Scanner;

public class Average1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grade1 = scan.nextDouble();
        double grade2 = scan.nextDouble();
        double average;

        average = ((grade1 * 3.5) + (grade2 * 7.5))/11;

        System.out.println(String.format("MEDIA = %.5f", average));

    }
}
