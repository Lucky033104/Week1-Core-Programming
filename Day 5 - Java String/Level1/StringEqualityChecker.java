package Day5.Level1;
import java.util.Scanner;
public class StringEqualityChecker {
    public static boolean charAt(String stringA, String stringB) {
        if (stringA.length() != stringB.length()) {
            return false;
        }
        for (int i = 0; i < stringA.length(); i++) {
            if (stringA.charAt(i) != stringB.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String A: ");
        String stringA = input.nextLine();
        System.out.println("Enter String B: ");
        String stringB = input.nextLine();
        boolean charAtCompare = charAt(stringA, stringB);
        boolean equalsComparision = stringA.equals(stringB);
        if (charAtCompare == equalsComparision) {
            System.out.println("Both methods give the same result: " + charAtCompare);
        } else {
            System.out.println("Methods give different results.");
        }
    }
}