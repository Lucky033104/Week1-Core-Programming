package Day2.Level1;
import java.util.Scanner;
public class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number: ");
        int number = input.nextInt();

        if (number >= 0) {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("The factorial of " + number + " is " + factorial);
        }
        else {
            System.out.println("Please enter  positive number.");
        }
    }
}
