package lordofzhiak.controller;

import lordofzhiak.model.map.Position;

public class Event{

	public static void at(Position position){
		System.out.println("Your current position: "+position.toString());
	}


}
