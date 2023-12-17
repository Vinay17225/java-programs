package Demo;
import java.util.ArrayList;
public class CollectionArraylist {

	public static void main(String[] args) {
		ArrayList<String> Name=new ArrayList<String>();
		Name.add("Ramesh");
		Name.add("Rajeev");
		Name.add("Vinay");
		System.out.println(Name);
		Name.remove(0);
		System.out.println(Name);
		Name.set(1, "Sonaj");
		System.out.println(Name);
		

	}

}
