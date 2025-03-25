import java.util.Scanner;
public class d4q2{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int[] num=new int[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the number "+(i+1));
			num[i]=input.nextInt();
			
		}
		for(int i=0;i<5;i++)
		{
			if(num[i]<0)
			{
				System.out.println("its negative");
				
			}
			else if(num[i]==0)
			{
				System.out.println("its zero");
			}
			else
			{
				System.out.println("its positive");
				if(num[i]%2==0)
				{
					System.out.println("its even");
				}
				else
				{
					System.out.println("its odd");
				}
			}
		}
		int first=num[0];
		int last=num[num.length-1];
		if(first>last)
		{
			System.out.println("first is greater");
		}
		else if(first==last)
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("last is greater");
		}	
	}
}
		