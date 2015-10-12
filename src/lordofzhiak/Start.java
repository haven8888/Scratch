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
	Position position = new Position(0,0);
	Player player = new Player(name, position);
	txt("Hello "+player.getName()+". Type N/S/W/E to move around. Type Q to quit the game");
	Event.at(player.getPosition());

	while(true){
	String input = s.nextLine();
	if("Q".equals(input)) break;

	switch(input){
		case "N" : player.getPosition().goNorth(); break;
		case "S" : player.getPosition().goSouth(); break;
		case "W" : player.getPosition().goWest(); break;
		case "E" : player.getPosition().goEast(); break;
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


