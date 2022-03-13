import java.util.Scanner;

public class GarageFees {
	private static double p;
	public static String calculateCharges(double h) {
		if (h <= 3.0) {
			p = 2.00;
			return "Your current charges for " + ((int) h) + " is $" +p+".";
		}
		else if (24.0 > h && h > 3.0) {
			double x = (h-3.0);
			p = 2.00+(x*.50)+.5;
			return "Your current charges for " + ((int) h) + " is $" +p+".";
		}
		else if (0>h) {
			return "You were not charged.";
		}
		else {
			return "Enter a number less than 24";
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter number of hours: ");
		Scanner kb = new Scanner(System.in);
		double h = kb.nextDouble();
		System.out.println(calculateCharges(h));
	}
}
