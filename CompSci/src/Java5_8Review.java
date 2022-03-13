import java.util.Scanner;

public class Java5_8Review {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a non-zero number: ");
		double n1 = kb.nextDouble();
		System.out.println("Enter a non-zero number: "); 
		double n2 = kb.nextDouble();
		System.out.println(Java5_8ReviewMain.sum(n1,n2));
		System.out.println(Java5_8ReviewMain.minus(n1,n2));
		System.out.println(Java5_8ReviewMain.product(n1,n2));
		System.out.println(Java5_8ReviewMain.divide(n1,n2));
	}
}
