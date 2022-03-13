
public class cutOutMethod {
	public static boolean isPalindrome(String word) {
		for (int k =0; k < word.length(); k++) {
			if(!(word.charAt(k) == word.charAt(word.length()-k-1))) {
				return false;
			}
		}
		return true;
	}
}
