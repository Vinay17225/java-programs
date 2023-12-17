package Demo;
class Parent{
	void bike(){
		System.out.println("Bike is Hero");
		
	}
}
class Child1 extends Parent {
	void cycle() {
		System.out.println("Cycle is Hero");
	}
}

public class SingalInheritance1 {

	public static void main(String[] args) {
		Child1 c=new Child1();
		c.bike();
		c.cycle();
		 
		
		

	}

}
