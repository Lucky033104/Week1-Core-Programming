package Day2.Level1;
import java.util.Scanner;
public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number: ");
        int number = input.nextInt();
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5?  Yes");
        }
        else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }
    }
}
