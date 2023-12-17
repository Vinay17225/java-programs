package Demo;

public class fibbo {

	public static void main(String[] args) {
		int n =20, a=0, b=1;
		System.out.println("Fibbonacci series till " + n+ "element");
		for(int  i=1;i<=n; i++) {
			System.out.print(a+", ");
			int c= a + b;
			a = b;
			b = c;
		}

	}

}
