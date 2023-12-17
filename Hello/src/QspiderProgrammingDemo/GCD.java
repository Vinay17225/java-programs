package QspiderProgrammingDemo;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		int a,b,gcd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		a=sc.nextInt();
		System.out.println("Enter any number");
		b=sc.nextInt();
		for(int i=1;i<=a && i<=b;i++) {
			if(a%i==0&&b%i==0) {
				gcd=i;
			}
		}
		
		System.out.println(gcd);

	}

}
