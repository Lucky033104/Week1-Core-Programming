package Day4.Level2;
import java.util.Scanner;
public class LeapYearChecker {
    public static boolean LeapYear(int year) {
        if (year < 1582) {
            System.out.println("The year must be 1582 or later.");
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year (>=1582): ");
        int year = input.nextInt();
        if (LeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }
        input.close();
    }
}

