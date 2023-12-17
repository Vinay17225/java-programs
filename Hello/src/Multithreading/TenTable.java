package Multithreading;

public class TenTable extends Thread {
	
	 public void run () {
		for(int i=1;i<=10;i++) {
			System.out.println(10+ "*"+i+"="+(10*i));
		}
		try {
			Thread.sleep(50000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
