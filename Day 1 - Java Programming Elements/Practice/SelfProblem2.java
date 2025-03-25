import java.util.Scanner;
public class SelfProblem2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Length : ");
        double Length = scan.nextDouble();

        System.out.println("Width : ");
        double Width = scan.nextDouble();

        double Perimeter = 2 * (Length + Width);
        System.out.println("Perimeter of a Rectangle: " + Perimeter);
    }
}
