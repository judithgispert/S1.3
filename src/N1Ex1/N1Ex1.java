package N1Ex1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class N1Ex1 {
	
	public static void main (String[]args) {
		
		//Creating ArrayList
		ArrayList <Month> monthList = new ArrayList <Month>();
		
		//Creating objects and adding to ArrayList
		Month month1 = new Month ("January");
		monthList.add(month1);
		Month month2 = new Month ("February");
		monthList.add(month2);
		Month month3 = new Month ("March");
		monthList.add(month3);
		Month month4 = new Month ("April");
		monthList.add(month4);
		Month month5 = new Month ("May");
		monthList.add(month5);
		Month month6 = new Month ("June");
		monthList.add(month6);
		Month month7 = new Month ("July");
		monthList.add(month7);
		Month month9 = new Month ("September");
		monthList.add(month9);
		Month month10 = new Month ("October");
		monthList.add(month10);
		Month month11 = new Month ("November");
		monthList.add(month11);
		Month month12 = new Month ("December");
		monthList.add(month12);
		
		//Creating August and adding to correct place
		Month month8 = new Month ("August");
		monthList.add(7, month8);
		
		//Adding ArrayList to HASHSET using addAll()
		HashSet<Month> hashSet = new HashSet<Month>();
		hashSet.addAll(monthList);
		
		//Adding a repeat object in HASHSET
		System.out.println("Size of hashSet= " + hashSet.size()); 
		System.out.println("Add a repeat element:");
		hashSet.add(month8); //Adding repeat object
		System.out.println("Size after adding a repeat element= " + hashSet.size());
		
		
		
		//For (ARRAYLIST)
		for (int cont = 0; cont < monthList.size(); cont++) {
			System.out.println(monthList.get(cont).getName());
		}
		//ForEach (ARRAYLIST)
		for (Month cadenaArrayList:monthList) {
			System.out.println(cadenaArrayList.getName());
		}
		//ForEach (HASHSET)
		for (Month cadenaHashSet:hashSet) {
			System.out.println(cadenaHashSet.getName());
		}
		
		//Iterator (ARRAYLIST)
		Iterator<Month> it = monthList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getName());
		}
		//Iterator (HASHSET)
		Iterator<Month> it2 = hashSet.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next().getName());
		}
		
	}

}
