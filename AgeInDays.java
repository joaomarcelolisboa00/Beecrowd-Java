/*
Read an integer value corresponding to a person's age (in days) and print it in years, months and days, followed by its respective message “ano(s)”, “mes(es)”, “dia(s)”.

Note: only to facilitate the calculation, consider the whole year with 365 days and 30 days every month. In the cases of test there will never be a situation that allows 12 months and some days, like 360, 363 or 364. This is just an exercise for the purpose of testing simple mathematical reasoning.

Input
The input file contains 1 integer value.

Output
Print the output, like the following example.
 */

import java.util.Scanner;

public class AgeInDays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int age = scan.nextInt();

        int year, month, days;

        year = age/365;
        month = (age%365) / 30;
        days = (age%365) % 30;

        System.out.println(year + " ano(s)");
        System.out.println(month + " mes(es)");
        System.out.println(days + " dia(s)");
    }
}