//Swappig two number without using third variable.
package Demo;
import java.util.Scanner;
public class Swapping2 {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before Swapping:"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping:"+a+" "+b);
		

	}

}
