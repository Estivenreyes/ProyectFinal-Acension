package model;

import processing.core.PApplet;

public class PlatformBlue extends Platform{

	public PlatformBlue(int posX, int posY, int type, PApplet app) {
		super(posX, posY, type, app);
		
		switch (this.type) {
		case 0:
			this.platformImg = app.loadImage("./data/platformBlue1.png");
		break;
		
		case 1: 
			this.platformImg = app.loadImage("./data/platformBlue2.png");
		break;
		
		}
	}



}
