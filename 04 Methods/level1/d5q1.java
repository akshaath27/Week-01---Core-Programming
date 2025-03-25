import java.util.Scanner;

	public class d5q1
	{
		double calculatesimpleintrest(double principal,double rate,double time)
		{
			return(principal*rate*time)/100;
		}
		public static void main(String[]args){
			Scanner input=new Scanner(System.in);
			System.out.println("enter principal");
			double principal=input.nextDouble();
			System.out.println("enter rate");
			double rate=input.nextDouble();
			System.out.println("enter time ");
			double time=input.nextDouble();
			
			d5q1 calculator=new d5q1();
			double interest=calculator.calculatesimpleintrest(principal,rate,time);
			System.out.println("the simple intrest is:"+interest+"the principal:"+principal+"the rate of interest"+rate+"the time:"+time);
		}
	}

