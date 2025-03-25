import java.util.Scanner;
import java.util.Arrays;
public class split2{
	public static String[] Splitword(String word,int count){
		boolean isword=false;
		int wordcount=0;
		for(int i=0;i<count;i++){
			if (word.charAt(i)!=' ' && !isword){
				wordcount++;
				isword=true;
			}
			else if (word.charAt(i)==' '){
				isword=false;
			}
		}
		int[] spaceIndexes=new int[wordcount+1];
		int spacecount=0;
		spaceIndexes[spacecount++]=-1;
		for (int i=0;i<count;i++){
			if (word.charAt(i)==' '){
				spaceIndexes[spacecount++]=i;
			}
		}
		spaceIndexes[spacecount]=count;
		
		String[] words=new String[wordcount];
		for (int i=0;i<wordcount;i++){
			words[i] = word.substring(spaceIndexes[i] + 1, spaceIndexes[i + 1]);
		}
		return words;
	}		
	public static int Stringlength(String word){
		int count=0;
		try{
			while(true){
				word.charAt(count);
				count++;
			}
		}
			catch(StringIndexOutOfBoundsException e){
				return count;
			}
		}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String word=input.nextLine();
		int count=split2.Stringlength(word);
		String[] wordarray=split2.Splitword(word,count);
		System.out.println(Arrays.toString(wordarray));
		System.out.println(Arrays.toString(word.split(" ")));
	}
}
		
		