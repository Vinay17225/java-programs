package SeyfertSoft;

import java.util.Scanner;
public class Swapping {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter any Number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("After the Swapping"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Before the Swapping"+a+" "+b);
		
		
		
	}

}
