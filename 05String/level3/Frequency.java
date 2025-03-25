import java.util.Scanner;

public class Frequency {
    public static char[] uniqueCharacters(String text) {
        StringBuilder unique = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (unique.indexOf(String.valueOf(ch)) == -1) {
                unique.append(ch);
            }
        }
        return unique.toString().toCharArray();
    }

    public static String[][] findCharacterFrequency(String text) {
        char[] uniqueChars = uniqueCharacters(text);
        int[] frequency = new int[uniqueChars.length];
        
        for (int i = 0; i < uniqueChars.length; i++) {
            for (int j = 0; j < text.length(); j++) {
                if (uniqueChars[i] == text.charAt(j)) {
                    frequency[i]++;
                }
            }
        }
        
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        scanner.close();

        String[][] result = findCharacterFrequency(text);
        System.out.println("Character Frequencies:");
        for (String[] entry : result) {
            System.out.println(entry[0] + ": " + entry[1]);
        }
    }
}