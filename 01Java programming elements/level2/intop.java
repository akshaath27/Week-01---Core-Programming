import java.util.Scanner;
public class intop
 {
    public static void main(String[] args)
	{
        Scanner scanner= new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();

        int op1= a+b*c;
        int op2= a*b+c;
        int op3= c+a/b;
        int op4= a%b+c;

        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);
        System.out.println(op4);

    }
}