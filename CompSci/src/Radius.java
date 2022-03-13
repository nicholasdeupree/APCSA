import java.util.Scanner;

public class Radius {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the area of your circle: ");
		double area = kb.nextDouble();
		System.out.println("The radius of your circle is " + Math.sqrt((area/Math.PI)));
	}
}
