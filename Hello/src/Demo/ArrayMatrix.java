package Demo;

import java.util.Scanner;
public class ArrayMatrix {

	public static void main(String[] args) {
		int a[][]=new int[2][2];
		//System.out.println("enter the element Array:");
		Scanner r=new Scanner(System.in);
		System.out.println("enter the element Array:");
		for(int i=0; i<2;i++) {
			for(int j=0; j<2;j++) {
				a[i][j]=r.nextInt();
				//System.out.print("matrix: /n");
				}
			
		}
		System.out.print("matrix: \n");
		for(int i=0; i<2;i++) {
			for(int j=0; j<2;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		// TODO Auto-generated method stub

	}

}
