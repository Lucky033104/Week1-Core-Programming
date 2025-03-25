package Day3.Level1;
import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is a positive even number.");
                }
                else {
                    System.out.println(numbers[i] + " is a positive odd number.");
                }
            }
            else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is a negative number.");
            }
            else {
                System.out.println(numbers[i] + " is zero.");
            }
        }
        if (numbers[0] == numbers[4]) {
            System.out.println(numbers[0] + " == " + numbers[4]);
        } else if (numbers[0] > numbers[4]) {
            System.out.println(numbers[0] + " > " + numbers[4]);
        } else {
            System.out.println(numbers[0] + " < " + numbers[4]);
        }
    }
}
