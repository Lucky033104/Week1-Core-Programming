package Day2.Level2;
import java.util.Scanner;

public class MultiplesBelow100ForLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Number: ");
        int number = input.nextInt();

        if (number > 0 && number < 100) {
            for(int i = 100; i >= number; i--){
                if(i % number == 0){
                    System.out.println(i);
                }
            }
        }
        else{
            System.out.println("Enter valid number");
        }
    }
}
