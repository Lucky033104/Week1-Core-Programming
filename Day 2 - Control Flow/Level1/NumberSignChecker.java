package Day2.Level1;
import java.util.Scanner;
public class NumberSignChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number : ");
        int number = input.nextInt();

        if ( number > 0 ) {
            System.out.println("Positive");
        }
        else if (number < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }
}
