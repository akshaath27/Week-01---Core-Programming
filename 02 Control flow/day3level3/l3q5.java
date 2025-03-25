import java.util.Scanner;

public class l3q5{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int sum=0;
		int originalNum=n;
	
		while(n!=0){
		
			int digit=n%10;
			sum=sum+digit*digit*digit;
			n=n/10;
		}
		if(sum==originalNum){
			System.out.println("The number is armstrong number");
		}else{
			System.out.println("The number is not armstrong number");
		}
		scanner.close();
	}
}