package RelationShip;

public class Water {
	double litre;
	Fish f;
	Water(double litre,Fish f){
		this.litre=litre;
		this.f=f;
		}
	public static void main(String[] args) {
		Water w=new Water(7.0,new Fish ("Rahue fish"));
		System.out.println("Use water:"+ w.litre);
		System.out.println("fish depends upon water: "+w.f.species );
	}
	

}
