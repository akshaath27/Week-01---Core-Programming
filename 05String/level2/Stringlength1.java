import java.util.Scanner;
public class Stringlength1{
	 public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String word;
		word=input.next();
		int count=Stringlength1.Stringlength(word);
		System.out.println("The length of the word is : "+count);
		System.out.println("The length of the word is : "+word.length);
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
	
}