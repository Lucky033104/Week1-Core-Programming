import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        int Number1 = input.nextInt();

        System.out.println("Enter Number 2: ");
        int Number2 = input.nextInt();

        int quotient = Number1/Number2;
        int remainder = Number1 % Number2;
        System.out.println("The Quotient is " + quotient +" and Reminder is " + remainder + " of two number " + Number1 +" and " + Number2
        );
    }
}

