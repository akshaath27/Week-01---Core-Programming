import java.util.Scanner;
public class l1q2
{
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		int num3=scanner.nextInt();
		if((num1>num2)&&(num1>num3))
		{
			System.out.println("number 1 is the greatest number");
		}
		else if((num2>num1)&&(num2>num3))
		{
			System.out.println("number 2 is the greatest number");
		}
		else
		{
			System.out.println("number 3 is the greatest number");
		}
	}
}
		