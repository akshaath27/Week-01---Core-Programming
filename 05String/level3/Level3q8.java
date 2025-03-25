import java.util.Scanner;
public class Level3q8 {
    public static boolean areAnagrams(String text1, String text2) {
        text1 = text1.toLowerCase();
        text2 = text2.toLowerCase();
        text1 = text1.replaceAll("\\s", "");
        text2 = text2.replaceAll("\\s", "");
        if (text1.length() != text2.length()) {
            return false;
        }
        int[] freqText1 = new int[256]; 
        int[] freqText2 = new int[256];
        for (int i = 0; i < text1.length(); i++) {
            freqText1[text1.charAt(i)]++;
            freqText2[text2.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freqText1[i] != freqText2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();
        boolean areAnagrams = areAnagrams(text1, text2);
        if (areAnagrams) {
            System.out.println(text1 + " and " + text2 + " are anagrams.");
        } else {
            System.out.println(text1 + " and " + text2 + " are not anagrams.");
        }
        scanner.close();
    }
}
