public class Check {
    
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }
    
    public static int[] getDigitsArray(int number) {
        int numDigits = countDigits(number);
        int[] digits = new int[numDigits];
        for (int i = numDigits - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    
    public static boolean isHarshadNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }
    
    public static int[][] findDigitFrequency(int number) {
        int[] digits = getDigitsArray(number);
        int[][] frequency = new int[10][2];
        
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }
        
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        
        return frequency;
    }
    
    public static void main(String[] args) {
        int number = 153;
        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));
        
        int[] digits = getDigitsArray(number);
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number: " + isHarshadNumber(number));
        
        int[][] frequency = findDigitFrequency(number);
        System.out.println("Digit Frequency:");
        for (int[] pair : frequency) {
            if (pair[1] > 0) {
                System.out.println("Digit " + pair[0] + ": " + pair[1]);
            }
        }
    }
}