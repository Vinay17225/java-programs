package Demo;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(s1.length() == s2.length()) {
			char[] a1=s1.toCharArray();
			char[] a2=s2.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(a2);
			boolean result=Arrays.equals(a1, a2);
			if(result) {
				System.out.println("Strings are Anagram");
			}
				else
					System.out.println("String are not Anagram");
			}
		
				
		}
		
	}


	


