package Day5.Level1;
import java.util.Scanner;
public class ArrayIndexOutOfBoundsDemo {
    public static void generateException(String[] names) {
        System.out.println("Accessing index beyond length..");
        System.out.println(names[names.length]);
    }
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing index beyond length..");
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of names: ");
        int n = input.nextInt();

        String[] names = new String[n];
        System.out.println("Enter the names: ");
        for (int i = 0; i < n; i++) {
            names[i] = input.next();
        }
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main " + e.getMessage());
        }
        handleException(names);
    }
}

