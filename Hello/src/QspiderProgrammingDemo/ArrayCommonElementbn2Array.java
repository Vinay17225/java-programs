package QspiderProgrammingDemo;

public class ArrayCommonElementbn2Array {

	public static void main(String[] args) {
	int	a[]= {2,4,5,7,9};
	int a1[]= {3,4,5,9,1,0};
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a1.length;j++) {
			if(a[i]==a1[j]) {
				System.out.print("Enter the matching Element:"+a[i]);
			}
		}
	}

	}

}
