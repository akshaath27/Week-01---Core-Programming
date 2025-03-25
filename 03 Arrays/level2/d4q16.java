import java.util.Scanner;
public class d4q16{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of persons :");
		int count=input.nextInt();
		double[] weight= new double[count];
		double[] height= new double[count];
		double[] BMI= new double[count];
		String[] Status= new String [count];
		for (int i=0;i<count;i++){
			System.out.println("Enter the weight in kg:");
			weight[i]=input.nextDouble();
			System.out.println("Enter the Height in m:");
			height[i]=input.nextDouble();
		}
		for (int i=0;i<count;i++){
			double BMI_calc=(weight[i]/(height[i]*height[i]))*10000;
			if (BMI_calc<=18.4){
				BMI[i]=BMI_calc;
				Status[i]="Underweight";
			}
			else if(BMI_calc>=18.5 && BMI_calc<=24.9){
				BMI[i]=BMI_calc;
				Status[i]="Normal";
			}
			else if(BMI_calc>=25.0 && BMI_calc<=39.9){
				BMI[i]=BMI_calc;
				Status[i]="Overweight";
			}
			else{
				BMI[i]=BMI_calc;
				Status[i]="Obese";
			}
		}
		for (int i=0;i<count;i++){
			System.out.println("Person"+(i+1)+"has height"+height[i]+" , weight of "+weight[i]+" and a BMI Value of "+BMI[i]+" with a status of "+Status[i]);
		}
	}
}