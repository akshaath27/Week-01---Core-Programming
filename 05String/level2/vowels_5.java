import java.util.Scanner;
import java.util.Arrays;
public class vowels_5{
	public static int getvowelscount(String formatted_sentence){
		int count=0;
		char[] vowels={'a','e','i','o','u'};
		String vowel=new String(vowels);
		for(char ch:formatted_sentence.toCharArray()){
			if(vowel.indexOf(ch)!=-1){
				count++;
			}
		}
		return count;
	}
	public static int getconsonantcount(String formatted_sentence){
		int count=0;
		char[] vowels={'a','e','i','o','u'};
		String vowel=new String(vowels);
		for(char ch:formatted_sentence.toCharArray()){
			if(vowel.indexOf(ch)==-1 && ch>='a' && ch<='z'){
				count++;
			}
		}
		return count;
	}
	public static String getformattedsentence(String sentence){
		String formatted_sentence=" ";
		for (char ch:sentence.toCharArray()){
			if (ch>='A' && ch<='Z'){
				formatted_sentence=formatted_sentence+(char)(ch+32);
			}
			else{
				formatted_sentence=formatted_sentence+ch;
			}
		}
		return formatted_sentence;
	}
				
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		String sentence=input.nextLine();
		String formatted_sentence=vowels_5.getformattedsentence(sentence);
		int vowelcount=vowels_5.getvowelscount(formatted_sentence);
		int consonantcount=vowels_5.getconsonantcount(formatted_sentence);
		int [] result= new int[2];
		result[0]=vowelcount;
		result[1]=consonantcount;
		System.out.println(Arrays.toString(result));
	}
}
	