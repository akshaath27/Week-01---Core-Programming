import java.util.Scanner;

public class swap
{
    public static void main(String[] args) 
	{
        Scanner scanner=new Scanner(System.in);
        System.out.println("a: ");
        double a=scanner.nextDouble();

        System.out.println("b: ");
        double b=scanner.nextDouble();
        double temp;

        temp=a;
        a=b;
        b=temp;

        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}