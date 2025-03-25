package Day2.Level1;
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tot = 0.0;
        double number;

        System.out.print("number : ");
        number = input.nextDouble();

        while (number != 0) {
            tot += number;
            System.out.print("number (0 to stop): ");
            number = input.nextDouble();
        }

        System.out.println("The sum of numbers is: " + tot);
    }
}
