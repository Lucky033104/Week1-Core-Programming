package Day2.Level1;
import java.util.Scanner;

public class NaturalSumWithFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number: ");
        int number = input.nextInt();

        if (number >= 1) {
            int sumofNnFormula = number * (number + 1) / 2;
            int sumLoop = 0;

            for (int i = 1; i <= number; i++) {
                sumLoop += i;
            }

            System.out.println("Sum using formula: " + sumofNnFormula);
            System.out.println("Sum using for loop: " + sumLoop);

            if (sumofNnFormula == sumLoop) {
                System.out.println("Both of the methods are correct.");
            } else {
                System.out.println("There is a mistake in the results.");
            }
        } else {
            System.out.println("The number is not a natural number.");
        }
    }
}
