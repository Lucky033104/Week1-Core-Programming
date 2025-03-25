import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("From city: ");
        String fromCity = input.nextLine();

        System.out.print("Via city: ");
        String viaCity = input.nextLine();

        System.out.print("To city: ");
        String toCity = input.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = input.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = input.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;

        System.out.print(" Total time taken in hrs: ");
        double timeTaken = input.nextDouble();

        System.out.println("The distance traveled by " + name + " is " + totalDistance + " miles from " + fromCity + " via " + viaCity + " to " + toCity + " in " + timeTaken + " hours.");
    }
}
