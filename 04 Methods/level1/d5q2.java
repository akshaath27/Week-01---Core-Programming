import java.util.Scanner;

public class d5q2 {
    public static int maxHandshakes(int n) {
        // Using the combination formula to calculate the number of handshakes
        if (n < 2) {
            return 0; // No handshakes possible with less than 2 students
        }
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        
        try {
            int numStudents = scanner.nextInt();
            if (numStudents < 0) {
                System.out.println("Please enter a valid positive number of students.");
            } else {
                System.out.println("Maximum number of handshakes: " + maxHandshakes(numStudents));
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}