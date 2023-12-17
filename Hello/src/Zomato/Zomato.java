package Zomato;

public class Zomato {
	String foodname;
	double foodprice;
	String Address;
	int quantity;
	
	Zomato(String Foodname,double foodprice, String Address,int quentity){
		this.foodname=foodname;
		this.foodprice=foodprice;
		this.Address=Address;
		this.quantity=quantity;
	}
	public void printzomato() {
		System.out.println("Food name is:"+foodname);
		System.out.println("Food price is:"+foodprice);
		System.out.println("Food Address is:"+Address);
		System.out.println("Food quantity is:"+quantity);
	}
}