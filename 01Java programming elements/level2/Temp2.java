import java.util.Scanner;

public class Temp2 
{
    public static void main(String[] args) 
	{
        Scanner scanner=new Scanner(System.in);
        double fah=scanner.nextDouble();
        double cel= (fah-32)*5/9;

        System.out.println(cel);
    }
}