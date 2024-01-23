package looping;
import java.util.Scanner;
class OddNo{
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value:");
	int n = sc.nextInt();
    for(int i=n; i>=1; i--) {
		if(i%2==1)	
		System.out.println(i+" ");
		sc.close();
	}
 }
}
