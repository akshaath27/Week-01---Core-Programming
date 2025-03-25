import java.util.Scanner;

public class SumOfNaturalNumbers {
    
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a natural number: ");
            int n = scanner.nextInt();
            
            if (n <= 0) {
                System.out.println("Please enter a positive natural number.");
            } else {
                int sumRecursive = sumUsingRecursion(n);
                int sumFormula = sumUsingFormula(n);
                
                System.out.println("Sum using Recursion: " + sumRecursive);
                System.out.println("Sum using Formula: " + sumFormula);
                
                if (sumRecursive == sumFormula) {
                    System.out.println("Both methods produce the same result. Computation is correct!");
                } else {
                    System.out.println("Mismatch in computation. Check the logic.");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid natural number.");
        } finally {
            scanner.close();
        }
    }
}
