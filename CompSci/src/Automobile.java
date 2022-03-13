
public class Automobile {
	private double gallons;
	private double milesPerGallon;
	public Automobile(double mpg)
	{
		gallons = 0;
		milesPerGallon = mpg;
	}
	public void fillUp(double addGallons)
	{
		gallons+=addGallons;
	}
	public void takeTrip(double milesDriven)
	{
		double gallonsUsed = milesDriven/milesPerGallon;
		if (gallons > gallonsUsed)
		{
			gallons-=gallonsUsed;
		}
		else {
			System.out.println("You cannot take the trip \nyou don't have enough gallons of fuel in your tank.");
		}
	}
	public double reportFuel()
	{
		return gallons;
	}
}
