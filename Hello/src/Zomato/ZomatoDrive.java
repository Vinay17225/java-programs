package Zomato;
import java.util.Scanner;
public class ZomatoDrive {

	public static void main(String[] args) {
		Scanner Zomato=new Scanner(System.in);
		System.out.println("Enter food name:");
		String fname =Zomato.nextLine();
		System.out.println("Enter food price:");
		double fprice=Zomato.nextDouble();
		System.out.println("Enter food Address:");
		String address=Zomato.nextLine();
		address=Zomato.nextLine();
		System.out.println("Enter food quantity:");
		int quantity=Zomato.nextInt();
		quantity=Zomato.nextInt();
		
		Zomato z1=new Zomato(fname,fprice,address,quantity);
		z1.printzomato();

	}

}
