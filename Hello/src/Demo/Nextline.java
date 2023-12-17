package Demo;

import java.util.Scanner;

public class Nextline {

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the string:: ");
	        String s = scan.next();
	        s += scan.nextLine();
	        System.out.println("String: " + s);

	    }
	}


