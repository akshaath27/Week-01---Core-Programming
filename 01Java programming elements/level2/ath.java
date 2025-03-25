import java.util.Scanner;
public class ath
{
	public static void main(String args[])
	{
		double side1,side2,side3;
		Scanner input=new Scanner(System.in);
		side1=input.nextDouble();
		side2=input.nextDouble();
		side3=input.nextDouble();
		System.out.println("The total number of rounds the athlete will run is"+((side1+side2+side3)/5) +"to complete 5 km");
	}
}