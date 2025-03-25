import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class votecheck_8{
	public static void tabularprint(String[][] result){
		for (String[] row:result){
			for(String element:row){
				System.out.println(element+"\t");
			}
			System.out.println();
		}
	}
	public static String[][] votecheck(int[] age_arr){
		String[][] result=new String[age_arr.length][2];
		int i=0;
		for (int num:age_arr){
			if (num>=18){
				result[i][0]=String.valueOf(num);
				result[i][1]="Eligible to vote";
				i++;
			}
			else{
				result[i][0]=String.valueOf(num);
				result[i][1]="Not Eligible to vote";
				i++;
			}
		}
		return result;
	}
	public static int[] getagearr(int student_count){
		int[] age_arr=new int[student_count];
		Random random=new Random();
		for(int i=0;i<student_count;i++){
			age_arr[i]=random.nextInt(90)+10;
		}
		return age_arr;
	}
			
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int student_count=input.nextInt();
		int[] age_arr=votecheck_8.getagearr(student_count);
		String[][] result=votecheck_8.votecheck(age_arr);
		votecheck_8.tabularprint(result);
	}
}