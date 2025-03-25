import java.util.Scanner;

public class DoubleOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.println("Enter the value of b: ");
        double b = input.nextDouble();

        System.out.println("Enter the value of c: ");
        double c = input.nextDouble();

        double INtegeroperation1 = a + b *c;
        double INtegeroperation2 = a * b + c;
        double INtegeroperation3 = c + a / b;
        double INtegeroperation4 = a % b + c;
        System.out.println("The results of Int Operations are " + INtegeroperation1 + "," + INtegeroperation2 + "," + INtegeroperation3 + " and" + INtegeroperation4);
    }
}


