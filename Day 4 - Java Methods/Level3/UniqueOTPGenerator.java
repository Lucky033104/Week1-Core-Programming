package Day4.Level3;
import java.util.HashSet;

public class UniqueOTPGenerator {
    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000);
    }
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            otpSet.add(otp);
        }
        return otpSet.size() == otps.length;
    }
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }
        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }
}

