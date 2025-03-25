package Day4.Level1;
import java.util.Scanner;

public class SimpleInterestCalculator {
    public static double calculateSi(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = input.nextDouble();
        System.out.print("Rate: ");
        double rate = input.nextDouble();
        System.out.print("Time: ");
        double time = input.nextDouble();
        double si = calculateSi(principal, rate, time);
        System.out.println("The Simple Interest is " + si + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
        input.close();
    }
}

