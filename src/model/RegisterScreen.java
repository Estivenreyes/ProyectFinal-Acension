package model;

import java.util.ArrayList;

public class RegisterScreen {
	//private ArrayList<Player> player
	private int currentPlayer;
	private static RegisterScreen onlyIntence;
	
	public static RegisterScreen getInstance() {
		if(onlyIntence == null) {
			onlyIntence = new RegisterScreen();
		}
		return onlyIntence;
		
	}

}
