public class Checker2 {
    
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }
    
    public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }
    
    public static int greatestFactor(int number) {
        int[] factors = getFactors(number);
        return factors[factors.length - 2]; // Second last factor is the greatest proper divisor
    }
    
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) sum += factor;
        return sum;
    }
    
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) product *= factor;
        return product;
    }
    
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) product *= Math.pow(factor, 3);
        return product;
    }
    
    public static boolean isPerfectNumber(int number) {
        int sum = sumOfFactors(getFactors(number)) - number;
        return sum == number;
    }
    
    public static boolean isAbundantNumber(int number) {
        int sum = sumOfFactors(getFactors(number)) - number;
        return sum > number;
    }
    
    public static boolean isDeficientNumber(int number) {
        int sum = sumOfFactors(getFactors(number)) - number;
        return sum < number;
    }
    
    public static boolean isStrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) sum += factorial(digit);
        return sum == number;
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
    
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) fact *= i;
        return fact;
    }
    
    public static void main(String[] args) {
        int number = 28;
        int[] factors = getFactors(number);
        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Greatest Factor: " + greatestFactor(number));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }
}