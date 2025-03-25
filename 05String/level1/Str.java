import java.util.Scanner;

public class Str{
    public static char[] customToCharArray(String str) {
        int length = 0;
        try {
            while (str.charAt(length) != '\0') {
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        
        char[] charArray = new char[length];
        for (int i = 0; i < length; i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void displayCharArray(char[] array) {
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();
        scanner.close();

        char[] customArray = customToCharArray(text);
        char[] builtInArray = text.toCharArray();
        boolean comparisonResult = compareCharArrays(customArray, builtInArray);

        System.out.print("Characters using custom method: ");
        displayCharArray(customArray);
        System.out.print("Characters using toCharArray(): ");
        displayCharArray(builtInArray);
        System.out.println("Comparison result: " + comparisonResult);
    }
}
