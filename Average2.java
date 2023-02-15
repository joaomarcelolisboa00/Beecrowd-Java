import java.util.Scanner;

public class Average2 {
    /*
    Read three values (variables A, B and C), which are the three student's grades. Then, calculate the average, considering that grade A has weight 2, grade B has weight 3 and the grade C has weight 5. Consider that each grade can go from 0 to 10.0, always with one decimal place.

    Input
    The input file contains 3 values of floating points (double) with one digit after the decimal point.

    Output
    Print the message "MEDIA"(average in Portuguese) and the student's average according to the following example, with a blank space before and after the equal signal.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grade1 = scan.nextDouble();
        double grade2 = scan.nextDouble();
        double grade3 = scan.nextDouble();
        double average;

        average = ((grade1 * 2) + (grade2 * 3) + (grade3 * 5))/10;

        System.out.println(String.format("MEDIA = %.1f", average));

    }
}