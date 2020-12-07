package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class RegisterScreen {
	private ArrayList<Player> player;
	private int currentPlayer;
	private static RegisterScreen onlyIntence;
	
	public static RegisterScreen getInstance() {
		if(onlyIntence == null) {
			onlyIntence = new RegisterScreen();
		}
		return onlyIntence;
		
	}
	
	public void sort() {}
	
	public void initialPlayer(PApplet app) {
		Player p= new Player("Mejia007",null, null, null, app);
		player.add(p);
	}
	
	public void addPlayer(String name, String time, String score, String date, PApplet app) {
		Player p = new Player(name, time, score, date, app);
		player.add(p);
		
		for (int i = 0; i < player.size(); i++) {
			System.out.println(player.get(i).getName());
			System.out.println(player.get(i).getTime());
			System.out.println(player.get(i).getScore());
			System.out.println(player.get(i).getDate());
			System.out.println("works");
		}
	}
	
	public int[] searchPlayer(String name) {
		boolean found = false;
		int[] info = new int [1];
		info[0] =0;
		info[1] = 1;
		for (int i = 0; i < player.size() && found == false; i++) {
			String compareName = player.get(i).getName();
			if(name.equals(compareName)) {
				found = true;
				info[0] =1;
				info[1] =i;
			}
		}
		return info;
	}
	

	public ArrayList<Player> getPlayer() {
		return player;
	}

	public void setPlayer(ArrayList<Player> player) {
		this.player = player;
	}

	public int getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(int currentPlayer) {
		this.currentPlayer = currentPlayer;
	}
}
