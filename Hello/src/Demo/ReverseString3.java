package Demo;

//import java.util.Scanner;

public class ReverseString3 {

	public static void main(String[] args) {
		String str=" Vinay";
		//System.out.println("Enter the String");
		//Scanner sc=new Scanner(System.in);
		//str=sc.next();
		String reverse =" ";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		
		System.out.println("reverse string is:"+reverse);

	}

}
