public class Shape {
	private String type;

	public Shape(String type) {
		setType(type);
	}

	private void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public String toString() {
		return "Type: " + type;
	}
}
