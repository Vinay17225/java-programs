package Demo;

import java.util.Scanner;
public class ReverseString2 {

	public static void main(String[] args) {
		String str="";
		System.out.println("Enter to reverse string:");
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter to reverse string:");
		str=sc.next();
		String reverse=" ";

	
	for(int i=str.length()-1;i>=0;i--) {
		reverse=reverse+str.charAt(i);
	}
	System.out.print("reverse string is :"+reverse);
}
}