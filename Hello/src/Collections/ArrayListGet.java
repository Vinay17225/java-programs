package Collections;

import java.util.ArrayList;

public class ArrayListGet {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20.5);
		a.add("Java");
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.get(0));
		System.out.println(a.get(2));
		System.out.println("------------------------------");
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}

	}

}
