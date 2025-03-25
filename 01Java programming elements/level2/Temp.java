import java.util.Scanner;

public class Temp
 {
    public static void main(String[] args) 
	{
        Scanner scanner=new Scanner(System.in);
        double cel=scanner.nextDouble();
        double fah= (cel*9.0/5)+32;

        System.out.println(fah);
    }
}