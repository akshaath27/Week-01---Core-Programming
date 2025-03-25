import java.util.Scanner;
public class division
 {
    public static void main(String[] args)
	{
        Scanner scanner=new Scanner(System.in);
        double dividend=scanner.nextDouble();
        double divisor=scanner.nextDouble();
        double quotient=dividend/divisor;
        double remainder=dividend%divisor;
        System.out.println(quotient);
        System.out.println(remainder);

    }
}