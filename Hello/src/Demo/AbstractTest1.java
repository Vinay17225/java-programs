package Demo;

abstract class animal{
	abstract void sound();
}

class Dog extends animal{
	  void sound() {
		System.out.println("Dog is Barking");
		
	}
}
class Lion extends animal{
	 void sound() {
		System.out.println("Lion is Roar");
	}
}

public class AbstractTest1 {
	public static void main(String[] args) {
		Dog D=new Dog();
		Lion L=new Lion();
		D.sound();
		L.sound();
	}

}
