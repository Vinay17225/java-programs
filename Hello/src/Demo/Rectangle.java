package Demo;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner rectangle=new Scanner(System.in);
		System.out.println("Enter length of Rectangle:");
		double length=rectangle.nextDouble();
		System.out.println("Enter brath of Rectangle:");
		double brath=rectangle.nextDouble();
		System.out.println("Area of rectangle is:"+(length*brath));
		

	}

}
