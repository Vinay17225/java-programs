package Demo;

import java.util.Scanner;

public class Stringreverse {


		 static void toLowerMethod() {
	       System.out.println("Enter a String");
	       Scanner r=new Scanner(System.in);
	       String str=r.next();
	       System.out.println("Original String::::: "+str);
	       String strLowercase=str.toLowerCase();
	       System.out.println("String in Lowercase::: "+strLowercase);
	       String strUppercase=strLowercase.toUpperCase();
	       System.out.println("String in Uppercase::: "+strUppercase );
			
		}
		
		  public static void main(String[] args){
			 // Stringreverse obj = new Stringreverse();
			  Stringreverse.toLowerMethod();
			}

}
