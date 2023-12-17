package Demo;
import java.util.Scanner;
public class ArmstrongNo {

	public static void main(String[] args) {
		int n,rem,arm=0,x;
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		x=n;
		while(n>0) {
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(x==arm) {
			System.out.println(" the Armstrong Number:");
			 
		}
		else {
			System.out.println("not armstrong Number:");
		}
		

	}

}
