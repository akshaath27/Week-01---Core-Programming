import java.util.Scanner;
public class l2q11
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if(num>=1)
		{
		  for (int i=100;i>=1;i--)
		  {
			  if(num%i==0)
			  {
				  System.out.println(i);
				  continue;
			  }
		  }
		}
		  
		else
		{
			System.out.println("not positive");
		}
	}
}
				  
		
		