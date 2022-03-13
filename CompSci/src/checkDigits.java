
public class checkDigits {
	public static boolean checkStringDigits(String s) {
		for (int k = 0; k <= s.length(); k++) {
			if (!Character.isDigit(s.charAt(k))) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(checkStringDigits("123"));
		System.out.println(checkStringDigits("ff3"));
	}
}
