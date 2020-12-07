package model;
import processing.core.PApplet;
import processing.core.PImage;

public class MainCharacter {
	
	PImage Anzu;
	float posX;
	float posY;
	int speed;
	boolean destroy;
	boolean burn;
	
	protected PApplet app;
	
	public MainCharacter (float posX, float posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.speed = speed;
		this.destroy = destroy;
		this.burn = burn;
		this.app = app;
		this.Anzu = app.loadImage("./data/Anzu.png");
	}
	
	public void draw() {
		app.image(Anzu,posX,posY);
	}
	
	public void move(int keyCode) {
		switch(keyCode) {
		
		case 39:
			if(this.posX+100 < app.width-this.Anzu.width) {
				posX += 100;
			}
			
		break;
		case 37:
			if(this.posX-100 > 0) {
				posX -= 100;
				
			}
			
		}
			
	}

	public boolean isDestroy() {
		return destroy;
	}

	public void setDestroy(boolean destroy) {
		this.destroy = destroy;
	}

	public boolean isBurn() {
		return burn;
	}

	public void setBurn(boolean burn) {
		this.burn = burn;
	}

}
