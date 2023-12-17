package Demo;
import java.util.Scanner;

public class PrimeNo1 {

	public static void main(String[] args) {
		int n,temp=0;
		System.out.println("Enter any Number");
		Scanner sc=new Scanner (System.in);
		n=sc.nextInt();
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println("It is prime number");
			}
		else {
			System.out.println("Number is not prime");
			
		}
	}

}
