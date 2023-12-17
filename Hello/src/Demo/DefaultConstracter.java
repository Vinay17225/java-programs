package Demo;

public class DefaultConstracter {
	int rollNo;
	String name;
	String className;
	DefaultConstracter(int a,String n,String c){
		this.rollNo=a;
		this.name=n;
		this.className=c;
		System.out.println("This is a Parametrize constructor");
	}
	
	DefaultConstracter(){
		System.out.println("This is a default constructor");
	}
	public static void main(String[] args) {
		DefaultConstracter obj=new DefaultConstracter(111,"Rohan","Master Computer of Application");
		System.out.println(obj.rollNo);
		System.out.println(obj.name);
		System.out.println(obj.className);
	}

}
