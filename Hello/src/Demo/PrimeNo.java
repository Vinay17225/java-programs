package Demo;
import java.util.Scanner;
public class PrimeNo {

	public static void main(String[] args) {
		int n,count=0;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter any Numbers:");
		n=r.nextInt();
		
		for(int i = 2; i<=n/2; i++) {
			if (n%i==0) {
				count++;
			}
			
			}
		if(count==0) {
			System.out.println(" Prime Number:");
		}
			else {
		System.out.println("Not Prime Number:");
			}
			}
		}
		
	

