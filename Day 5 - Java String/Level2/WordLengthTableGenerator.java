package Day5.Level2;
import java.util.Scanner;
public class WordLengthTableGenerator {
    public static int lenUsingCharAt(String str) {
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
    public static String[] splitUsingCharAt(String str) {
        int length = lenUsingCharAt(str);
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int[] spaceIndexes = new int[spaceCount + 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = length;
        String[] words = new String[spaceCount + 1];
        int start = 0;
        for (int i = 0; i <= spaceCount; i++) {
            int end = spaceIndexes[i];
            StringBuilder word = new StringBuilder();
            for (int j = start; j < end; j++) {
                word.append(str.charAt(j));
            }
            words[i] = word.toString();
            start = end + 1;
        }
        return words;
    }
    public static String[][] wordsWithLengths(String[] words) {
        int length = words.length;
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(lenUsingCharAt(words[i]));
        }
        return result;
    }
    public static void displayResult(String[][] result) {
        System.out.println("Word\tLength");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String str = input.nextLine();
        String[] word = splitUsingCharAt(str);
        String[][] wordsWithLen = wordsWithLengths(word);
        displayResult(wordsWithLen);
    }
}
