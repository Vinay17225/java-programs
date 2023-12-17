package Super;

public class Earphone extends Mobile {
	String brand2;
	 double cost;
	 String type;
	 Earphone(String brand, double price,String color,String os,String brand2,double cost,String type)
	 {
	 super(brand,price,color,os);
	 this.brand2=brand2;
	 this.cost=cost;
	 this.type=type;
	 }
	 public static void main(String[] args) {
		 
	 Earphone e = new Earphone("oneplus 10T", 56000.88, "black", "Android 13",
	"sony", 2800.0, "airpods");
	 
	 System.out.println(e.brand);
	 System.out.println(e.price);
	 System.out.println(e.color);
	 System.out.println(e.os);
	 System.out.println(e.brand2);
	 System.out.println(e.cost);
	 System.out.println(e.type);
	 }
}
