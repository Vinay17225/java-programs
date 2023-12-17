package Demo;

import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {
		int a,count=0;
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int i=1; i<=a; i++)
		{
			if(a%i==0) 
			{
				count++;
				}
		}
		if(count==2) 
			System.out.println("prime number");
		else {
			System.out.println("Not prime number");
		}

	}

}
