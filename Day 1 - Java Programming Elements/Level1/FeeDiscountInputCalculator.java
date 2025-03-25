import java.util.Scanner;
public class FeeDiscountInputCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Fee amount: ");
        double fee = input.nextDouble();

        System.out.println("Enter the Discount percent: ");
        double discountPercent = input.nextDouble();

        double discount = (fee * discountPercent)/ 100;
        double finalFee = fee-discount;
        System.out.println("The discount amount is INR " + discount +" and final discounted fee is INR " + finalFee);
        }
    }
