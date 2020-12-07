package model;

import processing.core.PApplet;
import processing.core.PImage;

public class IBurnThem {
	
	private PImage burn;
	private PImage fire;
	private PApplet app;
	private float posX;
	private float posY;

	public IBurnThem(float posX, float posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.app = app;
		this.fire = app.loadImage("./data/fire.png");
	}
	
	public void draw() {
		app.image(fire, posX, posY);
		this.posX+=3;
	}
	
	public boolean validatePos() {
		if(this.posX < +30) {
			return true;
		}else {
			return false;
		}
	}

	public PImage getFire() {
		return fire;
	}

	public void setFire(PImage fire) {
		this.fire = fire;
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
	
	

}
