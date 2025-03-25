import java.util.Scanner;

public class Uppercase {
    
    public static String convertToUpperCase(String text) {
        StringBuilder upperCaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                upperCaseText.append((char) (ch - 32));
            } else {
                upperCaseText.append(ch);
            }
        }
        return upperCaseText.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();
        scanner.close();
        
        String customUpperCase = convertToUpperCase(inputText);
        String builtInUpperCase = inputText.toUpperCase();
        
        boolean isSame = compareStrings(customUpperCase, builtInUpperCase);
        
        System.out.println("Custom Uppercase Conversion: " + customUpperCase);
        System.out.println("Built-in Uppercase Conversion: " + builtInUpperCase);
        System.out.println("Are both conversions identical? " + isSame);
    }
}