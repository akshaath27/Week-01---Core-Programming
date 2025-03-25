import java.util.Scanner;
public class l1q12{
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		int n=scanner.nextInt();
		int N=n;
		int sum=0;
		
		while(n>0){
			sum=sum+n;
			n=n-1;
			
		}
		System.out.println("with while loop "+sum);
		
		double result= (N*(N+1.0))/2;
		System.out.println("withh formula "+result);
		
	}
	
}