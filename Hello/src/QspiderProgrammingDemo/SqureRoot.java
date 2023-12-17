package QspiderProgrammingDemo;

public class SqureRoot {

	public static void main(String[] args) {
	int n=9;
	boolean a=false;
	for(int i=1;i<=9;i++) {
		if(i*i==n) {
			System.out.print(i);
			a=true;
			break;
		}
	}
	if(a==false) {
		System.out.println(n+"Not a Squre Root");
	}
	}

}
