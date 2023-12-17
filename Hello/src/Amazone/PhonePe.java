package Amazone;

import java.util.Scanner;

public class PhonePe {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			boolean exit=true;
			while(exit) {
				System.out.println("Enter the choice");
				System.out.println("1 Second Money");
				System.out.println("2 Recieve money");
				System.out.println("3 Check balance");
				
				System.out.println("4 Exit from the application");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:{
					System.out.println("Enter the Second money");
					
				}
				break;
				case 2:{
					System.out.println("Enter the Recieve money");
				}
				break;
				case 3:{
					System.out.println("Enter the Check Balance");
				}
				break;
				case 4:{
					System.out.println("Exit from the application");
				}
				break;
				default:{
				System.out.println("Terminate the Applications");
				}
			}
		}
	}

}
