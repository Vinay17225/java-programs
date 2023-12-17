package Demo;
import java.util.Scanner;
public class EvenOddAdd {

	public static void main(String[] args) {
		int n, i, sum=0;
		System.out.println("Enter the Term");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		if(n%2==0) {
			for(i=0 ;i<=n; i=i+2) {
				sum=sum+i;
			}
			System.out.println("Sum of Even Number" + sum);
		}
		else {
			for(i=1; i<=n; i=i+2) {
				sum=sum+i;
			}
			System.out.println("Sum of Odd Number" + sum);
		}

	}

}
