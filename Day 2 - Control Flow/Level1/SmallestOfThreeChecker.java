package Day2.Level1;
import java.util.Scanner;
public class SmallestOfThreeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("num1: ");
        int num1 = input.nextInt();

        System.out.println("num2: ");
        int num2 = input.nextInt();

        System.out.println("num3: ");
        int num3 = input.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Is the first number the smallest? Yes");
        }
        else {
            System.out.println("Is the first number the smallest? No");
        }
    }
}
