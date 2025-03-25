import java.util.Scanner;

public class d5q6 {
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter month (1-12): ");
            int month = scanner.nextInt();
            
            System.out.print("Enter day (1-31): ");
            int day = scanner.nextInt();
            
            if (month < 1 || month > 12 || day < 1 || day > 31) {
                System.out.println("Invalid date input!");
            } else {
                if (isSpringSeason(month, day)) {
                    System.out.println("It's a Spring Season.");
                } else {
                    System.out.println("Not a Spring Season.");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }
}
