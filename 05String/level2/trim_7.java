import java.util.Scanner;
import java.util.Arrays;
public class trim_7{
	public static boolean getcompare(String substr,String sentence){
		for (int i=0;i<substr.length();i++){
			if (substr.charAt(i)!=sentence.charAt(i)){
				return false;
			}
		}
		return true;
	}
	public static String getsubstring(int[] startend,String sentence){
		String substr="";
		int start=startend[0];
		int end=startend[1];
		for (int i=start;i<=end;i++){
			substr=substr+sentence.charAt(i);
		}
		return substr;
	}
		
	public static int[] gettrim(String sentence){
		int[] startend=new int[2];
		for (int i=0;i<sentence.length();i++){
			if (sentence.charAt(i)!=' '){
				startend[0]=i;
			}
		}
		for (int i=sentence.length()-1;i>=0;i--){
			if (sentence.charAt(i)!=' '){
				startend[1]=i;
			}
		}
		return startend;
	}	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String sentence=input.nextLine();
		int[] startend=trim_7.gettrim(sentence);
		String substr=trim_7.getsubstring(startend,sentence);
		String trimsentence=sentence.trim();
		boolean result=trim_7.getcompare(substr,trimsentence);
		System.out.println(result);
	}
}