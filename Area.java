/*
Make a program that reads three floating point values: A, B and C. Then, calculate and show:
a) the area of the rectangled triangle that has base A and height C.
b) the area of the radius's circle C. (pi = 3.14159)
c) the area of the trapezium which has A and B by base, and C by height.
d) the area of the square that has side B.
e) the area of the rectangle that has sides A and B.
 */

import java.util.Scanner;

public class Area {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pi = 3.14159;
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double triangle = (a * c)/2;
        double circle = pi * (c*c);
        double trapezium = ((a + b)*c)/2;
        double square = b*b;
        double rectangle = a * b;

        System.out.println(String.format("TRIANGULO: %.3f", triangle));
        System.out.println(String.format("CIRCULO: %.3f", circle));
        System.out.println(String.format("TRAPEZIO: %.3f", trapezium));
        System.out.println(String.format("QUADRADO: %.3f", square));
        System.out.println(String.format("RETANGULO: %.3f", rectangle));


    }
}
