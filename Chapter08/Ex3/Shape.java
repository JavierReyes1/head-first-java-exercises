public class Shape {
	private static int shapeCounter = 0;
	private double area;
	private double perimeter; 
	private int sides;
	private String type;

	public Shape(String type, int sides) {
		setType(type);
		setSides(sides);
		shapeCounter++;
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
	public void setPerimeter(){
		this.perimeter = perimeter;
	}
	public String getType() {
		return type;
	}
	public int getSides(){return sides;}
	public double getArea(){return area;}
	public double getPerimeter(){return perimeter;}
	public int getShapeCounter(){return shapeCounter;}

	public String toString() {
		return "Type: " + type
			+"\nArea: " + area
			+"\nSides: + " + sides;
	}
}
