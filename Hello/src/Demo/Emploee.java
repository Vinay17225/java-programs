package Demo;

public class Emploee {
	String name;
	int Emp_id;
	
	Emploee(String name,int Emp_id)
	{
	this. name=name;
	this .Emp_id=Emp_id;
	}
	public static void main(String[] args) {
		
		Emploee e1 = new Emploee("ajit",10001);
		Emploee e2 = new Emploee("Rajeev",10002);
		System.out.println("Emploee 1 :"+e1.name+" "+e1. Emp_id);
		System.out.println("Emploee 2 :"+e2.name+" "+e2. Emp_id);
		
	}

}
