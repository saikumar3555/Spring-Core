package com.nit.beans;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter

@ToString
public class Player {
	public Player(int playerId, String playerName, int playerAge) {
		
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerAge = playerAge;
	}
	public int playerId;
	public String playerName;
	public int playerAge;
	
	
	//one arg constructor
	public Player(int playerId) {
		this.playerId = playerId;
		
	}
	
	
	public Player(String playerAge) {
		this.playerName = playerAge;
		
	}
	
	
	
	
}
