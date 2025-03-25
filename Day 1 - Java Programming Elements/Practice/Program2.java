import java.util.Scanner;
public class Program2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter A = ");
        int A = scan.nextInt();

        System.out.println("Enter B = ");
        int B = scan.nextInt();

        int Sum = A + B;
        System.out.println("Sum: " + Sum);

    }
}
