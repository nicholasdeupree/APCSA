import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to Five Guys!\nWould you like to view the menu?(y/n)");
		char choice = kb.next().charAt(0);
		List<String> order = new ArrayList<>();
		boolean b = true;
		double total = 0;
		if(choice == 'y') {
			System.out.println("Today we have\nBurger $6.19\nFries $3.79\nSoda $2.29");
			while (b == true) {
				System.out.println("Type your order below or type done to continue: ");
				String orderC = kb.nextLine();
				if(orderC.equalsIgnoreCase("burger"));
				{
					order.add("Burger");
					total+=6.19;
				}
				if(orderC.equalsIgnoreCase("fries")) 
				{
					order.add("Fries");
					total+=3.79;
				}
				if(orderC.equalsIgnoreCase("Milkshake"))
				{
					order.add("Milkshake");
					total+=2.29;
				}
				if(orderC.equalsIgnoreCase("done"))
				{
					b=false;
				}
				int s = order.size();
				for (int k = s; k>=0; k--) {
					System.out.println("Your Order: ");
					System.out.println(order.get(s));
				}
			}
			
		}
		if(choice == 'n') {
			System.out.println("Goodbye!");
			System.exit(0);
		}
	}
}
