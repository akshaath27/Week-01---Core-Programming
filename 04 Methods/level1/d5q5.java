import java.util.Scanner;

public class d5q5 {
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            
            int result = checkNumber(number);
            
            if (result == 1) {
                System.out.println("The number is positive.");
            } else if (result == -1) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}
