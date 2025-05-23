package StringPracticeprob;
import java.util.Scanner;
public class CaseToggler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        StringBuilder toggled = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c));
            }
            else if (Character.isLowerCase(c)) {
                toggled.append(Character.toUpperCase(c));
            }
            else {
                toggled.append(c);
            }
        }
        System.out.println("Toggled case string: " + toggled);
    }
}