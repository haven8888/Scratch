package src.lordofzhiak.model;

public class Character {
		
		private int hp;
		private String name;
		
		public character()
		{
			name = '';
			hp = 0;
	    }
		
		public Character(charName, charHp)
		{
			name = charName;
			hp = charHp;
		}
		
		public String getCharName(){
			return name;
		}
		
		public int getCharHp(){
			return hp;
		}
		
		public void setCharName(String name)
		{
			//add command
		}
}
