package Demo;

import java.util.Scanner;

public class ArrayReverseUserInput {

	public static void main(String[] args) {
	int a[]=new int [5];
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the array value");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		}
	System.out.println("Array elements ");
	for(int i=0;i<a.length;i++) {
		//System.out.print(a[i]+" ");
	}
		for(int i=a.length-1;i>=0;i--) {
		
		System.out.print(a[i]+ " ");

}
		
}
}