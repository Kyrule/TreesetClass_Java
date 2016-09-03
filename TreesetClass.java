import java.util.TreeSet;

public class TreesetClass {
	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>();
		names.add("Raymond");
		names.add("Mike");
		names.add("Bryan");
		names.add("Jennifer");
		names.add("Clayton");
		names.add("Terrill");
		System.out.println("Number of names = "+names.size());
		for(String s:names){
			System.out.println(s);
		}
		System.out.println("Name before Jennifer: "+names.lower("Jennifer"));
		System.out.println("Name after Jennifer: "+names.higher("Jennifer"));
		System.out.println("First element: "+names.first());
		System.out.println("Last element: "+names.last());
	}
}
