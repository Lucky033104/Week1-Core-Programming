package Day5.Level2;
import java.util.Scanner;
public class CustomStringLengthCalculator {
    public static int UsingCharAt(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = input.next();

        int lengthUsingCharAt = UsingCharAt(str);
        int lengthUsingMeth = str.length();

        System.out.println("Length using charAt(): " + lengthUsingCharAt);
        System.out.println("Length using built in method: " + lengthUsingMeth);
        System.out.println("Do both results match? " + (lengthUsingCharAt == lengthUsingMeth));
    }
}
