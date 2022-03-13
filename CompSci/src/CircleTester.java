
public class CircleTester {
	public static void main (String[] args){
		Circle circ1 = new Circle();
		Circle circ2 = new Circle(2.5);
		System.out.println(circ1.calcArea() + " = area and the radius is " + circ1.getRadius());
		System.out.println(circ2.calcArea() + " = area and the radius is " + circ2.getRadius());
	}
}
