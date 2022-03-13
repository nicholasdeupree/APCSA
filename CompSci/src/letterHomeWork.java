import java.util.Scanner;

public class letterHomeWork {
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		System.out.println("Please enter the current month: ");
		String month = kboard.nextLine();
		System.out.println("What day of the month is it today? ");
		String day = kboard.nextLine();
		System.out.println("Dear Mr. Cannone,");
		System.out.println("");
		System.out.println("Today is " + month + " " + day + ". Thanks for making me do this.");
		System.out.println("");
		System.out.println("Sincerely,");
		System.out.println("Nick Deupree");
		kboard.close();
	}
}
