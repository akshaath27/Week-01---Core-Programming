import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class rock_paper_scissors_9{
	public static void showdisplay(String[][] finalresults){
		for (String[] row:finalresults){
			for (String elements:row){
				System.out.println(elements+"\t");
			}
		System.out.println();
		}
	}
	public static String[][] getavg_percent(int[] result,int rounds){
		String[][] finalresults=new String[2][2];
		double userstats=(double)result[0]/rounds;
		double computerstats=(double)result[1]/rounds;
		double userpercent= (double)userstats*100;
		double computerpercent=(double)computerstats*100;
		finalresults[0][0]=String.valueOf(userstats);
		finalresults[1][0]=String.valueOf(computerstats);
		finalresults[0][1]=String.valueOf(userpercent);
		finalresults[1][1]=String.valueOf(computerpercent);
		return finalresults;
	}
		
	public static void getwinner(int[] result){
		if (result[0]>result[1]){
			System.out.println("You are the Winner");
		}
		else if (result[0]<result[1]){
			System.out.println("Computer is the Winner");
		}
		else{
			System.out.println("Match Tied");
		}
	}
	public static int[] game(int rounds){
		Scanner input=new Scanner(System.in);
		int[] result=new int[2];
		int userwins=0;
		int computerwins=0;
		for (int i=0;i<rounds;i++){
			System.out.println("Choose a number 1. Rock 2. Paper 3. Scissors :");
			int choice=input.nextInt();
			int computer_choice=rock_paper_scissors_9.getcomputerchoice();
			if (choice==1 && computer_choice==3){
				System.out.println("You won the round: Rock beats Scissors");
				userwins++;
			}
			else if (computer_choice==1 && choice==1){
				System.out.println("Computer won the round: Rock beats Scissors");
				computerwins++;
			}
			else if (choice==1 && computer_choice==2){
				System.out.println("Computer wins the round: Paper beats Rock");
				computerwins++;
			}
			else if (choice==2 && computer_choice==1){
				System.out.println("You won the round: Paper beats Rock");
				userwins++;
			}
			else if (choice==3 && computer_choice==2){
				System.out.println("You won the round: Scissors beats Paper");
				userwins++;
			}
			else if (choice==2 && computer_choice==3){
				System.out.println("Computer won the round: Scissors beats Paper");
				computerwins++;
			}
			else{
				System.out.println("Tie");
			}
		}
		result[0]=userwins;
		result[1]=computerwins;
		return result;
	}	
	public static int getcomputerchoice(){
		Random random=new Random();
		int computer_choice=random.nextInt(3);
		return computer_choice;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the no of rounds to play with computer :");
		int rounds=input.nextInt();
		int[] result=rock_paper_scissors_9.game(rounds);
		rock_paper_scissors_9.getwinner(result);
		String[][] avg_percent=rock_paper_scissors_9.getavg_percent(result,rounds);
		rock_paper_scissors_9.showdisplay(avg_percent);
		}
}
		