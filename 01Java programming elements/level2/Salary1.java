import java.util.Scanner;

public class Salary1
{
    public static void main(String[] args) 
	{
        Scanner scanner=new Scanner(System.in);
        double s=scanner.nextDouble();
        double vb=scanner.nextDouble();
        double ts=s+vb;

        System.out.println(ts);

    }
}