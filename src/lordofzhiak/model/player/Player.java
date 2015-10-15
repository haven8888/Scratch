/* File: Player.Java
 *	
 * 	creates the main player of the game
 *	and its methods
 */

package lordofzhiak.model.player;

import lordofzhiak.model.map.Position;

public class Player{
	
	private String name;
	//added level variables 
	private int level;
	private int exp;
	private Position position;
	
	public Player(){
	name = "";
	level = 0;
	exp = 0;
	position = new Position(0,0);
	}

	public Player(String name, int level, int exp, Position position){
	this.name=name;
	//added level to the character object
	this.level=level;
	this.exp=exp;
	this.position=position;
		
	}

	public String getName(){
	return name;
	}
	
	//get the level of the player back
	public int getLevel(){
	return level;
	}
	
	//level up commad
//*Not done*
	public void lvlUp(){
		level+=1;
		System.out.println("You've Leveled Up!");
	}
	
	//get how much experience the player has
	public int getExp(){
	return exp;
	}
	
	public Position getPosition(){
	return position;
	}

	public void setName(String name){
	this.name=name;
	}
	
	//basic way to edit level
	public int setLevel(int level){
	this.level=level;
	return level;
	}
	
	public int setExp(int exp){
	this.exp=exp;
	return exp;
	}

	public void setPosition(Position position){
	this.position=position;
	}

}
