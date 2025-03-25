import java.util.Scanner;
public class d4q6
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		int team=11;
		int[] height=new int[team];
		double sum=0;
		System.out.println("the height of the players: ");
		for(int i=1;i<team;i++)
		{
		height[i]=input.nextInt();
		sum+=height[i];
		}
		double mean=sum/team;
		System.out.println("the mean height of the team is : "+mean);
	}
}

		

		
		