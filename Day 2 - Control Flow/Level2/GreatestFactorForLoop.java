package Day2.Level2;
import java.util.Scanner;
public class GreatestFactorForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number: ");
        int number = input.nextInt();
        if (number > 1){
            int greatestFactor =1;
            for (int i = number -1; i >= 1; i--){
                if (number % i == 0){
                    greatestFactor = i;
                    break;
                }
            }
            System.out.println(greatestFactor);
        }
        else{
            System.out.println("Enter valid number");
        }

    }
}
