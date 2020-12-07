package model;

import processing.core.PApplet;

public class Game {
	
	private String name;
	private String time;
	private String score;
	private String date;
	private PApplet app;
	
	public Game(String name, String time, String score, String date, PApplet app) {
		super();
		this.name = name;
		this.time = time;
		this.score = score;
		this.date = date;
		this.app = app;
	}
	

	public PApplet getApp() {
		return app;
	}


	public void setApp(PApplet app) {
		this.app = app;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
