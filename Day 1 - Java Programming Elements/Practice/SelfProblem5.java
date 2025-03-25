import java.util.Scanner;

public class SelfProblem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Km: ");
        double kms = scan.nextDouble();

        double Miles = kms * 0.621371;
        System.out.println("Miles: " + Miles);
    }
}
