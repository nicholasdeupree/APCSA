import java.util.ArrayList;

public class RandomStringChooser {
	private ArrayList<String> list;
	private static ArrayList<Integer> used = new ArrayList<Integer>();
	public RandomStringChooser(String[] s) {
		list = new ArrayList<String>();
		for(int k = 0; k<s.length; k++) {
			list.add(s[k]);
		}
	}
	public String getNext() {
		String s;
		if(used.size() == list.size()) {
			return "NONE";
		}
		else {
			while(true) {
				int x = (int) (Math.random()*list.size());
				s = list.get(x);
				if(!(used.contains(x))) {
					used.add(x);
					break;
				}
			}
		}
		return s;
	}
}
