package QspiderProgrammingDemo;

import java.util.Scanner;

public class SwapTwoNo {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter any number");
		a=sc.nextInt();
		System.out.println("Enter any number");
		b=sc.nextInt();
		System.out.println("Before number:"+a+" "+b);
		a=a+b;
		
		b=a-b;
		a=a-b;
		System.out.println("Before number:"+a+" "+b);
		// TODO Auto-generated method stub

	}

}
