import java.util.Scanner;

public class Sphere {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int r = scan.nextInt();


        double volume = ((4.0/3) * 3.14159 * Math.pow(r, 3.0));

        System.out.println(String.format("VOLUME = %.3f", volume));

    }
}
