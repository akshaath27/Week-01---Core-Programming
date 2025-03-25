import java.util.Scanner;
import java.util.Arrays;
public class vowelstype_6{
	public static String[] getvowelsORconsonantORletter(char ch){
		char[] vowels={'a','e','i','o','u'};
		String vowel=new String(vowels);
		String[] result1=new String[2];
			if(vowel.indexOf(ch)!=-1){
				result1[0]=String.valueOf(ch);
				result1[1]="Vowels";
				return result1;
			}
			else if (vowel.indexOf(ch)==-1 && ch>='a' && ch<='z'){
				result1[0]=String.valueOf(ch);
				result1[1]="Consonant";
				return result1;
		}
		else{
			result1[0]=String.valueOf(ch);
			result1[1]="Not a letter";
			return result1;
		}
	}
	public static String getformattedsentence(String sentence){
		String formatted_sentence="";
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
		String formatted_sentence=vowelstype_6.getformattedsentence(sentence);
		String[][] result= new String[formatted_sentence.length()][2];
		int i=0;
		for (char ch:formatted_sentence.toCharArray()){
		String[] result2=vowelstype_6.getvowelsORconsonantORletter(ch);
		result[i][0]=String.valueOf(result2[0]);
		result[i][1]=result2[1];
		i++;
	}
	System.out.println(Arrays.deepToString(result));
}
}