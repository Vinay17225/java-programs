package Demo;


import java.util.Scanner;
public class IfElse {
	//static int n;
	public static void main(String[] args) {
		int n;
		System.out.print("Enter any number");
		Scanner r=new Scanner("System.in");
		n=r.nextInt();
		if(n>0) {
			System.out.print("+ve number");
			
		}
		else {
			System.out.println("-ve number");
			
		}
		
	}

}

