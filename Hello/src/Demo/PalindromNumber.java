package Demo;
import java.util.Scanner;
public class PalindromNumber {

	public static void main(String[] args) {
		int n,rem,sum=0,temp;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0) {
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("This is a palindrom Number:");
			
		}
		else {
			System.out.println("This is a not palindrom Number:");
		}
		

	}

}
