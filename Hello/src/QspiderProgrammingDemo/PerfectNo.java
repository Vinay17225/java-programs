package QspiderProgrammingDemo;
//Sum of each fectors except the number
public class PerfectNo {

	public static void main(String[] args) {
		int n=7;
		int sum=0;
		for(int i=1;i<n;i++) {
			
			if(n%i==0) {
				sum=sum+i;
			}}
			if(sum==n) {
				System.out.println("This is a Perfect Number");
				
			}
			else {
				System.out.println("Not a Prime Number");
			}
		}
		

	}


