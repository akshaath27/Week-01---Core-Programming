import java.util.Scanner;
public class Level3q7 {
    public static boolean isPalindromeIndex(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
    public static boolean isPalindromeCharArray(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = reverseString(text).toCharArray();
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }
    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        text = text.replaceAll("\\s", "").toLowerCase();
        boolean isPalindromeIndex = isPalindromeIndex(text);
        System.out.println("Is Palindrome (Index Method): " + isPalindromeIndex);
        boolean isPalindromeRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Is Palindrome (Recursive Method): " + isPalindromeRecursive);
        boolean isPalindromeCharArray = isPalindromeCharArray(text);
        System.out.println("Is Palindrome (CharArray Method): " + isPalindromeCharArray);
        scanner.close();
    }
}
