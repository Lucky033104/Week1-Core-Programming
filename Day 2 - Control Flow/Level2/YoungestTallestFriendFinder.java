package Day2.Level2;
import java.util.Scanner;

public class YoungestTallestFriendFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();

        System.out.println("Enter Amar's Height");
        int amarHeight = input.nextInt();

        System.out.println("Enter Akbar's age: ");
        int akbarAge = input.nextInt();

        System.out.println("Enter Akbar's height: ");
        int akbarHeight = input.nextInt();

        System.out.println("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();

        System.out.println("Enter Anthony's height: ");
        int anthonyHeight = input.nextInt();

        String youngest;
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            youngest = "Amar";
        }
        else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            youngest = "Akbar";
        }
        else {
            youngest = "Anthony";
        }
        System.out.println("The youngest friend is " + youngest);


        String tallest;
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            tallest = "Amar";
        }
        else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            tallest = "Akbar";
        }
        else {
            tallest = "Anthony";
        }
        System.out.println("The tallest friend is " + tallest);
    }
}