package view;

import java.awt.Button;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.swing.JOptionPane;

import model.Enemy1;
import model.Enemy2;
import model.Enemy3;
import model.Inputs;
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
	PImage scenario2;
	PImage scenario3;
	
	int scen1X = 0;
	int scen2X = 0;
	int scen3X = 0;
	
	//Create arrays for platform
	ArrayList<Platform> platformsRed;
	ArrayList<Platform> platformsRose;
	ArrayList<Platform> platformsBlue;
	
	// Screens register, win, lost and instruction
	PImage win;
	PImage lost;
	PImage register;
	PImage instruction;
	
	//call class here
	MainCharacter anzu;
	Music music;
	Enemy1 chopper;
	Enemy2 demon;
	Enemy3 eye;
	
	
	Inputs input;
	
	String name;
	
	int screen;
	
	public void settings () {
		size(1280,720);
		
	}
	
	public void setup () {
		//inputs
		input = new Inputs(width/2+250, (320), -500, 50, 100, this);
	
		name = "";
		//Scenarios
		scenario1 = loadImage("./data/scenario1.png");
		scenario2 = loadImage("./data/scenario2.png");
		scenario3 = loadImage("./data/scenario3.jpg");
		
		//load image platform
		//Red Platforms
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
		
		//Rose Platforms
		platformsRose = new ArrayList<Platform>(); 
		platformsRose.add(new PlatformRose(316,578,3,this));
		platformsRose.add(new PlatformRose(443,526,3,this));
		platformsRose.add(new PlatformRose(602,457,4,this));
		platformsRose.add(new PlatformRose(683,403,3,this));
		platformsRose.add(new PlatformRose(765,622,0,this));
		platformsRose.add(new PlatformRose(924,578,3,this));
		platformsRose.add(new PlatformRose(1048,526,3,this));
		platformsRose.add(new PlatformRose(1251,490,4,this));
		platformsRose.add(new PlatformRose(1486,629,4,this));
		platformsRose.add(new PlatformRose(1572,612,3,this));
		platformsRose.add(new PlatformRose(1744,600,4,this));
		platformsRose.add(new PlatformRose(1830,557,3,this));
		platformsRose.add(new PlatformRose(1935,609,4,this));
		platformsRose.add(new PlatformRose(2073,610,4,this));
		
		//Blue Platforms
		platformsBlue = new ArrayList<Platform>();
		platformsBlue.add(new PlatformBlue(488,582,0,this));
		platformsBlue.add(new PlatformBlue(752,531,1,this));
		platformsBlue.add(new PlatformBlue(1273,593,1,this));
		platformsBlue.add(new PlatformBlue(1463,546,0,this));
		
		//Class object position
		anzu = new MainCharacter(77, 598, this);
		chopper = new Enemy1(500, 617, 1, this);
		demon = new Enemy2(466, 585, 3, this);
		eye = new Enemy3(500, 435, 1, this);
		music = new Music();
		
		//load screen image
		win = loadImage("./data/win.png");
		lost = loadImage("./data/lost.png");
		instruction = loadImage("./data/instruction.png");
		register = loadImage("./data/register.png");
	}
	
	public void draw () {
		background(46,46,46);
		//screen = 3;
		switch(screen) {
	
		// Screen where you write your name
		case 0:
			background(46,46,46);
			image(register, 0, 0);
			input.draw();
			fill(0);
			textSize(14);
			text(name, 419,340);
		break;
	
		//Instruction screen
		case 1:
			image(instruction, 0, 0);
		break;
		
		//Game Screen first level
		case 2:
			background(46,46,46);
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
			
		break;
		
		//Game Screen second level
		case 3:
			background(46,46,46);
			image(scenario2, scen2X, 0);
			
			for (int i = 0; i < platformsRose.size(); i++) {
				platformsRose.get(i).draw();
			}
			
			anzu.draw();
			chopper.draw();
			chopper.run();
			demon.draw();
			demon.run();
			eye.draw();
			eye.move();
		break;
		
		//Game Screen third level
		case 4:
			background(46,46,46);
			image(scenario3, scen3X, 0);
			
			for (int i = 0; i < platformsBlue.size(); i++) {
				platformsBlue.get(i).draw();
			}
			
			anzu.draw();
			chopper.draw();
			chopper.run();
			demon.draw();
			demon.run();
			eye.draw();
			eye.move();
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
		
		}
		
	}
	
	public void MoveScenario(int offset){
	
		switch(screen) {
		case 2:
			scen1X -= offset;
			for (int i = 0; i < platformsRed.size(); i++) {
				platformsRed.get(i).setPosX(platformsRed.get(i).getPosX()- offset);
			}
		break;
		
		case 3:
			scen2X -= offset;
			for (int i = 0; i < platformsRose.size(); i++) {
				platformsRose.get(i).setPosX(platformsRose.get(i).getPosX()- offset);
			}
		break;
		
		case 4:
			scen3X -= offset; 
			for (int i = 0; i < platformsBlue.size(); i++) {
				platformsBlue.get(i).setPosX(platformsBlue.get(i).getPosX()- offset);
			}
		break;
		}
		
	}
	
	public void keyPressed() {
		
		input.writeText(key);
		
		anzu.move(keyCode, platformsRed);
		anzu.move(keyCode, platformsRose);
		anzu.move(keyCode, platformsBlue);
		
		if(keyCode == 39) {
			MoveScenario(100);
		}
	}
	
	/*public void validatePlatformColision () {
		for (int i = 0; i < platformsBlue.size(); i++) {
			
		}
	}*/
	
	public void mousePressed() {
		switch(screen) {
		
		// Screen where you write your name
		case 0:
			input.setFocus();
			/*if() {
				System.out.println(input.getText());
			}*/
			
			if (mouseX > 572 && mouseX < 699 && mouseY > 407 && mouseY < 452) {
				screen = 1;
			}
		break;
	
		//Instruction screen
		case 1:
			if (mouseX > 573 && mouseX < 700 && mouseY > 605 && mouseY < 652) {
				screen = 2;
				System.out.println(screen);
			}
	
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
		
		}
	}
	
}
