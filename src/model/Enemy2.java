package model;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Enemy2 extends Enemy{
	
	private PImage Demon;
	ArrayList<Enemy2> enemy2 = new ArrayList<Enemy2>();

	public Enemy2(int posX, int posY, int speed, PApplet app) {
		super(posX, posY, speed, app);
		this.Demon = app.loadImage("./data/Demon.png");
		this.speed = 15;
	}
	
	public void draw() {
		app.image(Demon, posX, posY);
	}
	
	public void valideColision(ArrayList<Enemy2> arrayi, ArrayList<IBurnThem>arrayb) {
		for (int i = 0; i < arrayb.size(); i++) {
			for (int j = 0; j < arrayi.size(); j++) {
				if (arrayb.get(i).getPosX()> arrayi.get(j).getPosX() && arrayb.get(i).getPosX() +10 < arrayi.get(j).getPosX()+84 &&
				arrayb.get(i).getPosY()> arrayi.get(j).getPosY() && arrayb.get(i).getPosY() +30 < arrayi.get(j).getPosY()+84 ) {
					arrayi.remove(j);
				}
				
			}
		}
	}

}
