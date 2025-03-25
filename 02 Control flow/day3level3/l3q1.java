import java.util.Scanner;
public class l3q1
{
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the year : ");
		int year=scanner.nextInt();
		if(year<=1582)
		{
			System.out.println("enter year after 1582");
		}
		else
		{
			if(year%4==0)
			{
				if(year%100==0)
				{
					if(year%400==0)
					{
						System.out.println("its is a leap year");
					}
					else
					{
						System.out.println("its n ot");
					}
				}
					else
					{
						System.out.println("its is a leap year");
					}
			}
					else
					{
						System.out.println("it is not leap year");
					}
				
			
		}
	}
}
