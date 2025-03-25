package Day5.Level2;
import java.util.Scanner;
public class ManualStringSplitter {
    public static int getLenUsingCharAt(String str) {
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
        int length = getLenUsingCharAt(str);
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
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String str = input.nextLine();
        String[] wordsUsingCharAt = splitUsingCharAt(str);
        String[] wordsUsingBuiltIn = str.split(" ");
        boolean result = compareStringArrays(wordsUsingCharAt, wordsUsingBuiltIn);
        System.out.println("Words using charAt: ");
        for (String word : wordsUsingCharAt) {
            System.out.println(word);
        }
        System.out.println("Words using split method: ");
        for (String word : wordsUsingBuiltIn) {
            System.out.println(word);
        }
        System.out.println("Do both results match? " + result);
    }
}

