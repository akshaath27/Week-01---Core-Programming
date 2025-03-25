import java.util.Scanner;
public class d4q5
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int[] table=new int[10];
		for(int i=6;i<10;i++)
		{
		table[i]=num*i;
		}
		for(int i=6;i<10;i++)
		{
		 System.out.println(num +"*"+i +" = "+table[i]);
		}
	}
}
		 
		