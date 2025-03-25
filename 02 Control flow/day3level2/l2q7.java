import java.util.Scanner;
public class l2q7
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if(num>=1)
		{
			for(int i=1;i<num;i++)
			{
				if(num%i==0)
				{
					System.out.println(i);
				}
			}
		}
		else
		{
			System.out.println("the number is not posirive");
		}
	}
}
					
