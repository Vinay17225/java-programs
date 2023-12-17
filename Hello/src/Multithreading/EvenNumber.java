package Multithreading;

public class EvenNumber extends Thread{
	
	
	public void run() {
		
		 for(int i=1;i<=10; i++) {
			 if(i%2==0)
				System.out.println(i);
			 try {
				Thread.sleep(i);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			}
	}

	}

