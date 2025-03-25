import java.util.Scanner;
public class l3q6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int count = 0;
        while (number != 0) {
            number = number / 10; // Remove the last digit
            count++;
        }
        System.out.println("The number of digits is: " + count);
        scanner.close();
    }
}
