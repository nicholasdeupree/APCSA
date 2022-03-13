
public class MenuTester {
	public static void main(String[] args) {
		Menu men = new Menu("Mtn Dew", 2.69);
		men.total();
		System.out.println(men.getTotal());
		men.total(.50);
		System.out.println(men.getTotal());
		men.tip(2.20);
		System.out.println(men.getTotal());
	}
}
