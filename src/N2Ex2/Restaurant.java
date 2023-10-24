package N2Ex2;


public class Restaurant implements Comparable<Restaurant> {
	
	String name;
	int puntuation;
	
	public Restaurant (String name, int puntuation){
		this.name = name.toUpperCase();
		this.puntuation = puntuation;
	}
	
	public String getName () {
		return name;
	}
	
	public int getPuntuation() {
		return puntuation;
	}
	
	
	@Override
	public int hashCode() {
		return name.hashCode() * puntuation;
	}
	
	@Override
	public boolean equals(Object rest) {
		boolean equalsRest = false;
		if (rest instanceof Restaurant) {
			if(name.equals(((Restaurant) rest).getName())&& puntuation == ((Restaurant) rest).getPuntuation()){
				equalsRest = true;
			}
		}
		return equalsRest;
	}
	
	@Override
	public String toString() {
		return "Restaurant name: " + name + " // Restaurant puntuation: " + puntuation;
	}
	
	@Override
	public int compareTo (Restaurant rest) {
		int contRest = 0;
		
		if ((name.compareTo(rest.getName())) > 0) {
			contRest = -1;
		} else if((name.compareTo(rest.getName())) == 0) {
				if (puntuation < rest.getPuntuation()) {
					contRest = 1;
				}else if(puntuation > rest.getPuntuation()) {
					contRest = -1;
				}
		} else {
			contRest = 1;
		}
		return contRest;
	}

}
