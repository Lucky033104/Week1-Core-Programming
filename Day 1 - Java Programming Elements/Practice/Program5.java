import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Radius = ");
        double Radius = scan.nextDouble();

        System.out.println("Height = ");
        double Height = scan.nextDouble();

        double VoulmeOfCylinder = 3.14 * (Radius * Radius) * Height;
        System.out.println("Voulme of Cylinder: " + VoulmeOfCylinder);
    }


}
