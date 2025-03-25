package Day3.Level2;
import java.util.Scanner;

public class DigitArrayMaxFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maximumDigit = 10;
        int[] integers = new int[maximumDigit];
        int index = 0;
        System.out.print("Number: ");
        long number = input.nextLong();
        while (number != 0){
            if(index >= maximumDigit){
                break;
            }
            integers[index++] = (int) number % 10;
            number /= 10;
        }
        int largest = 0, secondLargest = 0;
        for (int i = 0; i < index; i++){
            if(integers[i] > largest){
                secondLargest = largest;
                largest = integers[i];
            }
            else if (integers[i] > secondLargest && integers[i] != largest) {
                secondLargest = integers[i];
            }
        }
        System.out.println("Largest: " + largest + "\nSecond Largest: " +
                secondLargest);
        input.close();
    }
}
