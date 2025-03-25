package Day4.Level1;
import java.util.Scanner;

public class TrigonometricFunctionCalculator {
    public static double[]
    calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);
        return new double[]{sinValue, cosValue, tanValue};
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the degree of an angle: ");
        double angle = input.nextDouble();
        double[] trigonometricValues =
                calculateTrigonometricFunctions(angle);
        System.out.printf("Sin(%.2f°) = %.4f%n", angle,
                trigonometricValues[0]);
        System.out.printf("Cos(%.2f°) = %.4f%n", angle,
                trigonometricValues[1]);
        System.out.printf("Tan(%.2f°) = %.4f%n", angle,trigonometricValues[2]);
        input.close();
    }
}
