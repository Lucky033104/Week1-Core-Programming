import java.util.Scanner;
public class SelfProblem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Principal : ");
        double Principal = scan.nextDouble();

        System.out.println("Rate: ");
        double Rate = scan.nextDouble();

        System.out.println("Time : ");
        double Time = scan.nextDouble();

        double SimpleInterest = (Principal * Rate * Time)/100;
        System.out.println("Simple Interest : " + SimpleInterest);
    }
}
