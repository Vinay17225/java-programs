package Demo;



public class EmployeeOverloding {
	public static void fatch(String Ename,int eid) {
		System.out.println("Ename");
		System.out.println("eid ");
		}
	public static void fatch(int eid) {
		System.out.println("eid");
		}
	public static void fatch(String ename,int eid,String email) {
		System.out.println("ename");
		System.out.println("eid");
		System.out.println("email");
	}
	public static void fatch(String ename,int eid,String email,String Address) {
		System.out.println("ename");
		System.out.println("eid");
		System.out.println("email");
		System.out.println("Address");
	}
	
	public static void main(String[] args) {
		fatch("vinay", 430);
		
		fatch("Rajeev",440,"rajeev123@gmail.com");
		fatch("Nitesh",450,"nitesh@gmail.com","Bangalore");
		
	}

}
