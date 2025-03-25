package Day3.Level1;
import java.util.Scanner;
public class MultiplicationFrom6To9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        int[] multi = new int[4];
        for (int i = 0; i < 4; i++){
            multi[i] = number * (i + 6);
        }
        for (int i = 0; i < 4; i++){
            System.out.println(number + " * " + (i + 6) + " = " + multi[i]);
        }
        input.close();
    }
}
