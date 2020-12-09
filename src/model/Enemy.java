package model;

import processing.core.PApplet;

public class Enemy implements Runnable{

	protected int posX;
	protected int posY;
	protected int speed;
	protected PApplet app;
	
	public Enemy (int posX, int posY, int speed, PApplet app) {
		
		this.posX = posX;
		this.posY = posY;
		this.speed = speed;
		this.app = app;
		
	}
	
	public void move() {
		if(app.frameCount%speed == 0) {
			int dir = (int) app.random(4);
			switch (dir) {
			case 0:
				posX +=100;
			break;
			
			case 1:
				posX-=100;
				
			break;
				
			}
		}
	}


	public float getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public float getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void run() {
		move();
	}
	
	
}
	