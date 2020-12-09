package model;

import processing.core.PApplet;

public class PlatformRose extends Platform{

	public PlatformRose(int posX, int posY, int type, PApplet app) {
		super(posX, posY, type, app);
		
		switch (this.type) {
		case 0:
			this.platformImg = app.loadImage("./data/platRose1.png");
		break;
		
		case 1: 
			this.platformImg = app.loadImage("./data/platRose2.png");
		break;
		
		case 3:
			this.platformImg = app.loadImage("./data/platRose3.png");
		break;
		}
	}



}
