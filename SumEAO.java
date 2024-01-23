package looping;

import java.util.Scanner;

class SumEAO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		int osum=0; int esum=0; 
		do{
			int d = n%10;
			if(d%2==0) {
                 esum = esum+d;
			}else {
					osum = osum+d;
			}
			n=n/10;
			}while(n!=0);
			System.out.println("Sum of Even digit:"+esum);
			System.out.println("Sum of Odd digit:"+osum);
		}
}