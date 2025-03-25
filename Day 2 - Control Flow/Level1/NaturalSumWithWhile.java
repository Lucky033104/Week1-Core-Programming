package Day2.Level1;
import java.util.Scanner;

public class NaturalSumWithWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number: ");
        int n = input.nextInt();

        if (n >= 1) {
            int sumofNaturalnumForm = n * (n + 1) / 2;
            int sumLoop = 0, i = 1;
            while (i <= n) {
                sumLoop += i;
                i++;
            }

            System.out.println("Sum using formula: " + sumofNaturalnumForm);
            System.out.println("Sum using while loop: " + sumLoop);

            if (sumofNaturalnumForm == sumLoop) {
                System.out.println("the two methods are correct.");
            }
            else {
                System.out.println("There is a mistake in the results.");
            }
        }
        else {
            System.out.println("The number is not a natural number.");
        }
    }
}
