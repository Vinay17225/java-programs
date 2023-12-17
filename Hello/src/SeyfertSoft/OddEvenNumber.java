package SeyfertSoft;

import java.util.Scanner;
public class OddEvenNumber {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter any number");
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0) {
			System.out.println("This is even Number:");
			}
		else {
			System.out.println("This is Odd Number:");
		}
		

	}

}
