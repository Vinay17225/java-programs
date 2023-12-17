package QspiderProgrammingDemo;

public class PrimeNo1to20 {

	public static void main(String[] args) {
		int num = 20, count;

		  for (int i = 10; i <= num; i++) {
		   count = 0;
		   for (int j = 2; j <= i / 2; j++) {
		    if (i % j == 0) {
		     count++;
		     break;
		    }
		   }

		   if (count == 0) {
		    System.out.print(i+" ");
		   	}

		  }
	   }
	}
