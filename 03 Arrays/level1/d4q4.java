import java.util.Scanner;

public class d4q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10]; // Array to store up to 10 numbers
        double total = 0.0; // Variable to store the total sum
        int index = 0; // Index to track array position

        // Infinite loop to take user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();
            
            // Break if input is 0 or negative
            if (input <= 0) {
                break;
            }

            // Store input in the array if there is space
            if (index < 10) {
                numbers[index] = input;
                index++;
            } else {
                break; // Stop taking input if the array is full
            }
        }

        // Calculate total sum and display numbers
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        // Display the sum of the numbers
        System.out.println("\nTotal sum: " + total);
        scanner.close();
    }
}
