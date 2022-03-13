package Chapter3;
/** Triangle Class creates triangles and finds area.
 *  
 *  by N1ck Deupree 9/18/19
 */
public class Triangle {
	
	private int height;
	
	private int base;
	
	/**
	 *  Constructs a Triangle object
	 *  @param area of circle
	 */
	public Triangle(int b, int h) {
		height = h;
		base = b;
	}

	/**
	 * Constructs a circle object of radius 1.
	 */
	public Triangle() {
		height = 1;
		base =1;
	}
	
	/**
	 * Area Method - finds the area of a circle
	 * @return the area of the circle
	 */
	public double area() {
		double a = (base*height)*.5;
		return a;
		// return Math.PI*radius*radius;
	}
	
	
	
	
	
}