import java.util.Scanner;
public class l2q2
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		int salary=input.nextInt();
		int years=input.nextInt();
		if(years>5)
		{
			salary=(salary+salary/5);
			System.out.println(salary);
		}
		else
		{
			System.out.println(salary);
		}
	
	}
}
		