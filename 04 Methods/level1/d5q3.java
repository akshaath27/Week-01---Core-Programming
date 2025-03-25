import java.util.Scanner;
public class d5q3
{
	public static int triangle(double a ,double b,double c){
		double perimeter=a+b+c;
		double run=5000;
		return(int)Math.ceil(run/perimeter);
	}
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		try{
			System.out.println("enter the length of first side:");
			double side1=scanner.nextDouble();
			System.out.println("enter the length of 2nd side:");
			double side2=scanner.nextDouble();
			System.out.println("enter the length of 3rd side:");
			double side3=scanner.nextDouble();
			if(side1 <=0 ||side2<=0 ||side3<=0){
				System.out.println("plz enter valid values");
			}
			else
			{
				System.out.println("the athlete to complete:"+triangle(side1,side2,side3)+"rounds");
			}
		}
		catch(Exception e){
			System.out.println("Invalid input");
		}
		finally{
			scanner.close();
		}
	}
}
			