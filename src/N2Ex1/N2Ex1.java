package N2Ex1;

import java.util.HashSet;

import N2Ex2.Restaurant;



public class N2Ex1 {
	public static void main (String[]args) {
		
		HashSet<Restaurant> hashSetRest = new HashSet<Restaurant>();
		
		hashSetRest.add(new Restaurant("La selva", 9));
		hashSetRest.add(new Restaurant("Jok", 9));
		hashSetRest.add(new Restaurant("Els pinxus", 8));
		hashSetRest.add(new Restaurant("Els pinxus", 8));
		hashSetRest.add(new Restaurant("Jok", 10));
		
		for (Restaurant rest : hashSetRest) {
			System.out.println(rest);
		}
		
		
	}

}
