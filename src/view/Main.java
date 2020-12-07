package view;

import model.MainCharacter;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	PImage scenario1;
	MainCharacter anzu;
	
	public void settings () {
		size(1280,720);
		
	}
	
	public void setup () {
		scenario1 = loadImage("./data/scenario1.png");
		anzu = new MainCharacter(77, 598, this);
	}
	
	public void draw () {
		background(0);
		image(scenario1, 0, 0);
		anzu.draw();
	}
	
	public void keyPressed() {
		anzu.move(keyCode);
	}

}
