import java.util.Scanner;

public class quesitonTwo {
	public static boolean returnTOrF(String s)
	{
		if (s.lastIndexOf("*") > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a string that ends in * for true.");
		String s = kb.nextLine();
		System.out.println(returnTOrF(s));
	}
}
