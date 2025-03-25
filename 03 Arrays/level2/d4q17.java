import java.util.Scanner;
public class d4q17{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of persons :");
		int count=input.nextInt();
		double[][] persondata= new double[3][count];
		String[] Status= new String [count];
		for (int i=0;i<count;i++){
			System.out.println("Enter the weight in kg:");
			persondata[0][i]=input.nextDouble();
			System.out.println("Enter the Height in m:");
			persondata[1][i]=input.nextDouble();
		}
		for (int i=0;i<count;i++){
			double BMI_calc=(persondata[0][i]/(persondata[1][i]*persondata[1][i]))*10000;
			if (BMI_calc<=18.4){
				persondata[2][i]=BMI_calc;
				Status[i]="Underweight";
			}
			else if(BMI_calc>=18.5 && BMI_calc<=24.9){
				persondata[2][i]=BMI_calc;
				Status[i]="Normal";
			}
			else if(BMI_calc>=25.0 && BMI_calc<=39.9){
				persondata[2][i]=BMI_calc;
				Status[i]="Overweight";
			}
			else{
				persondata[2][i]=BMI_calc;
				Status[i]="Obese";
			}
		}
		for (int i=0;i<count;i++){
			System.out.println("Person"+(i+1)+"has height"+persondata[1][i]+" , weight of "+persondata[0][i]+" and a BMI Value of "+persondata[2][i]+" with a status of "+Status[i]);
		}
	}
}
		