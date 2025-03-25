package Day5.Level1;
import java.util.Scanner;
public class StringIndexOutOfBoundsDemo {
    public static void generateException(String text) {
        System.out.println("Accessing index beyond length");
        System.out.println(text.charAt(text.length()));
    }
    public static void handleException(String text) {
        try {
            System.out.println("Accessing index beyond length...");
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught String Index out of Bounds Exception: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String text = input.next();
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        handleException(text);
    }
}


