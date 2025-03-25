import java.util.Scanner;
public class Level2q14{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int power=input.nextInt();
		if (num<0 || power<0){
			System.out.println("Not positive number");
		}
		else{
			int result=1;
			int i=1;
			while(i<=power){
				result=result*num;
				i++;
			}
			System.out.println(result);
		}
	}
}