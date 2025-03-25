package Day4.Level3;
import java.util.Scanner;
public class NumberTypeIdentifier {
    public static boolean Prime(int number) {
        if (number < 2) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    public static boolean NeonNumber(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }
    public static boolean SpyNumber(int number) {
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }
    public static boolean Automorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }
    public static boolean BuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("Is Prime? " + Prime(number));
        System.out.println("Is Neon Number? " + NeonNumber(number));
        System.out.println("Is Spy Number? " + SpyNumber(number));
        System.out.println("Is Automorphic Number? " +
                Automorphic(number));
        System.out.println("Is Buzz Number? " + BuzzNumber(number));
        input.close();
    }
}
