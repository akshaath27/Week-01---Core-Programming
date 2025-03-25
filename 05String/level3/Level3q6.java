import java.util.Scanner;
public class Level3q6 {
    public static String[] findCharacterFrequency(String text) {
        text = text.toLowerCase();
        char[] charArray = text.toCharArray();
        int[] frequency = new int[charArray.length];
        for (int i = 0; i < frequency.length; i++) {
            frequency[i] = 0;
        }
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != '0') {
                frequency[i] = 1; 
                for (int j = i + 1; j < charArray.length; j++) {
                    if (charArray[i] == charArray[j]) {
                        frequency[i]++; 
                        charArray[j] = '0'; 
                    }
                }
            }
        }
        String[] result = new String[charArray.length];
        int index = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != '0') { 
                result[index] = charArray[i] + ": " + frequency[i];
                index++;
            }
        }
        String[] trimmedResult = new String[index];
        System.arraycopy(result, 0, trimmedResult, 0, index);
        return trimmedResult;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        String[] frequencyResult = findCharacterFrequency(text);
        System.out.println("Character Frequencies:");
        for (String result : frequencyResult) {
            System.out.println(result);
        }
        scanner.close();
    }
}
