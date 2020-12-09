package view;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.swing.JOptionPane;

import model.Enemy1;
import model.Enemy2;
import model.Enemy3;
import model.MainCharacter;
import model.Music;
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
	
	// Screens win and lost
	PImage win;
	PImage lost;
	
	//call class here
	MainCharacter anzu;
	Music music;
	Enemy1 chopper;
	Enemy2 demon;
	Enemy3 eye;
	
	int screen;
	
	public void settings () {
		size(1280,720);
		
	}
	
	public void setup () {
		
		//Scenarios
		scenario1 = loadImage("./data/scenario1.png");
		
		//load image platform
		//scenario 1
		platRed1 = loadImage("./data/platRed1.png");
		platRed2 = loadImage("./data/platRed2.png");
		platRed3 = loadImage("./data/platRed3.png");
		//scenario 2
		platRose1 = loadImage("./data/platRose1.png");
		platRose2 = loadImage("./data/platRose2.png");
		platRose3 = loadImage("./data/platRose3.png");
		
		//Class object position
		anzu = new MainCharacter(77, 598, this);
		chopper = new Enemy1(500, 617, 1, this);
		demon = new Enemy2(466, 585, 3, this);
		eye = new Enemy3(500, 435, 1, this);
	}
	
	public void draw () {
		background(46,46,46);
		/*switch(screen) {
	
		// Screen where you write your name
		case 0:
		
		break;
		
		//Instruction screen
		case 1:
		
		break;
		
		//Game Screen first level
		case 2:
			
		break;
		
		//Game Screen second level
		case 3:
		
		break;
		
		//Game Screen third level
		case 4:
		
		break;
		
		//Lost screen
		case 5:
		
		break;
		
		// Win screen
		case 6:
		
		break;
		
		// Data screen
		case 7:
		 
		break;
		
		}*/
		//scenarios
		image(scenario1, 0, 0);
		//Platforms scenario 1
		image(platRed1, 269, 617);
		image(platRed1, 611, 617);
		image(platRed1, 937, 617);
		image(platRed2, 1038, 572);
		image(platRed2, 1124, 536);
		image(platRed1, 1215, 496);
		image(platRed1, 1554, 617);
		image(platRed3, 1694, 575);
		image(platRed1, 1948, 586);
		image(platRed1, 2130, 494);
		image(platRed1, 2272, 617);
		anzu.draw();
		chopper.draw();
		chopper.run();
		demon.draw();
		demon.run();
		eye.draw();
		eye.move();
	}
	
	public void keyPressed() {
		anzu.move(keyCode);
	}
	
}
