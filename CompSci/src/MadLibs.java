import java.util.Scanner;

public class MadLibs {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Make Madlibs");
		System.out.println("Enter adj: ");
		String adj1 = kb.nextLine();
		System.out.println("Enter adj: ");
		String adj2 = kb.nextLine();
		
		System.out.println("Enter a relation to you: ");
		String  rela= kb.nextLine();
		System.out.println("Enter an event: ");
		String event = kb.nextLine();
		System.out.println(MadLibsMain.makeMadLibs(adj1, adj2, rela, event));
	}
}
