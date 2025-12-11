public class Animal{
	//instantce variables
	private String type;
	private int size;

	public Animal(){
		this("Unknown", 1);
	}

	public Animal(int size){
		this("Unknown", size);
	}
	public Animal(String type){
		this(type, 1);
	}
	public Animal(String type, int size){
		this.type = type;
		this.size = size;
	}
	public void makeNoise(){
		System.out.println("Generic noise");
	}
	public void roam(){
		System.out.println("Roam");
	}
}
