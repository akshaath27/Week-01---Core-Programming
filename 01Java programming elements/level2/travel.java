import java.util.Scanner;

public class travel
{
    public static void main(String[] args) 
	{
        Scanner scanner=new Scanner(System.in);
        System.out.println("name");
        String name=scanner.nextLine();
        System.out.println("from");
        String from=scanner.nextLine();
        System.out.println("to");
        String to=scanner.nextLine();
        System.out.println("via");
        String via=scanner.nextLine();
        System.out.println("from to via distance ");
        double fromTovia=scanner.nextDouble();
        System.out.println("via to to distance");
        double viaToto=scanner.nextDouble();
        System.out.println("from to via time in min");
        double fromToviatime=scanner.nextDouble();
        System.out.println("via to to time in min");
        double viaTototime=scanner.nextDouble();
        double totaldistance= fromTovia+ viaToto;
        double totaltime= fromToviatime+ viaTototime;
        System.out.println("Total Distance"+totaldistance);
        System.out.println("Total Time"+ totaltime);
    }
}