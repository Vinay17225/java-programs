package Demo;
class SuperClass1{
	void superClassMethod(int a) {
		System.out.println("value of a=" + a);
	}
}
class SubClass11 extends SuperClass1{
	void method1(float b,int a ) {
		float sum;
		sum= a+b;
		System.out.println("sum  of a,b is "+ sum);
		
	}
}
class SubClass22 extends SubClass11{
	void method2(float b,int a,double c) {
		double add;
		add=a+b+c;
		System.out.println("Sum of the value a,b,c="+add);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		SubClass22 obj=new SubClass22();
		obj.superClassMethod(20);
		obj.method1((float)2.0,1);
		obj.method2((float)9.0, 4, (double) 2.0);
		

	}

}
