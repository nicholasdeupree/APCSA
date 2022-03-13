package Menu;
import javax.swing.JOptionPane;

import hangman.HangMan;
import tictactoe.TicTacToe;

public class FinalProject {
	public static void main(String[] args)
	{
		while(true) {
			String x = JOptionPane.showInputDialog("Would you like to play Hangman or Tic-Tac-Toe?");
			if(x.equalsIgnoreCase("hangman") || x.equalsIgnoreCase("hang man") || x.equalsIgnoreCase("h")) {
				HangMan.main(null); break;
			}
			else if(x.equalsIgnoreCase("tic tac toe") || x.equalsIgnoreCase("tic-tac-toe") || x.equalsIgnoreCase("tictactoe")) {
				TicTacToe.main(null);break;
			}
		}
	}
}
