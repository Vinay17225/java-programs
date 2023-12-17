package Demo;
import java.util.Scanner;
public class PalindromeExample {

	public static void main(String[] args) {
		int n, r, sum=0, temp;
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			 }
		if(temp==sum) {
			System.out.println("polindrome number");
		}
		else {
			System.out.println("Not polindrome number");
		}
		
	}

}
