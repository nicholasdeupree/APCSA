import java.util.Scanner;

public class MexicoPop {
	private static final double STARTING_POPULATION = 123.8;
	private static final double GROWTH_RATE = 1.005;
	private static final int STARTING_YEAR = 2014;
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a double that represents a target population(in millions): ");
		double target = kb.nextDouble();
		int years = STARTING_YEAR;
		double population = STARTING_POPULATION;
		while(population <= target){
			years++;
			population*=GROWTH_RATE;
		}
		System.out.println("The population will be " + target + " in " + years);
	}
}
