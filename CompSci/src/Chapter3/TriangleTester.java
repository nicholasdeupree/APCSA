package Chapter3;

import java.util.Scanner;

public class TriangleTester {
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		System.out.println("Enter the base of your triangle: ");
		int bb = kboard.nextInt();
		System.out.println("Enter the height of your triangle: ");
		int hh = kboard.nextInt();
		
		Triangle tri = new Triangle(bb, hh);
		
		double areaFinal = tri.area();
		
		System.out.println("The area of your triangle is " +areaFinal);
		
		kboard.close();
		
	}
}
