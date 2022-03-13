public class Book{
	// Constructor goes here
	//Returns price of book.
	public Book(String title, String author, double price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public double getPrice( ){
	return price;
	}
	public void giveDiscount(double byPercent){
	// Decreases book price
	// Code goes here
		price *= (price*(byPercent*.01));
	}
	private String title;
	private String author;
	private double price;
}
