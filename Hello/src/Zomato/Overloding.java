package Zomato;

public class Overloding {
	String empName;
	String Eid;
	double salary;
	long phoneno;
	Overloding(String empName){
		this.empName=empName;
		
	}
	Overloding(String empName,String Eid){
		this.empName=empName;
		this.Eid=Eid;
	}
	Overloding(String empName,String Eid,double salary){
		this.empName=empName;
		this.Eid=Eid;
		this.salary=salary;
	}
	Overloding(String empName,String Eid,double salary,long phoneno){
		this.empName=empName;
		this.Eid=Eid;
		this.salary=salary;
		this.phoneno=phoneno;
	}
	public void printOverloding() {
		System.out.println("employee name is:" +empName);
		System.out.println("employee Eid is:" +Eid);
		System.out.println("employee salary is:" +salary);
		System.out.println("employee phoneno is:" +phoneno);
		
	}
	public static void main(String[] args) {
		
	}

}
