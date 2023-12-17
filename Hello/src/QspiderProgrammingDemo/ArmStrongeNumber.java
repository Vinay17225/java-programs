package QspiderProgrammingDemo;

public class ArmStrongeNumber {

	public static void main(String[] args) {
		int n=153;
		int temp=n;
		int count=0;
		int sum=0;
		int temp1=n;
		while(n>0) {
			
			count++;
			n=n/10;
		}
		while(temp>0) {
			int digit =temp%10;
			int power=1;
			for(int i=1;i<=count;i++) {
				power=power*digit;
			}
			sum=sum+power;
			temp=temp/10;
		}
		System.out.println(sum);
			if(temp1==sum) {
			
			System.out.println("Armstrong Number");
		}
	
	 else {
			System.out.println("Not Armstrong Number");
		}
	}

}
