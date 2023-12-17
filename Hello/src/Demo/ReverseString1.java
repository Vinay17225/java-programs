package Demo;

public class ReverseString1 {

	public static void main(String[] args) {
		int l,i;
		String r1="codecode";
		String r2="";
		l=r1.length();
		
		for(i=l-1;i>=0; i--) {
			r2=r2+r1.charAt(i);
		}
		System.out.println("Enter the string value r2="+r2);
	}

}
