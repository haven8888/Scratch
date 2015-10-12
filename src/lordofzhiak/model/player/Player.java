package lordofzhiak.model.player;

import lordofzhiak.model.map.Position;

public class Player{
	
	private String name;
	private Position position;
	
	public Player(){
	name = "";
	position = new Position(0,0);
	}

	public Player(String name, Position position){
	this.name=name;
	this.position=position;
	}

	public String getName(){
	return name;
	}

	public Position getPosition(){
	return position;
	}

	public void setName(String name){
	this.name=name;
	}

	public void setPosition(Position position){
	this.position=position;
	}


}
