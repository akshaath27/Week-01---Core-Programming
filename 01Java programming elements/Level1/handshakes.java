import java.util.Scanner;
public class handshakes
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		double numberofstudents=input.nextDouble();
		double possiblehandshakes=(numberofstudents*(numberofstudents-1)/2);
		
		System.out.println("total number of handshakes"+possiblehandshakes);
	}
}
		