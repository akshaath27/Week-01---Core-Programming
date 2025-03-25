import java.util.Scanner;

public class l3q4{
	
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		boolean isPrime=true;
		
		if(n<=1){
			isPrime= false;
		} else{
			for(int i=2;i<n;i++){
				if(n%i==0){
					isPrime=false;
					break;
				}else{
					isPrime=true;
				}
			}
		}
		if(isPrime){
			System.out.println("The given number is a Prime number");
		}else{
			System.out.println("The given number is not a Prime number");
		}
	}
}