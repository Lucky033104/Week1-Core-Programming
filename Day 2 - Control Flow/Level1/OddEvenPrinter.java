package Day2.Level1;
import java.util.Scanner;

public class OddEvenPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter positive number: ");
        int number = input.nextInt();

        if (number >= 1) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        } else {
            System.out.println("Please enter natural number.");
        }
    }
}
