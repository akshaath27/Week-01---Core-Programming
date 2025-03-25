import java.util.Scanner;
public class price
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		double price=input.nextDouble();
		double quantity=input.nextDouble();
		double totalprice=price*quantity;
		
		System.out.println("total price in rupees"+totalprice+"where the price is"+price+"the quantity is "+quantity);
	}
}
		