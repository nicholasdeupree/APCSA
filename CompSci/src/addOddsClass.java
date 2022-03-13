import java.util.Scanner;

public class addOddsClass {
	public static int addOdds(int n ) {
		int sum = 0;
		for (int k=1; k <= n; k+=2) {
			sum += k;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter an integer: ");
		Scanner kb = new Scanner(System.in);
		int x = kb.nextInt();
		System.out.println(addOdds(x));
	}
}
