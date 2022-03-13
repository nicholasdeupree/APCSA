
public class Circle {
	private double radius;
	private String color;
	public Circle(double r) {
		radius = r;
		color = "red";
	}
	public Circle() {
		color = "red";
		radius = 1.0;
	}
	public double getRadius() {
		return radius;
	}
	public double calcArea() {
		return Math.PI * Math.sqrt(radius);
	}
}
