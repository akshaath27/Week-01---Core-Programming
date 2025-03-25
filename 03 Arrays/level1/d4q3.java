import java.util.Scanner;
public class d4q3
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int[] table=new int[11];
		for(int i=1;i<=10;i++)
		{
		table[i]=num*i;
		}
		for(int i=1;i<=10;i++)
		{
		 System.out.println(num +"*"+i +" = "+table[i]);
		}
	}
}
		 
		