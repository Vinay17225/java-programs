package Abstraction.java;


import java.util.Scanner;
public class Vinay extends ICICI {
	
	@Override
	public int login(String UserName,String pwd) 
	{
		Scanner input=new Scanner (System.in);
		System.out.println("Enter your UserName:");
		String valiUserName=input.nextLine();
		System.out.println("Enter your pwd:");
		String valipwd=input.next();
		System.out.println("Press L to login:");
		char valiL=input.next().charAt(0);
		 if(valiL=='L'||valiL=='l'){
			System.out.println("Login sucess"+UserName);
			if(valiUserName.equalsIgnoreCase(UserName)&& valipwd.equals(pwd)) 
			{
				System.out.println("Login Sucess"+UserName);
				
			}
			else {
				System.out.println("Invalid Credentials:");
			}
		 }
			else {
				System.out.println("Invalide input Entered cannot Login Sorry");
			}
			return 420;
		}
		 public static void main(String[] args) {
			 Scanner input=new Scanner (System.in);
			 System.out.println("Enter your UserName:");
			 String UserName = input.nextLine();
			 System.out.println("Enter your Pwd:");
			 String enterPwd=input.next();
			 Vinay v=new Vinay();
			 v.login(UserName,enterPwd);
			 
		 
		
	}
	

}
