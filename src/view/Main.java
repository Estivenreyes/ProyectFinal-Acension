package view;

import model.MainCharacter;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	//scenarios here
	PImage scenario1;
	
	//image here platform
	//scenario 1
	PImage platRed1;
	PImage platRed2;
	PImage platRed3;
	//scenario 2
	PImage platRose1;
	PImage platRose2;
	PImage platRose3;
	PImage platformW2;
	PImage platform2W2;
	//call class here
	MainCharacter anzu;
	int screen;
	
	public void settings () {
		size(1280,720);
		
	}
	
	public void setup () {
		scenario1 = loadImage("./data/scenario1.png");
		platRose1 = loadImage("./data/platRose1.png");
		anzu = new MainCharacter(77, 598, this);
	}
	
	public void draw () {
		background(46,46,46);
		image(scenario1, 0, 0);
		anzu.draw();
	}
	
	public void keyPressed() {
		anzu.move(keyCode);
	}

}
