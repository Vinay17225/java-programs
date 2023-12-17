package Collections;

import java.util.ArrayList;

public class ArrayListMethod1 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(200);
		a.add(300);
		ArrayList a1=new ArrayList();
		a1.addAll(a);
		System.out.println(a1);
		
		a1.add(1,30);
		System.out.println(a1);
		a1.addAll(2,a);
		System.out.println(a1);
		
		ArrayList b1=new ArrayList();
		b1.add(99);
		b1.add(99);
		b1.add(100);
		b1.add(100.1);
		
		ArrayList b2=new ArrayList();
		b1.add(99);
		b1.add(99);
		b1.add(100);
		b1.add(100.1);
		
		System.out.println(b1.contains(10000));
		System.out.println(b1.contains(99));
		System.out.println(b1.containsAll(b2));
		
		

	}

}
