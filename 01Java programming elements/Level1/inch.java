import java.util.Scanner;
public class inch
{
	public static void main(String []args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println();
		int height;
		height=input.nextInt();
		double inch=height/2.54;
		double feet=inch/12;
		
		System.out.println("your height in cm is"+height+"while in feet"+feet+"in inches"+inch);
	}
}