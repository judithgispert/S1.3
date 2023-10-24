package N1Ex3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;

public class N1Ex3 {

	public static void main(String[]args) {
		
		
		readCountries();
		
		int continueApp;
		do {
			System.out.println("0. Close APP.");
			System.out.println("1. New game.");
			int menu = getInt("Select the number:");
			
			switch(menu) {
			
			case 0:
				break;
				
			case 1:
				newGame();
				break;
			}
			
			continueApp = getInt("Do you want to close the APP? 1.YES // 2.NO");
		}while(continueApp == 2);
		
		
		
		
	}	
	
public static String getString (String missatge) {
	Scanner input = new Scanner (System.in);
	System.out.println(missatge);
	return input.nextLine();
}

public static int getInt (String missatge) {
	Scanner input = new Scanner (System.in);
	System.out.println(missatge);
	return input.nextInt();
}
public static HashMap<String, String> readCountries (){
	HashMap <String, String> getCountries = new HashMap<>(); 
	File archivo = null;
	FileReader fr = null;
	BufferedReader br = null;
	
	try {
		archivo = new File ("src/N1Ex3/countries.txt");
		fr = new FileReader(archivo);
		br = new BufferedReader(fr);
		
		String linea;
		while((linea = br.readLine())!=null) {
			String[]countryTxt = linea.split(" ");
			getCountries.put(countryTxt[0], countryTxt[1]);
		}
		
	}catch (Exception ex) {
		ex.printStackTrace();
	}finally {
		try {
			if(null!=fr) {
				fr.close();
			}
		}catch (Exception ex2) {
			ex2.printStackTrace();
		}
	}
	
	return getCountries;
}

public static void newGame() {
	Game newGame = new Game (getString("Username: "), readCountries());
	newGame.gamePlay();
	try {
		File clasification = new File ("src/N1Ex3/clasification");
		if(clasification.createNewFile()){
			FileWriter write = new FileWriter(clasification, true);
			write.write("User: " + newGame.getUserName() + " - Points: " + newGame.getPoints());
			write.close();
		}
	}catch (Exception ex) {
		System.out.println("Error.");
	}
}
}
