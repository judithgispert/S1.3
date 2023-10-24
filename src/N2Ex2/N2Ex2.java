package N2Ex2;

import java.util.HashSet;
import java.util.TreeSet;

public class N2Ex2 {
	
	public static void main (String[]args) {
		
		HashSet<Restaurant> hashSetRest = new HashSet<Restaurant>();
		
		hashSetRest.add(new Restaurant("La selva", 9));
		hashSetRest.add(new Restaurant("Jok", 9));
		hashSetRest.add(new Restaurant("Els pinxus", 8));
		hashSetRest.add(new Restaurant("Els pinxus", 8));
		hashSetRest.add(new Restaurant("Jok", 10));
		
		TreeSet<Restaurant> treeSetRest = new TreeSet<Restaurant>(hashSetRest);
		
		
		for (Restaurant rest : treeSetRest) {
			System.out.println(rest);
		}
		
	}

}
