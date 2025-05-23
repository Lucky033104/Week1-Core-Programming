package Day3.Level2;
import java.util.Scanner;

public class BMICalculator2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of persons: ");
        int numberofPersons = input.nextInt();
        double[][] personData = new double[numberofPersons][3];
        String[] weightStatus = new String[numberofPersons];
        for (int i = 0; i < numberofPersons; i++) {
            System.out.print("Height of person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble() / 100;
            System.out.print("Weight of person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();
            personData[i][2] = personData[i][0] / (personData[i][1] *
                    personData[i][1]);
        }
        for (int i = 0; i < numberofPersons; i++) {
            double bmi = personData[i][2];
            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 24.9) weightStatus[i] = "Normal weight";
            else if (bmi < 29.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }
        System.out.println("\nBMI Results");
        for (int i = 0; i < numberofPersons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][0] + " meters");
            System.out.println("Weight: " + personData[i][1] + " kg");
            System.out.println("BMI: " + String.format("%.2f",
                    personData[i][2]));
            System.out.println("Weight Status: " + weightStatus[i]);
        }
    }
}

