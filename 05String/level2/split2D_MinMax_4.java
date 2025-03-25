import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
public class split2D_MinMax_4{
	public static int getstringlength(String sentence){
		int index=0;
		while(true){
			try{
				sentence.charAt(index);
				index++;
			}
			catch (StringIndexOutOfBoundsException e){
				return index;
			}
		}
	}
	public static int getwordcount(String sentence){
			int wordcount=0;
			boolean isword=true;
			int length=split2D_MinMax_4.getstringlength(sentence);
			for (int i=0;i<length;i++){
				if (sentence.charAt(i)!=' ' && isword){
					wordcount++;
					isword=false;
				}
				else if (sentence.charAt(i)==' '){
					isword=true;
				}
			}
			return wordcount;
	}
	public static String[][] getsplitwords(String sentence){
			int wordcount=split2D_MinMax_4.getwordcount(sentence);
			int length=split2D_MinMax_4.getstringlength(sentence);
			int[] spacecount=new int[wordcount+1];
			spacecount[0]=-1;
			int j=1;
			for(int i=0;i<length;i++){
				if (sentence.charAt(i)==' '){
					spacecount[j]=i;
					j++;
				}
			}
			spacecount[wordcount]=length;
			String[][] Splitwords=new String[wordcount][2];
			for (int i=0;i<wordcount;i++){
				Splitwords[i][0]=sentence.substring(spacecount[i]+1,spacecount[i+1]);
				Splitwords[i][1]=String.valueOf(split2D_MinMax_4.getstringlength(Splitwords[i][0]));
			}
			return Splitwords;
	}
	public static int[] getminmax(String[][] arr,String sentence){
		int[] result=new int[2];
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int wordcount=split2D_MinMax_4.getwordcount(sentence);
		for (int i=0;i<wordcount;i++){
			min=Math.min(min,Integer.parseInt(arr[i][1]));
			max=Math.max(max,Integer.parseInt(arr[i][1]));
		}
		result[0]=min;
		result[1]=max;
		return result;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String sentence=input.nextLine();
		String[][] result=split2D_MinMax_4.getsplitwords(sentence);
		int[] result1=split2D_MinMax_4.getminmax(result,sentence);
		System.out.println(Arrays.toString(result1));
		}
	}