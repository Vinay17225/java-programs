package QspiderProgrammingDemo;

import java.util.Scanner;

public class PrimeNoOfRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int start=sc.nextInt();
		System.out.println("enter starting num");
		int start=sc.nextInt();
		System.out.println("enter end num");
		int end=sc.nextInt();
		for(int j=start;j<=end;j++) {
		int n=j;
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
			
		}
		if(count==2) {
			System.out.println(j);
		}
		}
		// TODO Auto-generated method stub

	}

}
