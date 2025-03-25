import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Num1: ");
        int Num1 = input.nextInt();

        System.out.println("Enter Num2: ");
        int Num2 = input.nextInt();

        int Add = Num1 + Num2;
        int Sub = Num1 - Num2;
        int Multiply = Num1 * Num2;
        int Division = Num1 / Num2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + Num1 +" and " + Num2 +" is " + Add + "," + Sub +" ," + Multiply +  " and " + Division);

    }
}
