package Day4.Level1;
import java.util.Scanner;
public class SpringSeasonChecker {
    public static boolean Spring(int month, int date){
        if(month == 3 && date >= 20 || month == 4 || month == 5 || month ==6
                && date<20){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Month: ");
        int month = input.nextInt();
        System.out.print("Date: ");
        int date = input.nextInt();
        boolean result = Spring(month, date);
        if(result){
            System.out.println("Spring Season");
        }
        else {
            System.out.println("Not a Spring Season");
        }
        input.close();
    }
}
