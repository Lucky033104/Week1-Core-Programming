import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("side 1: ");
        double side1 = input.nextDouble();

        System.out.print("side 2: ");
        double side2 = input.nextDouble();

        System.out.print("side 3: ");
        double side3 = input.nextDouble();

        double perimeter = side1 + side2 + side3;
        double rounds = 5000 / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
    }
}
