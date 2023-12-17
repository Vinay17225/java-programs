package Demo;

interface Vehicle{
	void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
 class Bicycle implements Vehicle{
	 int speed;
	 int gear;
	 public void changeGear(int newGear){
         
	        gear = newGear;
	}

 
 public void speedUp(int increment) {
	 speed=speed+increment;
	 
 }
 public void applyBrakes(int decrement) {
	 speed=speed-decrement;
 }
 public void printstates() {
	 System.out.println("speed"+speed+"gear"+gear);
 }
 }
class Bike implements  Vehicle{
	int speed;
	int gear;
public void changegear(int newgear) {
	gear=newgear;
}
public void speedUp(int increment) {
	speed=speed+increment;
}
public void applyBrakes(int decrement) {
	speed=speed-decrement;
}
public void printstates() {
	System.out.println("speed"+speed+"gear"+gear);
}

public class ClassInterface {

	public static void main(String[] args) {
		Bicycle obj=new Bicycle();
		obj.changeGear(2);
		obj.speedUp(3);
		obj.applyBrakes(4);
		
		
		//Bike obj1=new Bike();
		
	}
		
	}

@Override
public void changeGear(int a) {
	// TODO Auto-generated method stub
	
}
}



