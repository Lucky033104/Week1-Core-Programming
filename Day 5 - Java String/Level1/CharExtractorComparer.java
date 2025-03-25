package Day5.Level1;
import java.util.Scanner;
public class CharExtractorComparer {
    public static char[] UsingCharAt(String str) {
        char[] charArr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArr[i] = str.charAt(i);
        }
        return charArr;
    }
    public static boolean compareCharArr(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        String string = input.next();
        char[] charArr1 = UsingCharAt(string);
        char[] charArr2 = string.toCharArray();
        String string2 = new String(charArr1);
        boolean result = compareCharArr(charArr1, charArr2);
        System.out.println("CharArr using charAt(): " + new String(charArr1));
        System.out.println("CharArr using built-in toCharArray(): " + new String(charArr2));
        System.out.println("Do both arrays match? " + result);
    }
}
