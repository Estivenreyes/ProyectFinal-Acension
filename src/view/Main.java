package view;

import model.MainCharacter;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	MainCharacter anzu;
	
	public void settings () {
		size(1280,720);
	}
	
	public void setup () {
		anzu = new MainCharacter(77, 598, this);
	}
	
	public void draw () {
		background(0);
		anzu.draw();
	}
	
	public void keyPressed() {
		anzu.move(keyCode);
	}

}
