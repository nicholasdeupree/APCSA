import java.util.ArrayList;

public class TestTest {
	public static void main(String[]args) {
		ArrayList<Integer> digitList;
		int num = 1233;
		String temp = ""+num;
		digitList = new ArrayList<Integer>(temp.length());
		for(int k = 0; k<temp.length();++k){
			digitList.add(Integer.parseInt(temp.substring(k,k+1)));
		}
		for(int k = 0; k<digitList.size(); k++) {
			System.out.println(digitList.get(k));
		}
		if(digitList.size() == 1){
			System.out.println("false");
		}
		else{
			for(int k =1; k<digitList.size();k++){
				if(digitList.get(k-1) >= digitList.get(k))
					System.out.println("false");
				else System.out.println("true");
			}
		}
	}
}
