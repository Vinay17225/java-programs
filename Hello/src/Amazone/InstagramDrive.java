package Amazone;
import java.util.Scanner;
public class InstagramDrive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name");
		String enterName=sc.nextLine();
		System.out.println("Enter your pwd");
		int enterpwd=sc.nextInt();
		System.out.println("Enter your phone number");
		long enterPhoneNo=sc.nextLong();
		System.out.println("Enter your chats");
		String enterChats=sc.nextLine();
		System.out.println("Enter your stories");
		String enterStories=sc.nextLine();
		
		Instagram i=new Instagram(enterName,enterpwd,enterPhoneNo,enterChats,enterStories);
		System.out.println("Account created SucessFully!");
		boolean exit=true;
		while(exit) {
			System.out.println("***Welcome to Instagram!");
			System.out.println("Enter your choices");
			System.out.println("1.update name");
			System.out.println("2.update Passward");
			System.out.println("3.Update phoneNo");
			System.out.println("4.update chats");
			System.out.println("5.update stories");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter your new Passward:");
				String updateName=sc.nextLine();
				updateName=sc.nextLine();
				i.userName=updateName;
				System.out.println("Sucessfully Updated user Name)");
				}
			break;
			case 2:{
				System.out.println("Enter your old passward:");
				int userInputerpwd=sc.nextInt();
				if(i.getpwd()==userInputerpwd) {
					System.out.println("createntials Matched");
					System.out.println("Enter your new passward");
					i.setpwd(enterpwd);
					System.out.println("Update passward Successfully!");
				}
				else {
					System.out.println("Invalid credentials");
				}
			}
			break;
			case 3:{
				System.out.println("enter your new chat:");
				String updatechat=sc.nextLine();
				i.setchats(updatechat);
				System.out.println("update chats successfull!");
			}
			break;
			case 4:{
				System.out.println("chat"+i.getchats());
				}
			break;
			case 5:{
				System.out.println("stories:");
			}
			break;
			case 6:{
				System.out.println(("userName:"+i.userName));
				System.out.println("passward:"+i.getpwd());
				System.out.println("phoneNumber"+i.getphoneNo());
			}
			break;
			case 7:{
				exit=false;
				System.out.println("THANK YOU FOR USING THIS iNSTAGRAM " );
			}
			break;
			default:{
				System.out.println("Invalid option please try again");
			}
			}
			
			
		}

	}

}
