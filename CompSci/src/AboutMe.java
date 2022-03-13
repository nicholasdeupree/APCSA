import java.util.Scanner;

public class AboutMe {
	private String name, birthday, born;
	public AboutMe(String n, String bd, String b) {
		name = n; birthday = bd; born = b;
	}
	public String toString()
	{
		return name + " was born on " + birthday + " in " + born;
	}
	public static void main (String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String name = kb.nextLine();
		System.out.println("Enter your birthday (mm/dd/yyyy): ");
		String bday = kb.nextLine();
		System.out.println("Enter your birth location (City, State): ");
		String bLocation = kb.nextLine();
		AboutMe p1 = new AboutMe(name, bday, bLocation);
		System.out.println(p1.toString());
	}
}
