import java.util.Scanner;
public class l1q1
{
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		if(number%5==0)
		{
			System.out.println("is the number "+number+" divisible by 5? YES");
		}
		else
		{
			System.out.println("is the nummber"+number+"is divisible ny 5? No");
		}
	}
}
