package Day5.Level3;
import java.util.Scanner;
public class UniqueCharacterFinder {
    public static int checkStrLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);count++;
            }
        }
        catch (IndexOutOfBoundsException e) {
        }
        return count;
    }
    public static char[] findUniqCharacters(String text) {
        int length = checkStrLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }
        char[] finalUniqChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            finalUniqChars[i] = uniqueChars[i];
        }
        return finalUniqChars;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();char[] uniqueCharacters = findUniqCharacters(inputText);
        System.out.println("Unique characters in the string:");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }
        scanner.close();
    }
}

