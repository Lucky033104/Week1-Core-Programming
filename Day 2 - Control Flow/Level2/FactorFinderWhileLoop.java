package Day2.Level2;
import java.util.Scanner;

public class FactorFinderWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number: ");
        int number = input.nextInt();

        if (number > 0) {
            int i = 1;
            while (i <= number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
