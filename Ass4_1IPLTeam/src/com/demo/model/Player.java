package com.demo.model;

public class Player {

	private int playerId;
	private String playerName;
	private String speciality;
	
	public Player(int playerId, String playerName,String speciality) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.speciality = speciality;
		
	}
	
	
	public int getPlayerId() {
		return playerId;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public String getSpeciality() {
		return speciality;
	}
		
	
	

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Player Id : " + playerId + "Player Name : "+playerName+"Speciality : " + speciality);
	}
		

	

}
