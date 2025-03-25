import java.util.Scanner;

public class Demo {
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // Accessing out of bound index
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length())); // Accessing out of bound index
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: Invalid index access.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        System.out.println("Generating exception:");
        try {
            generateException(input);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e);
        }
        
        System.out.println("Handling exception:");
        handleException(input);
    }
}
