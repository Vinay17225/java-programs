package QspiderProgrammingDemo;

public class SunnyNumber {

	public static void main(String[] args) {
		int n=8;
		int n1=n+1;
		boolean a = true;
		for(int i=1;i<=n;i++) {
			if(i*i==n1) {
			System.out.println(n+" "+"is a Sunny number");
			a=true;
			break;
		}
		}
		if(a==false) {
			System.out.println(n+"not sunny number");
		}
	}
	

}
