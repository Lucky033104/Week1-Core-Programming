import java.util.Scanner;
public class HeightConversionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your height in cm: ");
        int cm = input.nextInt();

        double inches = cm / 2.54;
        int feet = (int)inches/12;
        double RemainInches = inches % 12;
        System.out.println("Your Height in cm is " + cm +" while in feet is " + feet +" and inches is " + RemainInches);
    }
}
