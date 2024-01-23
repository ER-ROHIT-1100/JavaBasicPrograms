package looping;
import java.util.Scanner;
class Divisible {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = sc.nextInt();
		System.out.println("multiples of 4 and 7 within " + n + ":");
		for(int i=1; i<=n; i++)
	    if(i%4==0 && i%7==0)
	    	System.out.println(i);
	 }
}