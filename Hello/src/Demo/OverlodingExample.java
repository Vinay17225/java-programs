package Demo;

public class OverlodingExample {
	float c, sum;//
	void  m1(int a, float b) {
		c= a+b;
		System.out.println(c);
		
	}
	void m1(float b, int a) {
		sum=b+a;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		OverlodingExample obj=new OverlodingExample();
		obj.m1((float )2.0, 2);
		obj.m1(1, (float) 1.0);
		}

}
