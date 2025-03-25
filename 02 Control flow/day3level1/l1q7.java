import java.util.Scanner;
public class l1q7
{
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		String month=scanner.nextLine();
		int day=scanner.nextInt();
		if(month.equals("march"))
		{
			if(day>=20)
			{
				System.out.println("spring season");
			}
			else
			{
				System.out.println("not spring season");
			}
			
		}
		else if((month.equals("april"))||(month.equals("may")))
		{
			System.out.println("spring season");
		}
		else if(month.equals("june"))
		{
			if(day<=20)
			{
				System.out.println("spring season");
			}
			else
			{
				System.out.println("not spring season");
			}
		}
		else
		{
			System.out.println("not spring season");
		}
	}
}
		