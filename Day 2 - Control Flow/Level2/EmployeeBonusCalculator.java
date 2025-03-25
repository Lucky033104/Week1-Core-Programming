package Day2.Level2;
import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        System.out.print("How many years of service?: ");
        int yearsOfService = input.nextInt();

        if (yearsOfService > 5) {
            double bonus = 0.05 * salary;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus for less than 5 years of service.");
        }
    }
}

