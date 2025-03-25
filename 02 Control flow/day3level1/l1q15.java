import java.util.Scanner;

public class l1q15{
	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int sum=1;
		if(n<0){
			System.out.println("Enter a positive number");
	
		} while(n>0){
			
			sum=sum*n;
			n=n-1;
		}
		
		
		System.out.println("Factorial is "+sum);
			
		
	}
}