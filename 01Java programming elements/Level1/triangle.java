import java.util.Scanner;
public class triangle
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		double base=input.nextDouble();
		double height=input.nextDouble();
		double area=0.5*base*height;
		double inch=area/2.54;
		double feet=inch/12;
		System.out.println("the area="+area+"in inch"+inch+"in feet"+feet);
	}
}
		