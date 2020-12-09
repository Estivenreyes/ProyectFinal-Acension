package model;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Enemy3 extends Enemy{
	
	private PImage eye;
	ArrayList<Enemy3> enemy3 = new ArrayList<Enemy3>();
	
	public Enemy3(int posX, int posY, int speed, PApplet app) {
		super(posX, posY, speed, app);
		this.eye = app.loadImage("./data/eye.png");
		this.speed = 50;
	}
	
	public void draw() {
		app.image(eye, posX, posY);
	}
	
	public void move() {
		if(app.frameCount%speed == 0) {
			int dir = (int) app.random(4);
			switch (dir) {
			case 0:
				posY +=100;
			break;
			
			case 1:
				posY-=100;
				
			break;
				
			}
		}
	}
	
	public void valideColision(ArrayList<Enemy3> arrayi, ArrayList<IBurnThem>arrayb) {
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
