package N1Ex2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import N1Ex1.Month;

public class N1Ex2 {

	public static void main (String[]args) {
		
		List<Integer> list1 = new ArrayList <Integer>();
		
		list1.add(2);
		list1.add(9);
		list1.add(22);
		list1.add(43);
		list1.add(15);
		
		
		List<Integer> list2 = new ArrayList <Integer>();
		
		for (int cont = list1.size()-1; cont >= 0; cont--) {
			list2.add(list1.get(cont));
		}
		
		
		ListIterator<Integer> listIt = list1.listIterator();
		while(listIt.hasNext()) {
			System.out.println(listIt.next());
		}
		while(listIt.hasNext()) {
			list2.add(listIt.next());
		}
		
	}
}
