package Day2.Level1;
import java.util.Scanner;
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tot = 0.0;

        while (true) {
            System.out.print("number (0 or negative to stop): ");
            double number = input.nextDouble();

            if (number <= 0) {
                break;
            }

            tot += number;
        }

        System.out.println("The sum of numbers is: " + tot);
    }
}
