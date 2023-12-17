package Demo;

public class ArrayMatrix2 {

	public static void main(String[] args) {
		int arr0[][]= {{4,5,7},{5,4,8},{8,7,5}};
		int arr1[][]= {{5,3,2,},{7,8,9},{4,5,6}};
		int arr2[][]=  new int[3][3];
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				arr2[i][j] =arr0[i][j]+arr1[i][j];
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		//System.out.println();

	}

}
