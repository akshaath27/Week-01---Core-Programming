import java.util.Scanner;
public class kilo
{
	public static void main(String []args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println();
		int km;
		km=input.nextInt();
		double miles=km*1.6;
		System.out.println("the total miles is"+miles+"no of kms is"+km);
	}
}