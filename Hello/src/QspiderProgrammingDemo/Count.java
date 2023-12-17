package QspiderProgrammingDemo;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		int n;
		int count=0;
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0) {
			int digit=n%10;
			System.out.println(digit);
			count++;
			n=n/10;
		}
		System.out.println(count);
	}

}
