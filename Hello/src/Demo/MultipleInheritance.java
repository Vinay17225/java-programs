package Demo;
  
interface R{
	void Show();
		}
interface S{
	void Show();
}

public class MultipleInheritance implements R,S {
	public void Show() {
		System.out.println("Interface A,B");
	}

	public static void main(String[] args) {
		MultipleInheritance obj=new MultipleInheritance();
		obj.Show();
	}
}

