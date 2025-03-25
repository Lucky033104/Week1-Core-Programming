package Day2.Level2;
 import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number: ");
        int number = input.nextInt();

        if (number >= 1) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0 ) {
                    System.out.println(i + " is even number");
                }
                else {
                    System.out.println(i + " is odd number");
                }
            }
        }
        else {
            System.out.println("Please enter natural number.");
        }
    }
}
