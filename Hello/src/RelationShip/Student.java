package RelationShip;
import java.util.Scanner;
public class Student {
	String Name;
	double Age;
	String gender;
	long phoneNo;
	School s;
	
	Student(String Name,double Age,String gender,long phoneNo,School s){
		this.Name=Name;
		this.Age=Age;
		this.gender=gender;
		this.phoneNo=phoneNo;
		this.s=s;
	}
	public void printStudent() {
		System.out.println("Student Name:"+Name);
		System.out.println("Student Age:"+Age);
		System.out.println("Student gender:"+gender);
		System.out.println("Student phoneNo:"+phoneNo);
		System.out.println("Student'S School Name:"+Name);
		System.out.println("Student'S School address:"+s.address);
		System.out.println("Students'S School dept:"+s.dept);
		}
	public static void main (String[]args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Student Name:");
    	String inputSname=sc.nextLine();
    	System.out.println("Enter Student Age:");
    	double inputSAge=sc.nextDouble();
    	System.out.println("Enter Student gender:");
    	String inputSgender=sc.nextLine();
    	inputSgender=sc.nextLine();
    	System.out.println("Enter Student PhoneNo:");
    	long inputSphoneNo=sc.nextLong();
    	System.out.println("Enter School Name(Students):");
    	String inputschoolName=sc.nextLine();
    	inputschoolName=sc.nextLine();
    	System.out.println("Enter School Address for Student:");
    	String inputschooladdress=sc.nextLine();
    	System.out.println("Enter dept  of Student:");
    	String inputschooldept=sc.nextLine();
    	Student s=new Student(inputSname,inputSAge,inputSgender,inputSphoneNo,new School(inputschoolName,inputschooladdress,inputschooldept));
    	s.printStudent();
    	 }
}

