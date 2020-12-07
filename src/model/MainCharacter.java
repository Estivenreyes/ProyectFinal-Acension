package model;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class MainCharacter {
	
	PImage Anzu;
	private float posX;
	private float posY;
	private boolean destroy;
	private boolean burn;
	private boolean shot = true;
	
	protected PApplet app;
	
	ArrayList<IBurnThem> fire = new ArrayList<IBurnThem>();
	
	public MainCharacter (float posX, float posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.app = app;
		this.Anzu = app.loadImage("./data/Anzu.png");
	}
	
	public void draw() {
		app.image(Anzu,posX,posY);
		
		for (int i = 0; i < fire.size(); i++) {
			fire.get(i).draw();
			if (fire.get(i).validatePos()) {
				fire.remove(i);
			}
		}
		
		if(app.frameCount%60==0) {
			shot = true;
		}
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
		//anzu can shot with bar space	
		case 32:
			if(shot) {
				IBurnThem burn = new IBurnThem(posX , posY , app);
				fire.add(burn);
				shot = false;
			}
		break;
		
		//Jump method here
		case 120:
		
		break;
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

	public ArrayList<IBurnThem> getFire() {
		return fire;
	}

	public void setFire(ArrayList<IBurnThem> fire) {
		this.fire = fire;
	}
	
	
}
