package QspiderProgrammingDemo;

public class ArraySorted {

	public static void main(String[] args) {
		int a[]= {8,6,5,1,3};
		int temp=0;
		System.out.print("Orignal Array is:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("Sorted  Array is:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}

}
