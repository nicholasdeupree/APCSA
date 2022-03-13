public class Menu{
	private String item;
	private double price;
	private double tot;
	public Menu(String i, double p)
	{
		item = i;
		price = p;
		tot=0;
	}
	public void total()
	{
		double inc=(price*.06);
		double total;
		total =price + inc;
		tot+=total;
	}
	public void total(double discount){
		double total;
		total = (price-discount);
		tot+=total;
	}
	public double getPrice()
	{
		return price;
	}
	public double getTotal()
	{
		return tot;
	}
	public String getItem()
	{
		return item;
	}
	public void tip(double tipAmount)
	{
		double total;
		total = tipAmount+tot;
		tot+=total;
	}
}


