package Day2.Level1;
import java.util.Scanner;
public class LargestNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Num1: ");
        int num1 = input.nextInt();

        System.out.println("Num2: ");
        int num2 = input.nextInt();

        System.out.println("Num3: ");
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Is the first number the largest? Yes");
        }
        else {
            System.out.println("Is the first number the largest? No");
        }

        if (num2 > num1 && num2 > num3) {
            System.out.println("Is the second number the largest? Yes");
        }
        else {
            System.out.println("Is the second number the largest? No");
        }

        if (num3 > num1 && num3 > num2) {
            System.out.println("Is the third number the largest? Yes");
        }
        else {
            System.out.println("Is the third number the largest? No");
        }
    }
}
