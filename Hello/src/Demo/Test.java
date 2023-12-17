package Demo;

class Test1 {
	void show(int a) {
		System.out.println("Value of a="+a);
		
	}
}
	class Child extends Test{
		void show(int b) {
			System.out.println("value of b="+b);
		}
	}
	
	
class Test{
	public static void main(String[] args) {
		Child obj=new Child();
		obj.show(10);
		
		Test1 obj1=new Test1();
		
		obj1.show(20);

		
		
	}

}
