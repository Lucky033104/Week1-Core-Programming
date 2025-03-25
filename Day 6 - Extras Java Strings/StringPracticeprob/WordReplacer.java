package StringPracticeprob;
import java.util.Scanner;
public class WordReplacer {
    public static String wordReplace(String sentence, String prevWord, String newWord) {
        return sentence.replaceAll("\\b" + prevWord + "\\b", newWord);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine();
        System.out.print("Enter to replace the word: ");
        String prevWord = input.next();
        System.out.print("Enter new word: ");
        String newWord = input.next();
        String modifiedSeneten = wordReplace(sentence, prevWord, newWord);
        System.out.println("Modified sentence: " + modifiedSeneten);
    }
}

