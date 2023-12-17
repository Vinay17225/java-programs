package Amazone;
import java.util.Scanner;
public class Amazon  {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean exit=true;
		while(exit) {
			System.out.println("Enter the choice");
			System.out.println("1 order SmartPhone");
			System.out.println("2 order Groceries");
			System.out.println("3 order Food");
			System.out.println("4 order clothes");
			System.out.println("5 Exit from the application");
			int choice=sc.nextInt();
			switch(choice){
			case 1:{
				System.out.println("order shmart phone Secessfuly");
			}
			break;
			case 2:{
				System.out.println("order Groceries Secessfuly");
				
			}
			break;
			case 3:{
				System.out.println("order Food Secessfuly");
			}
			break;
			case 4:{
				System.out.println("order Clothes Secessfuly");
			}
			break;
			case 5:{
				System.out.println("Exit the Applications");
			}
			break;
			default:{
				System.out.println("Termanate the applications");
			}
			}
			
		}
		

	}

}
