package Demo;
import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter two Number");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		System.out.println("Addation" +(a+b));
		System.out.println("substraction" +(a-b));
		System.out.println("multiplication" +(a*b));
		System.out.println("dividation" +(a/b));
		
		// TODO Auto-generated method stub

	}

}
