import java.util.Scanner;

public class Null {
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); 
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Attempted to access a null object.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Generating exception:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e);
        }
        
        System.out.println("Handling exception:");
        handleException();
    }
}