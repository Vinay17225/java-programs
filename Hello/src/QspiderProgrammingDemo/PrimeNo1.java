package QspiderProgrammingDemo;

import java.util.Scanner;

public class PrimeNo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		
		int count=0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
	
			if(count==2) {
				System.out.println("This is PrimeNo");
			}
			else {
				System.out.println("This is not PrimeNo");
			}
		}
		
}
	


