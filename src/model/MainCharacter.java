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
	private int jump;
	private int speed;
	
	protected PApplet app;
	
	ArrayList<IBurnThem> fire = new ArrayList<IBurnThem>();
	
	public MainCharacter (float posX, float posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.app = app;
		this.jump = 500;
		this.speed = 25;
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
	
	public void move(int keyCode, ArrayList<Platform> p) {
		switch(keyCode) {
		
		case 39:
			if(this.posX+100 < (app.width/2)-this.Anzu.width && collition(p) != 1) {
				posX += speed;
			}
			
		break;
		case 37:
			if(this.posX-100 > 0) {
				posX -= speed;
				
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
		case 88:
			
			
		break;
		}

	}
	
	public int collition(ArrayList<Platform> platforms) {
		int dir = 0;
		for (int i = 0; i < platforms.size(); i++) {
			if(this.posX+32 > platforms.get(i).getPosX()) {
				dir = 1;
			}else {
				dir = 0;
			}
		}
		return dir;
		
		
		
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

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
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
