package Demo;

public class Overloding {
	public void m1(int a) {
		System.out.println("value of a:=" +a);
	}
	float sum;
	public void m1(int a,float b) {
		sum=a+b;
		System.out.println("Addation of the value:=" + sum);
	}
	double add;
	public void m1(float b,int a, double c) {
		add=b+a+c;
		System.out.println("Sum of the value: =" +add);
	}
	public static void main(String[] args) {

		Overloding obj=new Overloding();
		obj.m1(6);
		obj.m1(1,(float)2.0);
		obj.m1((float)1.0,2,(double)2.0);
	}

}
