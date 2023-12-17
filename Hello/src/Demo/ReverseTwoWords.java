package Demo;

public class ReverseTwoWords {

	public static void main(String[] args) {
		String str="Vinay Kumar";
		String a[]=str.split(" ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		

	}

}
