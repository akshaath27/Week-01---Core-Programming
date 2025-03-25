import java.util.HashSet;
import java.util.Random;

public class OTP {
    
    public static int generateOTP() {
        return 100000 + new Random().nextInt(900000);
    }
    
    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            if (!otpSet.add(otp)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] otps = new int[10];
        
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otps[i]);
        }
        
        System.out.println("Are all OTPs unique? " + areOTPsUnique(otps));
    }
}
