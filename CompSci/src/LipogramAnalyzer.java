
public class LipogramAnalyzer {
	private String txt;
	public LipogramAnalyzer(String text)
	{
		txt = text;
	}
	public String mark(char letter) {
		String l = letter+"";
		return txt.replace(l, "#");
	}
	private String extractWord(int pos)
	{
		String s="";
		while(true)
		{
			int k=pos;
			char c = txt.charAt(k);
			if(c== ' ')
				break;
			else
				s+=c;
			k++;
		}
		return s;
	}
	public String allWordsWith(char letter)
	{
		
	}
}
