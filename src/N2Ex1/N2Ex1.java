package N2Ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;



public class N2Ex1 {
	public static void main (String[]args) {
		
		HashSet<Restaurant> hashSetRest = new HashSet<Restaurant>();
		
		hashSetRest.add(new Restaurant("La selva", 9));
		hashSetRest.add(new Restaurant("Jok", 9));
		hashSetRest.add(new Restaurant("Els pinxus", 8));
		hashSetRest.add(new Restaurant("Els pinxus", 8));
		hashSetRest.add(new Restaurant("Jok", 10));
		
		hashSetRest.forEach(System.out::print);
		
		
		
	}

}
