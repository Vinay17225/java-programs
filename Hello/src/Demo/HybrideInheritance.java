package Demo;

class SuperClass10 {
	void mainA(float a) {
		System.out.println("Enter the value of a="+a);
	}
}
class Sub20 extends SuperClass10 {
	void mainB(int b) {
		System.out.println("Enter the value of b="+b);
	}
}
class Sub21 extends SuperClass10 {
	void mainC(double c) {
		System.out.println("Enter the value of c="+c);
	}
}
class Sub22 extends Sub21 {
	void mainD() {
		System.out.println("Enter the d method");
	}
}

public class HybrideInheritance {

	public static void main(String[] args) {
		Sub21 obj=new Sub21();
		obj.mainC(90);
		obj.mainC(2);
		obj.mainA(2);
		Sub22 obj1=new Sub22();
		obj1.mainD();
		obj1.mainC(20);
		obj1.mainA(12);
		Sub20 obj2=new Sub20();
		obj2.mainB(12);
		obj2.mainA(41);
	}

}
