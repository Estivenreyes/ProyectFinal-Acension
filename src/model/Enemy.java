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

	public float getPosX() {
		return posX;
	}

	public void setPosX(float posX) {
		this.posX = posX;
	}

	public float getPosY() {
		return posY;
	}

	public void setPosY(float posY) {
		this.posY = posY;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
	