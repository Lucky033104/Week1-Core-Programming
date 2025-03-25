import java.util.Scanner;
public class WeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your wt in pound: ");
        double Weight = input.nextDouble();

        double PoundinKg = Weight/2.2;
        System.out.println("The weight of the person in pound is" + Weight +" and in kg is " + PoundinKg);
    }
}
