public class Shape {
	private double area;
	private int sides;
	private String type;

	public Shape(String type, int sides) {
		setType(type);
		setSides(sides);
	}

	public void setType(String type) {
		this.type = type;
	}
	public void setSides(int sides){
		this.sides = sides;
	}
	public void setArea(double area){
		this.area = area;
	}
	public String getType() {
		return type;
	}
	public int getSides(){return sides;}
	public double getArea(){return area;}

	public String toString() {
		return "Type: " + type
			+"\nArea: " + area
			+"\nSides: + " + sides;
	}
}
