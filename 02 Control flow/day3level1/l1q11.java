import java.util.Scanner;

public class l1q11 {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int sum=0;
        while(true){
            int n=scanner.nextInt();
            if(n<=0){
                break;
            }
            sum= sum+n;

        }
        System.out.println("total sum "+sum);
    }
}