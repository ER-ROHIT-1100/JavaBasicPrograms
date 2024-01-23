package looping;
import java.util.Scanner;
class MBN {
	 public static void main(String args[]) {

	       Scanner sc = new Scanner(System.in);

	       System.out.print("Enter m: ");

	        int m = sc.nextInt();

	       System.out.print("Enter n: ");

	         int n = sc.nextInt();

	         {
	    	  for (int i=m; i<=n; i++) 
	        	   
	        	   System.out.println(i);
	           }
	         for (int i=m;i>=n;i--) {
	        	 System.out.println(i);
	         }
	 }
}
	        

