import java.util.Scanner;
public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Principal amount: ");
        double Principal = input.nextDouble();

        System.out.println("Rate of interest: ");
        double Rate = input.nextDouble();

        System.out.println("Time: ");
        double Time = input.nextDouble();

        double simpleInterest = Principal * Rate * Time /100;
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal" + Principal  +", Rate of Interest " + Rate + " and Time " + Time
);
    }
}
