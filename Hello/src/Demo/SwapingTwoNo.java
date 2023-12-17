package Demo;
import java.util.Scanner;
public class SwapingTwoNo {

	public static void main(String[] args) {
		int a,b,temp;
		System.out.println("Enter Two Number");
		Scanner sc=new Scanner (System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before Swaping:"+a+" " +b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swaping:"+a+" " +b);
		// TODO Auto-generated method stub

	}

}
