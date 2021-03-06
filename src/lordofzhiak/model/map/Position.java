/* File: Position.java
 *	This object creates a grid for 
 *	the player to walk on
 *  TODO:
 * 		-add detail to sourounding
 *		-create walls(blocking the way of player)
 *
 */

package lordofzhiak.model.map;

public class Position{

	private int x;
	private int y;

	public Position(){
	x=0;
	y=0;
	}

	public Position(int x, int y){
	this.x=x;
	this.y=y;
	}

	public int getX(){
	return x;
	}

	public int getY(){
	return y;
	}

	public void setX(int x){
	this.x=x;
	}

	public void setY(int y){
	this.y=y;
	}

	//used in event class
	public String toString(){
	return "[" + x + "," + y +"]";
	}

	
	//commands to move in map
	public void goNorth(){
        y+=1;
        }

        public void goSouth(){
        y-=1;
        }

        public void goWest(){
        x-=1;
        }

        public void goEast(){
        x+=1;
        }


}
