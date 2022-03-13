import java.util.ArrayList;
import java.util.List;

public class ScrambleWord {
	public static String scrambleYoWord(String word){
		int current = 0;
		String result="";
		while (current < word.length()-1){
		if (word.substring(current,current+1).equals("A") &&
		!word.substring(current+1,current+2).equals("A")){
		result += word.substring(current+1,current+2);
		result += "A";
		current += 2;
		}
		else {
		result += word.substring(current,current+1);
		current++;
		}
		}
		if (current < word.length()){
		result += word.substring(current);
		}
		return result;
		}

	public static void scrambleOrRemove(List<String>wordList){
		for(int k = 0; k<wordList.size();k++) {
			String word = wordList.get(k);
			String scrambledWord = scrambleYoWord(word);
			if(word.equals(scrambledWord)) {
				wordList.remove(k);
				k--;
			}
			else {
				wordList.set(k, scrambledWord);
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<String>(5);
		wordList.add("TAN");
		wordList.add("ABRACADABRA");
		wordList.add("WHOA");
		wordList.add("APPLE");
		wordList.add("EGGS");
		for(int k = 0; k<5;k++)
			System.out.print(wordList.get(k) + " ");
		scrambleOrRemove(wordList);
		System.out.println("");
		for(int k = 0; k<5;k++)
			System.out.print(wordList.get(k) + " ");
	}
}
