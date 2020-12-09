package view;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.swing.JOptionPane;

import model.Enemy1;
import model.Enemy2;
import model.Enemy3;
import model.MainCharacter;
import model.Music;
import model.Platform;
import model.PlatformBlue;
import model.PlatformRed;
import model.PlatformRose;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	//scenarios here
	PImage scenario1;
	int scen1X = 0;
	
	//Create arrays for platform
	ArrayList<Platform> platformsRed;
	ArrayList<Platform> platformsRose;
	ArrayList<Platform> platformsBlue;
	
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
		platformsRed = new ArrayList<Platform>(); 
		platformsRed.add(new PlatformRed(269,617, 0, this));
		platformsRed.add(new PlatformRed(611,617, 0, this));
		platformsRed.add(new PlatformRed(937,617, 0, this));
		platformsRed.add(new PlatformRed(1038,572, 1, this));
		platformsRed.add(new PlatformRed(1124,536, 1, this));
		platformsRed.add(new PlatformRed(1215,496, 0, this));
		platformsRed.add(new PlatformRed(1554,617, 0, this));
		platformsRed.add(new PlatformRed(1694,575, 2, this));
		platformsRed.add(new PlatformRed(1948,586, 0, this));
		platformsRed.add(new PlatformRed(2130,494, 0, this));
		platformsRed.add(new PlatformRed(2272,617, 0, this));
		
		//Class object position
		anzu = new MainCharacter(77, 598, this);
		chopper = new Enemy1(500, 617, 1, this);
		demon = new Enemy2(466, 585, 3, this);
		eye = new Enemy3(500, 435, 1, this);
		music = new Music();
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
		image(scenario1, scen1X, 0);
		
		//Platforms scenario 1
		for (int i = 0; i < platformsRed.size(); i++) {
			platformsRed.get(i).draw();
		}
		anzu.draw();
		chopper.draw();
		chopper.run();
		demon.draw();
		demon.run();
		eye.draw();
		eye.move();
	}
	
	public void MoveScenario(int offset){
		scen1X -= offset;
		for (int i = 0; i < platformsRed.size(); i++) {
			platformsRed.get(i).setPosX(platformsRed.get(i).getPosX()- offset);
		}
	}
	
	public void keyPressed() {
		anzu.move(keyCode, platformsRed);
	
		if(keyCode == 39) {
			MoveScenario(100);
		}
	}
	
	public void validatePlatformColision () {
		for (int i = 0; i < platformNames.length; i++) {
			
		}
	}
	
}
