package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(20);
		a.add(30.5);
		a.add("Ram");
		Iterator i=a.iterator();
		System.out.println(a);
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		System.out.println(i.next());
		
	}

}
