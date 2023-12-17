package Demo;
import java.util.Scanner;
interface Client{
	void main();
	void main2();
}

class Ravi implements Client{
	String name;
	static int a;
	double sal;
	
	public void main() {
		Scanner r=new Scanner (System.in);
		System.out.println("Enter user name:");
		name = r.nextLine();
		System.out.println("Enter Salary:");
		sal=r.nextDouble();

	}
	
	public void main2() {
		System.out.println(name+" "+sal);
		
	}
	
}
public class InterfaceJava {

	public static void main(String[] args) {
		Ravi c=new Ravi();
		c.main();
		c.main2();
	}

}
