package SeyfertSoft;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		String str=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		str=sc.next();
		String reverse=" ";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reverse String"  +reverse);
		// TODO Auto-generated method stub

	}

}
