import java.util.Scanner;
public class calculator
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		int number1;
		int number2;
		number1=input.nextInt();
		number2=input.nextInt();
		System.out.println("the addition,subtraction ,multiplication and division"+(number1+number2)+"and"+(number1-number2)+"and"+(number1*number2)+"and"+(number1/number2));
	}
}
		