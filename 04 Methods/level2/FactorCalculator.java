import java.util.Scanner;

public class FactorCalculator {
    
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static int sumOfSquaresOfFactors(int[] factors) {
        int sumSquares = 0;
        for (int factor : factors) {
            sumSquares += Math.pow(factor, 2);
        }
        return sumSquares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            
            if (number <= 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                int[] factors = findFactors(number);
                System.out.print("Factors: ");
                for (int factor : factors) {
                    System.out.print(factor + " ");
                }
                System.out.println();
                
                System.out.println("Sum of Factors: " + sumOfFactors(factors));
                System.out.println("Product of Factors: " + productOfFactors(factors));
                System.out.println("Sum of Squares of Factors: " + sumOfSquaresOfFactors(factors));
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
