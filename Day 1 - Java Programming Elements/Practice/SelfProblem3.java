import java.util.Scanner;
public class SelfProblem3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Base: ");
        int Base = scan.nextInt();

        System.out.println("Exponent: ");
        int Exponent = scan.nextInt();

        int PowerCalculation = (int) Math.pow(Base, Exponent);
        System.out.println("Power Calculation: " + PowerCalculation);
    }
}
