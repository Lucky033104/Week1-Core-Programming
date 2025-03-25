package Day3.Level1;
import java.util.Scanner;
public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        String[] result = new String[number + 1];
        if (number <= 0) {
            System.out.print("Enter valid number!");
        } else {
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    result[i] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    result[i] = "Fizz";
                } else if (i % 5 == 0) {
                    result[i] = "Buzz";
                } else {
                    result[i] = String.valueOf(i);
                }
            }
            for (int i = 1; i <= number; i++) {
                System.out.println("Index Position " + i + " = " +
                        result[i]);
            }
        }
    }
}