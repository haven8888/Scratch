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

	public String toString(){
	return "["+x+","+y+"]";
	}

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
