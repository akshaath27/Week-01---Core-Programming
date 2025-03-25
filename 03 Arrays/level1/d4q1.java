import java.util.Scanner;
public class d4q1
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		int[] age=new int[10];
		
		for(int i=0;i<10;i++)
		{
			System.out.println("enter age of student: "+(i+1));
			age[i]=input.nextInt();
			
		}
		for(int i=0;i<10;i++)
		{
			if(age[i]>18)
			{
				System.out.println("can vote");
			}
			else
			{
				System.out.println("cant vote");
			}
		}
	}
}
		