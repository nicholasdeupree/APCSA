import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class BankAccountTesterArrayLists {
	public static void main(String[] args) {
		ArrayList<BankAccount> chaseBank = new ArrayList<BankAccount>();
		Scanner kb = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);
		while (true) {
			System.out.println("Enter Account Name: (\"Exit\" to abort) ");
			String name = kb.nextLine();
			if(name.equals("Exit")){
				break;
			}
			System.out.println("Enter Deposit Amount: ");
			double amount = kb.nextDouble();
			kb.nextLine();
			chaseBank.add(new BankAccount(name,amount));
		}
		double biggest = chaseBank.get(0).balance;
		String n = chaseBank.get(0).name;
		for(int k = 1; k<chaseBank.size(); k++){
			if(biggest < chaseBank.get(k).balance) {
				biggest = chaseBank.get(k).balance;
				n = chaseBank.get(k).name;
			}
		}
		System.out.println("The account with the largest balance belongs to " + n);
		System.out.println("The amount is " + formatter.format(biggest));
	}
}
