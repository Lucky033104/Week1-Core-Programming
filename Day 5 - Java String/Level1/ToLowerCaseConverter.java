package Day5.Level1;
import java.util.Scanner;

public class ToLowerCaseConverter {
    public static String UsingCharAt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            } else {
                result += ch;
            }
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
        System.out.println("Enter the text: ");
        String str = input.nextLine();

        String lowerUsingCharAt = UsingCharAt(str);
        String lowerUsingFunc = str.toLowerCase();
        boolean result = compareUsingCharAt(lowerUsingCharAt, lowerUsingFunc);

        System.out.println("Lowercase using charAt(): " + lowerUsingCharAt);
        System.out.println("Lowercase using built in function: " + lowerUsingFunc);
        System.out.println("Do both results match? " + result);
    }
}

