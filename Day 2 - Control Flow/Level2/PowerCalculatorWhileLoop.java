package Day2.Level2;
import java.util.Scanner;

public class PowerCalculatorWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number: ");
        int number = input.nextInt();

        System.out.println("Power: ");
        int power = input.nextInt();

        if (number >= 0 && power >= 0) {
            int result = 1;
            int counter = 0;
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println(result);
        } else {
            System.out.println("Enter valid number");
        }
    }
}
