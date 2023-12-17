package Demo;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int size,i;
		Scanner r=new Scanner(System.in);
		size=r.nextInt();
		System.out.println("Enter the size of Array Element");
		size=r.nextInt();
		int a[]=new int[size];
		for( i=0;i<size;i++) {
			a[i]=r.nextInt();
		System.out.println("arrays elements"+a[i]);
		}
		System.out.println("printed Array Element");
		for( i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
