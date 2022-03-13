public class Card{
	private String name;
	private String suit;
	private int value;
	private static String deckName;
	private static int numCards;
	public Card(String n, String s, int v){
		name = n;
		suit = s;
		value = v;
		numCards++;
	}
	public Card(String n, int v){
		name = n;
		value = v;
		suit = "Spades";
		numCards++;
	}
	
	public static void setDeckName(String n){
		deckName = n;
	}
	public String getName()
	{
		return name;
	}
	public String getSuit()
	{
		return suit;
	}
	public int getValue()
	{
		return value;
	}
	public void setValue(int v)
	{
		value = v;
	}
	public void setName(String n){
		name = n;
	}
	public static int getNumCards()
	{
		return numCards;
	}
	public static String getDeckName() {
		return deckName;
	}
	public static void main(String[] args)
	{
		Card card1 = new Card("King", "Spades", 13);
		Card.setDeckName("Maphew Cards");
		System.out.println(card1.getName());
		card1.setValue(10);
		card1.setName("Ten");
		System.out.println(getNumCards());
		System.out.println(Card.getNumCards());
		System.out.println(card1.getNumCards());
		System.out.println(Card.getDeckName());
		Card card2 = new Card("Two", 2);
		System.out.println(card2.getName());
		System.out.println(card2.getValue());
		System.out.println(card2.getSuit());
		System.out.println(getNumCards());
	}	
}