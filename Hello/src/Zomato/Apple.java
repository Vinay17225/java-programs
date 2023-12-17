package Zomato;
public class Apple extends Fruit {
			 String color;
			 double price;
			 Apple(String origin,double weight,String color,double price)
			 {
			 super(origin,weight);
			 this.color=color;
			 this.price=price;
			 }
			 public static void main(String[] args) {
			 Apple a=new Apple("Banglore",44.5,"Red",77.7);
			 //System.out.println(a.color);
			 System.out.println(a.origin);
			 System.out.println(a.weight);
			 System.out.println(a.price);
			 System.out.println(a.color);

	}

}
