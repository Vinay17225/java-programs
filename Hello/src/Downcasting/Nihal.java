package Downcasting;


	public class Nihal extends Nikita {
		String scooty;
		String home;
		Nihal(String land,double money,String bike,String scooty,String home){
			super(land,money,bike);
			this.scooty=scooty;
			this.home=home;
		}
		public void printnihal() {
			System.out.println("3.CHILD CLASS NIHAL EXECUTED");
			System.out.println("HII I AM NIHAL :) :)");
			System.out.println("MY land at"+" "+ land);
			System.out.println("Money is"+" "+money);
			System.out.println("MY Bike is"+" "+bike);
			System.out.println("MY Scooty is"+" "+scooty);
			System.out.println("MY Home at"+" "+home);
		}
		public static void main(String[] args) {
			Nikita n2=new Nihal("Banglore",1690000.55,"SUZUKI HYWABUSA","APPRILLIA VESPA","ODISHA");
			Nihal n3=(Nihal)n2;
			n3.printnoah();
			n3.printnikita();
			n3.printnihal();
		}

	}


