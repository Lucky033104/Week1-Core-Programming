package Day2.Level1;
import java.util.Scanner;
public class CountdownFor {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Countdown no: ");
         int counter = input.nextInt();

         for (int i = counter; i >=1; i--) {
             System.out.println(i);
         }
    }
}
