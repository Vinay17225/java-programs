package Demo;
import java.util.Scanner;
public class MarksOfStudent {

	public static void main(String[] args) {
		double average;
		int total = 0,sum = 0;
		double percentage;
		System.out.println("Enter the number of exam paper");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Math marks1");
		int a=sc.nextInt();
		System.out.println("Enter the English marks2");
		int b=sc.nextInt();
		System.out.println("Enter the sience marks3");
		int c=sc.nextInt();
		System.out.println("Enter the Social science marks4");
		int d=sc.nextInt();
		System.out.println("Enter the Hindi marks5");
		int e=sc.nextInt();
		int sum1=(a+b+c+d+e);
		int total1= sum / 5;
		System.out.println("Enter the total number");
		System.out.println(sum1);
		
		
		System.out.println("average of the marks");

	}

}
