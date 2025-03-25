package Day2.Level1;
import java.util.Scanner;

public class SpringSeasonChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = input.nextInt();

        if (month == 3) {
            if (day >= 20 && day <= 31) {
                System.out.println("It's a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
        }
        else if (month == 4) {
            if (day >= 1 && day <= 30) {
                System.out.println("It's a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
        }
        else if (month == 5) {
            if (day >= 1 && day <= 31) {
                System.out.println("It's a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
        }
        else if (month == 6) {
            if (day >= 1 && day <= 20) {
                System.out.println("It's a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
        }
        else {
            System.out.println("Not a Spring Season");
        }
    }
}
