import java.util.Scanner;
public class d4q15{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=input.nextInt();
		int count=0;
		int number1=number;
		while (number1!=0){
			count++;
			number1=number1/10;
		}
		int[] reversenumber= new int[count];
		for (int i=0;i<count;i++){
			int n=number%10;
			reversenumber[i]=n;
			number=number/10;
		}
		for (int j=0;j<count;j++){
			System.out.print(reversenumber[j]+" ");
		}
	}
}