public class HiddenWord
{
	private String word;
	public HiddenWord(String word)
	{
		this.word = word;
	}
	public String getHint(String guess)
	{
		String hint = "";
		for(int k = 0; k<word.length(); k++)
		{
			if(word.charAt(k)==guess.charAt(k))
				hint+=Character.toString(word.charAt(k));
			else if(word.indexOf(guess.charAt(k))!=-1)
				hint+="+";
			else
				hint+="*";
		}
		return hint;
	}

	public static void main(String[] args)
	{
		HiddenWord puzzle = new HiddenWord("HARPS");
		System.out.println(puzzle.getHint("AAAAA"));
		System.out.println(puzzle.getHint("HELLO"));
		System.out.println(puzzle.getHint("HEART"));
		System.out.println(puzzle.getHint("HARMS"));
		System.out.println(puzzle.getHint("HARPS"));
	}
}