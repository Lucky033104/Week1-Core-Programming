package Day2.Level2;
import java.util.Scanner;

public class PowerCalculatorForLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Number: ");
        int number = input.nextInt();

        System.out.println("Power: ");
        int power = input.nextInt();

        if (number >= 0 && power >= 0) {
            int result = 1;
            for (int i =1; i<= power; i++){
                result *= number;
            }
            System.out.println(result);
        }
        System.out.println("Enter valid number");
    }
}
