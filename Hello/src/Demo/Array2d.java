package Demo;
import java.util.Scanner;
public class Array2d {

	public static void main(String[] args) {
		
		int a[][]=new int[3][4];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter arrays Elements:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				a[i][j]=sc.nextInt();
			}
		}
			System.out.print("matrix: \n");
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				
		System.out.print(a[i][j]+ "  ");
	}
			System.out.print("\n");
		}
		}
	}

