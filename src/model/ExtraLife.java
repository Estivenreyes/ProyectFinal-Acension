package model;

import processing.core.PApplet;
import processing.core.PImage;

public class ExtraLife {
	
	PImage lifeExtra;
	private int posX;
	private int posY;
	private PApplet app;

	public ExtraLife(int posX, int posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.app = app;
		this.lifeExtra = app.loadImage("./data/lifeExtra.png");
	}
	
	public void draw() {
		app.image(lifeExtra, posX, posY);
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
