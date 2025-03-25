import java.util.Scanner;
import java.util.InputMismatchException;
public class d4q19{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of students :");
		int count=input.nextInt();
		double[] totalmarks=new double[count];
		double[][] marks= new double[3][count];
		double[] percentage= new double[count];
		char[] Grade= new char[count];
		for (int i=0;i<count;i++){
			marks[0][i]=validchecker(input,"Physics",i);
			marks[1][i]=validchecker(input,"Chemistry",i);
			marks[2][i]=validchecker(input,"Maths",i);
			totalmarks[i]=marks[0][i]+marks[1][i]+marks[2][i];
			percentage[i]=(totalmarks[i]/300)*100;
			if (percentage[i]<=39){
				Grade[i]='R';
			}
			else if (percentage[i]>=40 &&percentage[i]<=49){
				Grade[i]='E';
			}
			else if (percentage[i]>=50 &&percentage[i]<=59){
				Grade[i]='D';
			}
			else if (percentage[i]>=60 &&percentage[i]<=69){
				Grade[i]='C';
			}
			else if (percentage[i]>=70 &&percentage[i]<=79){
				Grade[i]='B';
			}
			else{
				Grade[i]='A';
			}
			System.out.println("Student "+(i+1)+" scored total marks: "+totalmarks[i]+" out of 300 and holds a percentage value of "+percentage[i]+" and secured Grade "+(Grade[i]));
		}
	}
	private static double validchecker(Scanner input,String Subject,int i){
		double marks=-1;
		while(true){
			try{
				System.out.println("Enter the marks of student :"+(i+1)+" for "+Subject);
				marks=input.nextDouble();
				if (marks<0){
					System.out.println("Invalid mark entry. Type again");
				}
				else{
					i++;
					return marks;
				}
			}catch (InputMismatchException e){
					System.out.println("Invalid input! Please enter a numerical value.");
				}
			}
		}
	}				