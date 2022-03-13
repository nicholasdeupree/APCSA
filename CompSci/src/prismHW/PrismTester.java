package prismHW;

import java.util.Scanner;

public class PrismTester {
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		System.out.println("Enter the length of the prism: ");
		double length = kboard.nextDouble();
		System.out.println("Enter the width of the prism: ");
		double width = kboard.nextDouble();
		System.out.println("Enter the height of the prism: ");
		double height = kboard.nextDouble();
		
		Prism prism1 = new Prism(length, width, height);
		double vol = prism1.Volume();
		double sa = prism1.surfaceArea();
		System.out.println("The volume of your prism is " + vol);
		System.out.println("The surface area of your prism is " + sa);
		kboard.close();
	}
}
