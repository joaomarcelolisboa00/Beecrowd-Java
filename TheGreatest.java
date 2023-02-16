/*
Input
The input file contains 3 integer values.

Output
Print the greatest of these three values followed by a space and the message “eh o maior”.
 */
import java.util.Scanner;

public class TheGreatest {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int greatestAB;
        int greatestABC;

        greatestAB = (a + b + (Math.abs(a - b)))/2;
        greatestABC =  ((greatestAB + c + Math.abs(greatestAB - c)) / 2);

        System.out.println(greatestABC + " eh o maior");


    }
}
