import java.util.Scanner;
public class DistanceConverterUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter distance in km: ");
        int km = input.nextInt();

        double Miles = km / 1.6;
        System.out.println("The total miles is " + Miles +" mile for the given " + km + " km");
    }

}
