package Day4.Level2;
import java.util.Scanner;
public class NaturalSumComparer {
    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Natural number: ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number.");
        }
        else {
            int sumUsingRecursion = recursiveSum(n);
            int sumUsingFormula = formulaSum(n);
            System.out.println("\nResults: \nSum using Recursion: " +
                    sumUsingRecursion);
            System.out.println("Sum using Formula: " + sumUsingFormula);
            if (sumUsingRecursion == sumUsingFormula) {
                System.out.println("Both computations match!");
            } else {
                System.out.println("Mismatch detected!");
            }
        }
        input.close();
    }
}

