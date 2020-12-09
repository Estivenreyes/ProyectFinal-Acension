package model;

import processing.core.PApplet;

public class PlatformRed extends Platform{

	public PlatformRed(int posX, int posY, int type, PApplet app) {
		super(posX, posY, type, app);
		
		switch (this.type) {
		case 0:
			this.platformImg = app.loadImage("./data/platRed1.png");
		break;
		
		case 1: 
			this.platformImg = app.loadImage("./data/platRed2.png");
		break;
		
		case 2:
			this.platformImg = app.loadImage("./data/platRed3.png");
		break;
		}
	}



}
