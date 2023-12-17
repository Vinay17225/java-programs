package Collections;

import java.util.ArrayList;
public class ArrayListMathad {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(10.5);
		a.add("Vinay");
		a.add('V');
		System.out.println(a);
		ArrayList a1=new ArrayList();
		a1.add(100);
		a1.add(100.5);
		a1.add("Rahul");
		a1.add('R');
		System.out.println(a1);
		ArrayList a2=new ArrayList(a1);
		System.out.println(a2);
		
		
		

	}

}
