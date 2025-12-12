public class Driver{
	static void battle(Character a, Character b){
		a.attack();
		b.defend();
	}
	public static void main(String[] args){
		Character [] characters = new Character[3];
		characters[0] = new Mage();
		characters[1] = new Knight();
		characters[2] = new Archer();
		int count = 0;
		do{
			int x = (int)(Math.random() * 3);
			int y = (int)(Math.random() * 3);
			battle(characters[x], characters[y]);
			count++;
		}while(count != characters.length);
	}
}
