package Demo;

import java.util.Arrays;

public class ArrayShort {

	public static void main(String[] args) {

		int a[]= {8,1,0,4,2};
		System.out.print("This is oribinal array:");
		for(int i:a) {
			System.out.println(i+" ");
		}
		Arrays.sort(a);
		System.out.println("This is sorted array is:");
		for(int i:a) {
			System.out.println(i+" ");
		}
		
	}

} 
