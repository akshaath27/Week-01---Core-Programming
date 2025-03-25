import java.util.Scanner;
public class d4q13{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=input.nextInt();
		int[] maxDigit= new int[10];
		for (int i=0;i<10;i++){
			if (number!=0){
				int n=number%10;
				maxDigit[i]=n;
				number=number/10;
			}
			else{
				break;
			}
		}
		int largest=0;
		int larger=0;
		for (int i=0;i<maxDigit.length;i++){
			if (maxDigit[i]>largest){
				larger=largest;
				largest=maxDigit[i];
			}
			else if (maxDigit[i]>larger){
				larger=maxDigit[i];
			}
		}
		System.out.println("Largest number is "+largest+" and second largest number is "+larger );
	}
}
			
				
			
				
		