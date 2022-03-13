import java.util.Scanner;

public class QuotientCalc {

	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	System.out.println("Enter a positive integer: ");
	int m = kb.nextInt();
	System.out.println("Enter another positive integer: ");
	int n = kb.nextInt();
	kb.close();
	int x =0;
	int r = m;
	while(r>=n) {
		r-=n;
		x++;
	}
	System.out.println("When " + m+ " is divided by " + n+" the quotient is " + x + " and the remainder is " + r);
}}
