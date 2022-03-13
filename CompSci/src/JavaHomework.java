import java.util.Scanner;


public class JavaHomework {
	public static void main (String[] args)
	{
		//Homework 2-2
		//11.
		Scanner kb = new Scanner(System.in);
		System.out.print("What's your favorite movie? ");
		String movie = kb.nextLine();
		System.out.println("I like " + movie + " as well!");
		System.out.println(" ");
		
		//13a.
		System.out.print("Enter an integer: ");
		int n = kb.nextInt();
		System.out.println("2 * " + n + " = " + (n+n));
		//13b. Removing the () in (n+n) it combines the 2 numbers instead of multiplying
		
		
		//Homework 2-3
		
		//9.
		System.out.println("    xxxxx    ");
		System.out.println("   x     x   ");
		System.out.println(" ((  o o  )) ");
		System.out.println("   |  V  |   ");
		System.out.println("   | === |   ");
		System.out.println("    -----    ");
		 
	}
}
