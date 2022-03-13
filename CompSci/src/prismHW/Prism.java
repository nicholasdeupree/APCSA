package prismHW;


public class Prism {
	private double length;
	private double width;
	private double height;
	
	public Prism(double l, double w, double h)
	{
		length = l;
		width = w;
		height = h;
	}
	public double Volume()
	{
		return length*width*height;
	}
	public double surfaceArea()
	{
		return 2*((width*length) + (height*length) + (height*width));
	}
}
