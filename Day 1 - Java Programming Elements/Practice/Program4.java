import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Radius = ");
        double Radius = scan.nextDouble();

        double AreaOfCircle = 3.14 * (Radius * Radius);
        System.out.println("Area Of Circle" + AreaOfCircle);
    }
}
