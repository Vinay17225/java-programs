package RelationShip;
import java.util.Scanner;
public class TV {
	String brand;
	double price;
	String type;
	Display d;
	
	TV(String brand,double price,String type,Display d){
		this.brand=brand;
		this.price=price;
		this.type=type;
		this.d=d;
	}
	public void printTV() {
		System.out.println("TV brand:"+brand);
		System.out.println("TV price :"+price);
		System.out.println("TV type:"+type);
		System.out.println("TV Display:"+d.inches);
	}
	public static void main (String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter TV brand:");
		String inputbrand=sc.nextLine();
		System.out.println("Enter TV Price :");
		double inputprice=sc.nextDouble();
		System.out.println("Enter TV type:");
		String inputtype=sc.nextLine();
		inputtype=sc.nextLine();
		System.out.println("Enter TV display inches:");
		double inputinches=sc.nextDouble();
		
		TV t=new TV(inputbrand,inputprice,inputtype,new Display(inputinches));
		t.printTV();
	}

}
