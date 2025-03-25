import java.util.Scanner;

public class CharacterComparison{
    public static char[] customToCharArray(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();
        scanner.close();

        char[] customArray = customToCharArray(text);
        char[] builtInArray = text.toCharArray();
        boolean comparisonResult = compareCharArrays(customArray, builtInArray);

        System.out.println("Characters using custom method: " + new String(customArray));
        System.out.println("Characters using toCharArray(): " + new String(builtInArray));
        System.out.println("Comparison result: " + comparisonResult);
    }
}
