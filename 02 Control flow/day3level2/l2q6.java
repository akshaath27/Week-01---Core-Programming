import java.util.Scanner;
public class l2q6{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int age1,age2,age3;
		age1=input.nextInt();
		age2=input.nextInt();
		age3=input.nextInt();
		double height1,height2,height3;
		height1=input.nextDouble();
		height2=input.nextDouble();
		height3=input.nextDouble();
		
		if (age1<age2 && age1<age3){
			System.out.println(age1+": Amar is the youngest" );
		}
		else if (age2<age1 && age2<age3){
			System.out.println(age2+": Akbar is the youngest" );
		}
		else{
		System.out.println(age3+": Anthony is the youngest" );}
		
		if (height1>height2 && height1>height3){
			System.out.println(height1+":Amar is the tallest" );
		}
		else if (height2>height1 && height2>height3){
			System.out.println(height2+": Akbar is the tallest" );
		}
		else {
			System.out.println(height3+"Anthony is the tallest" );
		}	
	}
}