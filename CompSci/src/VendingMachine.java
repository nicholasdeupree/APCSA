import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter price of item(from 25 cents to a dollar in 5 cent increments): ");
		int x = kb.nextInt();
		int changeDue = 100 - x;
		int quarter, dime, nickel, penny;
		quarter = changeDue/25;
		changeDue -=quarter*25;
		dime = changeDue/10;
		changeDue -=dime*10;
		nickel = changeDue/5;
		changeDue-=nickel*5;
		penny = changeDue;
		System.out.println("You get back " + quarter +" quarters, " +dime+" dimes, " + nickel + " nickels, and " + penny +" pennies.");
	}
}
