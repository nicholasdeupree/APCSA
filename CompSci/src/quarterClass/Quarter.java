package quarterClass;

public class Quarter {
	private int quarter;
	
	public Quarter(int q) {quarter = q;}
	
	public int quarterToDollar()
	{
		return (quarter*25)/100;
	}
	public double centToQuarter(double cent)
	{
		
		return ((quarter*25)*.01)/(cent*.01);
	}
	
}
