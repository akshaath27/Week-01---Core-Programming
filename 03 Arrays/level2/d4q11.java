import java.util.Scanner;
public class d4q12{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] age=new int[3];
		double[] height=new double[3];
		for (int i=0;i<3;i++){
			System.out.println("Enter age of "+(i+1)+" Friend");
			age[i]=input.nextInt();
			System.out.println("Enter height of "+(i+1)+" Friend");
			height[i]=input.nextDouble();
		}
		int min=age[0];
		int val1=0;
		double max=height[0];
		int val2=0;
		for (int j=1;j<3;j++){
			if (age[j]<min){
				min=age[j];
				val1=j;
			}
			if (height[j]>max){
				max=height[j];
				val2=j;
			}
		}
		System.out.println("Friend "+val1+"is the youngest");
		System.out.println("Friend "+val2+"is the tallest");
	}
}