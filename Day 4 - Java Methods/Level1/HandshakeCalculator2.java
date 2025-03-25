package Day4.Level1;
import java.util.Scanner;
public class HandshakeCalculator2 {
    public static int handshakes(int n){
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int n = input.nextInt();
        int numberOfStudents = handshakes(n);
        System.out.println("Handshakes: " + numberOfStudents);
        input.close();
    }
}

