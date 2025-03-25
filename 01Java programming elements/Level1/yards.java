import java.util.Scanner;
public class yards
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		double distanceinfeets=input.nextDouble();
		double distanceinyards=distanceinfeets/3;
		double distanceinmiles=distanceinyards/1760;
		System.out.println("the distanceinfeets"+distanceinfeets+"the distanceinyards"+distanceinyards+"the distanceinmiles"+distanceinmiles);
	}
}
		