package Demo;
class Dadaji{
	void car() {
		System.out.println("Car is BMW Company");
	}
	
}
class Papaji extends Dadaji{
	void Bus() {
		System.out.println("Bus is TATA Company");
	
	}
}
class Vinay extends Papaji{
	void Cycle() {
		System.out.println("Cycle is Hero Company");
	
	}
	
}
public class MultiLevelInheritance1 {

	public static void main(String[] args) {
		Vinay v=new Vinay();
		v.car();
		v.Bus();
		v.Cycle();
		
	}

}
