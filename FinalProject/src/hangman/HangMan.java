package hangman;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class HangMan {
	private static int totGuess;
	private static String word="";
	public static ArrayList<String> wordSoFar;
	private static int wordLen = 0;
	private static int guesses =0;
	public static ArrayList<String> guessedWords;
	private static boolean guessedWholeWord =false;
	public static void main(String[] args)
	{
		int e=0;
		while(true) {
			String x = JOptionPane.showInputDialog("Choose a word category: (\"school\",\"computers\", or \"sports\" )");
			if(x.equalsIgnoreCase("school")) {
				e=1;
				break;
			}
			if(x.equalsIgnoreCase("computers")) {
				e=2;
				break;
			}
			if (x.equalsIgnoreCase("sports")) {
				e=3;
				break;
			}
		}
		guessedWords = new ArrayList<String>();
		word = Words.getWord(e);
		wordLen = word.length();
		wordSoFar = new ArrayList<String>(wordLen);
		for(int k = 0; k<HangMan.getLen(); k++)
		{
			if(HangMan.getWord().charAt(k) == ' ')
				wordSoFar.add("#");
			else
				wordSoFar.add("_");
		}
		System.out.print(word);									//PRINTS WORD
		new GUI();
		
	}
	public static String getWord()
	{
		return word;
	}
	public static int getLen()
	{
		return wordLen;
	}
	public static int getGuesses() {
		// TODO Auto-generated method stub
		return guesses;
	}
	public static int getTotGuess() {
		return totGuess;
	}

	public static void check(char c) {
		boolean b = false;
		for(int k = 0; k<wordLen;k++)
		{
			if(word.charAt(k) == c) {
				wordSoFar.set(k,Character.toString(c));
				String s = "";
				for(int i = 0; i<HangMan.getLen();i++)
				{
					if(wordSoFar.get(i) == "#")
						s+= "   ";
					else
						s+=HangMan.wordSoFar.get(i) + " ";
				}
				GUI.guessedWord.setText("Word: " + s);
				b = true;
			}
		}
		totGuess = getTotGuess() + 1;
		if( b == false) {
			guesses++;
			GUI.changeImage();
		}
		guessedWords.add(Character.toString(c));
		GUI.incorrectGuesses.setText("Incorrect Guesses: " + HangMan.getGuesses());
		GUI.totalGuesses.setText("Total Guesses: " + HangMan.getTotGuess());
		checkEnd();
		return;
	}
	private static void checkEnd()
	{
		int x = 2;
		if(guesses == 6)
			x = JOptionPane.showConfirmDialog(null, "The word was " + word + "\nPlay Again?", "You Lose",0 , JOptionPane.QUESTION_MESSAGE);
		else if (wordSoFar.contains("_") == false || guessedWholeWord == true)
			x = JOptionPane.showConfirmDialog(null, "You guessed the word!\n Want to play again?", "You Win",0 , JOptionPane.QUESTION_MESSAGE);

		if(x == 0)
			playAgain();
		else if(x == 1)
			System.exit(1);
	}
	private static void playAgain() {
		wordSoFar = null;
		guessedWords = new ArrayList<String>();
		totGuess = 0;
		guesses = 0;
		try {
			GUI.image = ImageIO.read(new File("src/hangman/images/stageOne.png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		GUI.lbl.setIcon(new ImageIcon(GUI.image));
		int e=0;
		while(true) {
			String x = JOptionPane.showInputDialog("Choose a word category: (\"school\",\"computers\", or \"sports\")");
			if(x.equalsIgnoreCase("school")) {
				e=1;
				break;
			}
			if(x.equalsIgnoreCase("computers")) {
				e=2;
				break;
			}
			if (x.equalsIgnoreCase("sports")) {
				e=3;
				break;
			}
		}
		word = Words.getWord(e);
		wordLen = word.length();
		wordSoFar = new ArrayList<String>(wordLen);
		for(int k = 0; k<HangMan.getLen(); k++)
		{
			if(HangMan.getWord().charAt(k) == ' ')
				wordSoFar.add("   ");
			else
				wordSoFar.add("_");
		}
		String s = "";
		for(int k = 0; k<getLen();k++)
		{
			s+=wordSoFar.get(k) + " ";
		}
		GUI.guessedWord.setText("Word: " + s);
		GUI.incorrectGuesses.setText("Incorrect Guesses: " + HangMan.getGuesses());
		GUI.totalGuesses.setText("Total Guesses: " + HangMan.getTotGuess());
		GUI.gWord.setText("");
		guessedWholeWord = false;
		System.out.print(word);															//PRINTS WORD
		GUI.resetColor();
		GUI.frame.revalidate();
		GUI.frame.repaint();
	}
	public static void checkPhrase(String s) {
		System.out.println("hh");
		if(s.equalsIgnoreCase(word)) {
			GUI.guessedWord.setText("Word: " + word);
			guessedWholeWord = true;
			checkEnd();
		}
		else 
			guesses++;
		System.out.println("h");
		totGuess++;
		GUI.incorrectGuesses.setText("Incorrect Guesses: " + HangMan.getGuesses());
		GUI.totalGuesses.setText("Total Guesses: " + HangMan.getTotGuess());
		
	}


	
	
	
	
}
