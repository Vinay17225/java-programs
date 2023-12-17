package Demo;

public class PrimeNo_OrNot {

	public static void main(String[] args) {
		int a=13, count=0;
		for(int i=2;i>=a-1;i++) {
			if(a%i==0) {
				count ++;
				}
		}
		if(count==2) {
			System.out.print("This is prime Number:");
		}
		else {
			System.out.println("Not a Prime Number:");
		}
	}

}
