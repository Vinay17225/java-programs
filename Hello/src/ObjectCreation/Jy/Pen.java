package ObjectCreation.Jy;

public class Pen {
	String brand="cello";
	double price=25.5;
	String color="blue";


public void write(){
	System.out.println("writing the test cases:");
}
public void throwing() {
	System.out.println("Throws The pen:");
	
}
public void breaking() {
	System.out.println("Breaks The Pen");
	return ;
}
public static void main (String[]args) {
	Pen p=new Pen();
	System.out.println(p.brand);
	System.out.println(p.price);
	System.out.println(p.color);
	p.write();
	p.throwing();
	p.breaking();
	
	
}


}