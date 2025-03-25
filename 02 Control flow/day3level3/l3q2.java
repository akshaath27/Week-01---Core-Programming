import java.util.Scanner;

public class l3q2{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year=scanner.nextInt();
		if(year<=1582){
			System.out.println("Enter the year above 1581");
			
		}else{
			if(year%4==0 && year%100!=0 || year%400==0){
				
				System.out.println("The Entered Year is a leap year");
			}
			
		}
		
		
	}
}