package Demo;

class SuperClass
{
    void methodA()
   {
      System.out.println("method of Class A");
   }
}
class SubClass1 extends SuperClass
{
	
    void methodB()
   {
      System.out.println("method of Class B");
   }
}
class SubClass2 extends SuperClass
{
   void methodC()
  {
     System.out.println("method of Class C");
  }
}
class SubClass3 extends SuperClass
{
   void methodD()
  {
     System.out.println("method of Class D");
  }
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		SubClass1 obj=new SubClass1();
		SubClass2 obj1=new SubClass2();
		SubClass3 obj2=new SubClass3();
		
		obj.methodA();
		obj1.methodA();
		obj2.methodA();
		
	}

}
