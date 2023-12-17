package Demo;
import java.util.Scanner;
public class OddNo {

	public static void main(String[] args) {
		int n;
		System.out.print("Enter the term");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		for(int i=1; i<=n; i=i+2) {
			System.out.print(i +" ");
		}
		// TODO Auto-generated method stub

	}

}
