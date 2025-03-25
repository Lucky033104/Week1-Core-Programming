import java.util.Scanner;
public class IntOperations {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = input.nextInt();

        System.out.println("Enter the value of b: ");
        int b = input.nextInt();

        System.out.println("Enter the value of c: ");
        int c = input.nextInt();

        int INtegeroperation1 = a + b *c;
        int INtegeroperation2 = a * b + c;
        int INtegeroperation3 = c + a / b;
        int INtegeroperation4 = a % b + c;
        System.out.println("The results of Int Operations are " + INtegeroperation1 + "," + INtegeroperation2 + "," + INtegeroperation3 + " and" + INtegeroperation4);
    }

}
