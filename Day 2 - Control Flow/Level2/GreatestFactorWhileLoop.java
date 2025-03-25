package Day2.Level2;
import java.util.Scanner;

public class GreatestFactorWhileLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Number: ");
        int number = input.nextInt();

        if (number > 1){
            int greatestFactor = 1;
            int counter = number - 1;
            while (counter >= 1){
                if (number % counter == 0){
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }
            System.out.println(greatestFactor);
        }
        else {
            System.out.println("Enter valid number");
        }
    }
}
