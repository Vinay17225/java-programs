package RelationShip;

public class Laptop {
	String brand ;
	String Color;
	double price;
	double storage;
	String os;
	Speaker s;
	
	Laptop(String brand, String Color,double price,double storage,String os,Speaker s){
		this.brand=brand;
		this.Color=Color;
		this.price=price;
		this.storage=storage;
		this.os=os;
		this.s=s;
		
	}
	public static void main(String[] args) {
		Laptop l=new Laptop("Acer","Black",50500,500,"Windows",new Speaker("Samsung"));
			System.out.println("laptop brand:"+l.brand);
			System.out.println("laptop Color:"+l.Color);
			System.out.println("laptop price:"+l.price);
			System.out.println("laptop storage:"+l.storage);
			System.out.println("laptop os:"+l.os);
			System.out.println("Speaker:"+l.s.Brand);
	}        
	
}
