import java.util.Scanner;
public class l1q4
{
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		int sum=num1*(num1+1)/2;
		if(num1>=1)
		{
			System.out.println("the sum of natural numbers"+sum);
		}
		else
		{
			System.out.println("this is not a natural number");
		}
	}
}
		