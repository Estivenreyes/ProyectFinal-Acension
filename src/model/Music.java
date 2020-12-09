package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;


public class Music{

	private Player player;
	
	public Music() {
		
		 try {
			  FileInputStream fileInputStream = new FileInputStream("./data/Owenwasher.mp3");
			  player = new Player(fileInputStream);
		  } catch(FileNotFoundException e) {
			  e.printStackTrace();
		  } catch (JavaLayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
 
	public void play() {
		 try {
			player.play();
			System.out.println("Song playing");
		} catch (JavaLayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}