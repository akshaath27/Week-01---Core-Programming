import java.util.Scanner;

public class l3q3{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the marks for physics: ");
		int phy=scanner.nextInt();
		System.out.print("Enter the marks for Chemistry: ");
		int chem=scanner.nextInt();
		System.out.print("Enter the marks for Maths: ");
		int math=scanner.nextInt();
		double marks= phy+chem+math;
		double avg= marks/3;
		double percentage= marks/300*100;
		
		String grade;
		String remarks;
		if(avg>=80){
			grade="A";
			remarks="Level 4, above agency-normalized standards";
		}else if(avg>=70 && avg<=80){
			grade="B";
			remarks="Level 3, at agency-normalized standards";
		}else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }
		
		System.out.printf("Average marks %.2f ",avg);
		System.out.print("\nGrade: "+grade);
		System.out.print("\nRemarks: "+remarks);
	}
}