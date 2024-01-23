package looping;
import java.util.Scanner;
class AvgFirst {
	 public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the value:");
		int n = sc.nextInt();
		int sum =0;  int avg;
		for(int i=1; i<=n; i++)
		  sum= sum+i;
		{
		 avg=sum/n;
		}
	    
		System.out.println(avg);
	 }	 
 }
