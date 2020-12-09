package model;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Enemy1 extends Enemy{
	
	private PImage chopper;
	
	ArrayList<Enemy1> enemy1 = new ArrayList<Enemy1>();
	
	
	public Enemy1(int posX, int posY, int speed, PApplet app) {
		super(posX, posY, speed, app);
		this.speed = 50;
		this.chopper = app.loadImage("./data/chopper.png");
	}	
	
	public void draw() {
		app.image(chopper, posX, posY);
	}
	
	public void valideColision(ArrayList<Enemy1> arrayi, ArrayList<IBurnThem>arrayb) {
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
