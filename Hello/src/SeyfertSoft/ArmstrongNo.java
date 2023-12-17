package SeyfertSoft;
import java.util.Scanner;
public class ArmstrongNo {

	public static void main(String[] args) {
		int n,rem ,sum=0,temp;
		System.out.println("Enter any Number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0) {
			rem=n%10;
			sum=(rem*rem*rem)+sum;
			n=n/10;
			if(temp==sum) {
				System.out.println("This is armstrong number:");
			}
			else {
				System.out.println("This is not armstrong number:");
			}
		}
		
		

	}

}
