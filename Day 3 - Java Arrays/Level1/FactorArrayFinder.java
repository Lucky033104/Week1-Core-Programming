package Day3.Level1;
import java.util.Scanner;

public class FactorArrayFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        int maxFactor = 10;
        int[] factor = new int[maxFactor];
        int index = 0;
        for (int i = 1; i <= number; i++){
            if(number % i == 0){
                factor[index] = i;
                index++;
            }
        }
        System.out.println("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++){
            System.out.print(factor[i] + " ");
        }
        input.close();
    }
}

