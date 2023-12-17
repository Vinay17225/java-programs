package Demo;
class Sii {
	protected int roll,marks;
	String name;
	protected void input() {
		
		System.out.println("Enter roll name & marks:");
		
	}
}
	
class Vinay2 extends Sii{
		
		void disp()
		{
			int a = 121;
			int roll = 123; String name="Vinay";
			int marks=80;
			
			System.out.println(roll+" "+name+ " "+marks);
		}
	}
public class Simple1 {
	public static void main (String []args) {
		Vinay2 v=new Vinay2();
		v.disp();
	}

}
