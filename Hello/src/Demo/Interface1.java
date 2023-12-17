package Demo;


interface Vehicle1{
	void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

 class Bicycle1 implements Vehicle1{
	 int speed;
	 int Gear;
	 
	 @Override
	 public void changeGear(int newGear){
	        Gear = newGear;
	}
	 @Override
	 public void speedUp(int increment) {
		 speed=speed+increment;
	 }
	 @Override
	 public void applyBrakes(int decrement) {
		 speed=speed-decrement;
	 }
	 
	 public void printstates() {
		 System.out.println("speed"+speed+"gear"+Gear);
	 	}
 }
 
		class Bikea1 implements  Vehicle1{
			int speed;
			int gear;
			
		@Override
		public void changeGear(int newGear) {
			gear=newGear;
		}
		@Override
		public void speedUp(int increment) {
			speed=speed+increment;
		}
		@Override
		public void applyBrakes(int decrement) {
			speed=speed-decrement;
		}
		public void printstates() {
			System.out.println("speed"+speed+"gear"+gear);
		}
		}
		public class Interface1 {
		
			public static void main(String[] args) {
				
				Bicycle1 obj=new Bicycle1();
				obj.changeGear(2);
				obj.speedUp(3);
				obj.applyBrakes(4);
				
				Bikea1 obj1=new Bikea1 ();
				obj1.changeGear(2);
				obj1.speedUp(3);
				obj1.applyBrakes(4);
				System.out.println("Bike present state :");
				Bicycle1 bicycle1 = new Bicycle1();
				bicycle1.printstates();
			}
		
		}
