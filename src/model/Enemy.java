package model;

import processing.core.PApplet;

public class Enemy {

	float posX;
	float posY;
	int speed;
	protected PApplet app;
	
	public Enemy (float posX, float posY, int speed, PApplet app) {
		
		this.posX = posX;
		this.posY = posY;
		this.speed = speed;
		this.app = app;
		
	}
}
	