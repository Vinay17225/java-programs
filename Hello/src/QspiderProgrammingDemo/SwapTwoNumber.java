package QspiderProgrammingDemo;
//swap two number using third variable
import java.util.Scanner;
public class SwapTwoNumber {

	public static void main(String[] args) {
		int a,b,temp;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			System.out.println("Enter the number");
			b=sc.nextInt();
			System.out.println("Before swaping" +a+" "+b);
			temp=a;
			a=b;
			b=temp;
			System.out.println("After swaping" +a+" "+b);
			
			
		}
		// TODO Auto-generated method stub

	}


