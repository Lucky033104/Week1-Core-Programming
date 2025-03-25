import java.util.Scanner;
public class SelfProblem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("a: ");
        double a = scan.nextDouble();

        System.out.println("b: ");
        double b = scan.nextDouble();

        System.out.println("c: ");
        double c = scan.nextDouble();

        double average = (a+b+c)/3;
        System.out.println("Average of Three Numbers: " + average);
    }
}
