package Day2.Level1;
import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Positive number: ");
        int number = input.nextInt();

        if (number >= 0) {
            int factorial = 1, i = 1;

            while (i <= number) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Please enter  positive number.");
        }
    }
}
