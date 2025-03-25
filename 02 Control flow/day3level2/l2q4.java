import java.util.Scanner;
public class l2q4
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if(num>=1)
		{
		  for (int i=1;i<=num;i++)
		  {
			  if(i%15==0)
			  {
				  System.out.println("FIZZBUZZ");
			  }
			  else if(i%5==0)
			  {
				  System.out.println("FIZZ");
			  }
			  else if(i%3==0)
			  {
				  System.out.println("BUZZ");
			  }
			  else
			  {
				  System.out.println(i);
			  }
		  }
		}
		else
		{
			System.out.println("not positive");
		}
	}
}
				  
		