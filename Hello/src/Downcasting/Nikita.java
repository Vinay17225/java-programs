package Downcasting;


	public class Nikita extends Noah {
		String bike;
		Nikita(String land,double money,String bike){
			super(land,money);
			this.bike=bike;
		}
		public void printnikita() {
			System.out.println("2.CHILD CLASS NIKITA EXECUTED");
			System.out.println("HII I M NIKITA :) :)");
			System.out.println("MY land at"+" "+land);
			System.out.println("Money is"+" "+money);
			System.out.println("MY Bike is"+" "+bike);
			System.out.println();
		}
		public static void main(String[] args) {
			Noah n=new Nikita("Banglore",1690000.55,"SUZUKI HYWABUSA");
			Nikita n2=(Nikita)n;
			n2.printnoah();
			n2.printnikita();
		}
		

	}


