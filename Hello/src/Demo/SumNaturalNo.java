package Demo;
import java.util.Scanner;
public class SumNaturalNo {

	public static void main(String[] args) {
		int n,sum=0;
		System.out.print("Enter Number of Term");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		for(int i=1; i<=n; i++) {
			sum=sum+i;
		}
		System.out.println("Addation"+ sum);
		// TODO Auto-generated method stub

	}

}
