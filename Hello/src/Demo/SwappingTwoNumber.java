package Demo;

import java.util.Scanner;

public class SwappingTwoNumber {

	public static void main(String[] args) {
		int x,y,temp;
		System.out.println("Enter The Value Of x and y");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before Swapping"+x +y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("After SWapping"+x +y);
		
		// TODO Auto-generated method stub

	}

}
