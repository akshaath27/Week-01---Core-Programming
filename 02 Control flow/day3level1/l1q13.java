import java.util.Scanner;
public class l1q13{
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		int n=scanner.nextInt();
		int N=n;
		int sum=0;
		
		for(int i=n;i>0;i--){
			
			sum=sum+i;
		}
		
		
		System.out.println("with while loop "+sum);
		
		double result= (N*(N+1.0))/2;
		System.out.println("withh formula "+result);
		
	}
	
}