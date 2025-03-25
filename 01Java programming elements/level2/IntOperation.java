import java.util.Scanner;

public class IntOperation 
{
    public static void main(String[] args)
	{
        Scanner scanner= new Scanner(System.in);
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();

        double op1= a+b*c;
        double op2= a*b+c;
        double op3= c+a/b;
        double op4= a%b+c;

        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);
        System.out.println(op4);

    }
}