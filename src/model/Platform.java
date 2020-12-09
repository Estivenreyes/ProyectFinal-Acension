package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Platform {
	protected PImage platformImg;
	protected int posX;
	protected int posY;
	protected PApplet app;
	protected int type;
	
	public Platform(int posX, int posY, int type, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.type = type;
		this.app = app;
	
	}
	
	public void draw() {
		app.image(platformImg, posX, posY);
	}
	

	public PImage getPlatformImg() {
		return platformImg;
	}

	public void setPlatformImg(PImage platformImg) {
		this.platformImg = platformImg;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
}
