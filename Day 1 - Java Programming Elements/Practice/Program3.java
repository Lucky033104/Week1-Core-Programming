import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Celsius = ");
        double Celsius = scan.nextDouble();

        double Fahrenheit = ((Celsius * (9/5)) + 32);
        System.out.println("Fahrenheit = " + Fahrenheit);
    }
}
