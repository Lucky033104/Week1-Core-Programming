package Day5.Level1;
import java.util.Scanner;
public class SubstringComparer {
    public static String subStringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        String string = input.next();
        System.out.println("Enter the start index:");
        int start = input.nextInt();
        System.out.println("Enter the end index:");
        int end = input.nextInt();
        String subString = subStringUsingCharAt(string, start, end);
        String substring2 = string.substring(start, end);
        boolean result = compareUsingCharAt(string, subString);
        System.out.println("Substring using charAt(): " + subString);
        System.out.println("Substring using built-in substring(): " + substring2);
        System.out.println("Do both substrings match? " + result);

    }
}
