import java.util.Scanner;
public class d5q7
{
	public static int sumofnn(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum;
	}
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		try{
			System.out.println("enter positive number:");
			int n=scanner.nextInt();
			if(n<1)
			{
				System.out.println("enter positive number");
			}
			else{
				System.out.println("the sum of "+n+"="+sumofnn(n));
			}
		}
		catch(Exception e){
			System.out.println("invalid input");
		}
		finally
		{
			scanner.close();
		}
	}
}