public class Triangle extends Shape {
	private int size;

	public Triangle() {
		super("Triangle");
	}

	public Triangle(int size) {
		super("Triangle");
		setSize(size);
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
