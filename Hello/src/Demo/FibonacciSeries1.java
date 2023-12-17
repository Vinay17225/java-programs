package Demo;
//0 1 1 2 3 5 8 13 -------
import java.util.Scanner;
public class FibonacciSeries1 {

	public static void main(String[] args) {
		int term,a=0,b=1,c;
		System.out.println("Enter the term");
		Scanner sc=new Scanner(System.in);
		term=sc.nextInt();
		for(int i=1;i<=term; i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		// TODO Auto-generated method stub

	}

}
