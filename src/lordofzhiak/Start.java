package lordofzhiak;

import java.util.Scanner;

import lordofzhiak.model.player.Player;
import lordofzhiak.model.map.Position;
import lordofzhiak.controller.Event;

public class Start{

	public static void main(String args[]){

	Scanner s = new Scanner(System.in);
	txt("Enter your name");
	String name = s.nextLine();
	int level = 1;
	int exp = 0;
	Position position = new Position(0,0);
	Player player = new Player(name, level, exp, position);
	txt("Hello "+player.getName()+". Type N/S/W/E to move around. Type Q to quit the game");
	Event.at(player.getPosition());

	while(true){
	String input = s.nextLine();
	if("Q".equals(input)) break;

	switch(input){
		
		case "N" : player.getPosition().goNorth(); break;
		case "n" : player.getPosition().goNorth(); break;
		
		case "S" : player.getPosition().goSouth(); break;
		case "s" : player.getPosition().goSouth(); break;
		
		case "W" : player.getPosition().goWest(); break;
		case "w" : player.getPosition().goWest(); break;
		
		case "E" : player.getPosition().goEast(); break;
		case "e" : player.getPosition().goEast(); break;
		
		
		//level's up the player and prints out a text
		case "lvlUp" : player.lvlUp(); break;
		
		//testing setLevel
		case "setLvl" : player.setLevel(++level); break;
		
		
		case "lvl" : txt("LEVEL: " + player.getLevel()); break;
		
		case "?" : txt("N/E/W/S for moving.\nstatus for stats "); break;
		
	}

	
	
	Event.at(player.getPosition());
	}

	
	txt("End of the game");
	s.close();
	}

	public static void txt(String string){
	System.out.println(string);
	}

}


