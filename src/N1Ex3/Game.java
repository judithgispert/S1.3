package N1Ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
	
	private String userName;
	private HashMap <String, String> hashMapCountries;
	private int points;
	
	
	public Game (String userName, HashMap<String, String>hashMapCountries) {
		this.userName = userName;
		this.hashMapCountries = hashMapCountries;
		points = 0;
	}
	
	
	public String getUserName() {
		return userName;
	}
	
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	
	public void gamePlay() {
		String guessCountry;
		Random randomCountry = new Random();
		Scanner input = new Scanner (System.in);
		
		List<String> listCountries = new ArrayList<>(hashMapCountries.keySet());
		
		
		for (int cont = 0; cont < 10; cont ++) {
			guessCountry = listCountries.get(randomCountry.nextInt(listCountries.size()));
			String capital = hashMapCountries.get(guessCountry);
			
			System.out.println("Country: " + guessCountry + (" Capital: "));
			String answerCountry = input.nextLine();
			
			if (capital.equalsIgnoreCase(answerCountry)) {
				System.out.println("CORRECT!");
				points++;
			}else {
				System.out.println("INCORRECT");
			}
		}
	}

}
