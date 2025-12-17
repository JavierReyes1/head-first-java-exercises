public class Triangle extends Shape {
	private int size;
	private double vertices; 

	public Triangle() {
		this(3);
	}

	public Triangle(int size) {
		super("Triangle", 3);
		setSize(size);
		this.vertices = 3;
	}


	public void setSize(int size) {
		if (size > 0) {
			this.size = size;
		}
	}

	public int getSize() {
		return size;
	}

}// end class
