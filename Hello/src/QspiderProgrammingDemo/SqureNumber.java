package QspiderProgrammingDemo;

public class SqureNumber {

	public static void main(String[] args) {
		int a=9;
		int squre=a*a;
		int count=0;
		int sum=0;
		while(squre>0) {
			count=squre%10;
			sum=sum+count;
			squre=squre/10;
		}
		if(sum==a) {
			System.out.println(a+"this is nion number ");
		}
		else {
			System.out.println(a+"this is not nion number ");
		}
	}

}
