package Demo;
import java.util.Scanner;
class PhoneHistoryDrive {


	public static void main(String[] args) {
		Scanner phone=new Scanner(System.in);
		System.out.println("Enter phone brand:");
		String Pbrand=phone.nextLine();
		System.out.println("Enter phone price:");
		double Pprice=phone.nextDouble();
		System.out.println("Enter phone Operating System:");
		String Pos=phone.nextLine();
		//Pos=phone.next();
		System.out.println("Enter phone Ram:");
		int Pram=phone.nextInt();
		//Pram=phone.nextInt();
		PhoneHistory p=new PhoneHistory(Pbrand, Pprice, Pos, Pram);
		p.printPhoneHistorey();
		
	}

}
