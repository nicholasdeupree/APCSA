//Nick Deupree Lunch class
import java.util.Scanner;

public class Lunch {
	public static String minutesUntilLunch(int h, int m)
	{
		
		if ( (h*60)+m>780) {
			int x = ((13 - h)*60)-m;
			return "Lunch was " + (x*-1) + " minutes ago!";
		}
		else {
			int x = ((13 - h)*60)-m;
			return x+" minutes left until lunch!"; 
			
		}
	}
	public static String printMinutesUntilLunch(int x, int y, int g, String z)
	{
		return x+" minutes left until lunch!\nOr " + z; 
	}
	public static String printMinutesFromLunch(int x, String z)
	{
		return "Lunch was " + (x*-1) + " minutes ago!";
	}
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Current Time (hh:mm): ");
		String t = kb.nextLine();
		if (t.length() == 4) {
			String hoursS = t.substring(0, 1);
			int hours = Integer.parseInt(hoursS);
			String minS = t.substring(2,4);
			int min = Integer.parseInt(minS);
			minutesUntilLunch(hours,min);
			System.out.print(minutesUntilLunch(hours, min));
		}
		if (t.length() == 5) {
			String hoursS = t.substring(0,2);
			int hours = Integer.parseInt(hoursS);
			String minS = t.substring(3,5);
			int min = Integer.parseInt(minS);
			System.out.print(minutesUntilLunch(hours, min));
		}
	kb.close();
	}
}
