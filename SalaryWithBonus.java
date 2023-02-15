import java.util.Scanner;

public class SalaryWithBonus {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        double salary = scan.nextDouble();
        double sales = scan.nextDouble();
        double finalSalary;

        finalSalary = salary + (sales * 0.15);

        System.out.println(String.format("TOTAL = R$ %.2f", finalSalary));


    }
}
