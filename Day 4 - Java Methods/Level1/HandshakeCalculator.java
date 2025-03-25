package Day4.Level1;
import java.util.Scanner;

public class HandshakeCalculator {
    public static int handshake(int n){
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int n = input.nextInt();
        int nOfHandshakes = handshake(n);
        System.out.println("Handshakes: " + nOfHandshakes);
        input.close();
    }
}
