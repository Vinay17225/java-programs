package Demo;
//input number =153 ----->(1*1*1 + 5*5*5 + 3*3*3)
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		int n,arm=0,rem,c;
		System.out.println("Enter any Number");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		c=n;
		while(n>0) {
			
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
			
		}
		if(c==arm) {
			System.out.println("Armstrong Number="+arm);
		}
		else {
			System.out.println("Not Armstrong Number="+arm);
		}
		

	}

}
