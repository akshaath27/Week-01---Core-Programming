import java.util.Scanner;
public class college
{
	public static void main(String []args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println();
		int fee;
		int discountp;
		fee=input.nextInt();
		discountp=input.nextInt();
		int discountamt=fee/discountp;
		int finalfee=fee-discountamt;
		System.out.println("the discount amount in inr"+discountamt+"and final discounted fee="+finalfee);
	}
}