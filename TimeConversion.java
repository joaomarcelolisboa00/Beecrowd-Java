/*
Read an integer value, which is the duration in seconds of a certain event in a factory, and inform it expressed in hours:minutes:seconds.

Input
The input file contains an integer N.

Output
Print the read time in the input file (seconds) converted in hours:minutes:seconds like the following example.
 */

import java.util.Scanner;

public class TimeConversion {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int seconds = scan.nextInt();
        int hour, minutes;

        hour = seconds / 3600;
        minutes = (seconds % 3600) / 60;
        seconds = (seconds % 3600) % 60;

        System.out.println(hour + ":" + minutes + ":" + seconds);

    }

}
