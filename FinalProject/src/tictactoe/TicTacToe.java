package tictactoe;
import javax.swing.JOptionPane;
public class TicTacToe
{
	public static String p1;
	public static String p2;
	public static int value = 1;
	public static int rounds = 0;
	private static int[][] board = new int[3][3];
	public static void main(String[] args)
	{		
		getP1Name();
		getP2Name();
		new GUI();
	}

	private static void getP1Name() { //Shows input pop up asking for a name. Will not take blanks
		p1 = JOptionPane.showInputDialog("Player 1, what is your name? ");
		while (p1.equals("")) {
		       JOptionPane.showMessageDialog(null, "Cannot accept blank entries!");
		       p1 = JOptionPane.showInputDialog("Player 1, what is your name? ");
		 }	
	}

	private static void getP2Name() { //Shows input pop up asking for a name. Will not take blanks
		p2 = JOptionPane.showInputDialog("Player 2, what is your name? ");
		 while (p2.equals("")){
		       JOptionPane.showMessageDialog(null, "Cannot accept blank entries!");
		       p2 = JOptionPane.showInputDialog("Player 2, what is your name? ");
		 }
	}
	
	public static void changeBoard(int r, int c)
	{
		board[r][c] = value; //sets the 2d array square that you chose to be 1 or 2. 1 is x and 2 is o
		checkBoard(r,c); //checks if theres a win
		if(rounds == 9) { //if there are no more spaces and no winner there's a tie
			value = 0;
			getWinningPlayer();
		}
		 
	}

	public static void getWinningPlayer() //shows pop ups declaring winner and asking if they want to play again
	{
		
		int x;
		if(value == 1) {
			x = JOptionPane.showConfirmDialog(null, "Player 1: " + p1 +" wins!\nWant to play again?", "Player 1 wins",0 , JOptionPane.QUESTION_MESSAGE);
			GUI.P1score++; 
		}
		else if(value == 2) {
			x = JOptionPane.showConfirmDialog(null, "Player 2: " + p2 +" wins!\nWant to play again?", "Player 2 wins",0 , JOptionPane.QUESTION_MESSAGE);
			GUI.P2score++;
		}
		else
			x = JOptionPane.showConfirmDialog(null, "It's a Tie! \nWant to play again?", "Tie Game",0 , JOptionPane.QUESTION_MESSAGE);

		if(x == 0) {
			GUI.playAgain();
			return;
		}
		else {
			JOptionPane.showMessageDialog(null, "Goodbye!");
			System.exit(1);
		}
	}
	private static void checkBoard(int r, int c) { //gets the position you just clicked and checks its surroundings for a win
		//JOptionPane.showMessageDialog(null,"You Win!");
		/**
		 *  x|x|x
		 *  x|x|x
		 *  x|x|x
		 */
		
		if(board[r][c] == board[0][0]) {
			if( (board[r][c] == board[0][1] && board[r][c] == board[0][2]) || (board[r][c] == board[1][1] && board[r][c] == board[2][2]) || (board[r][c] == board[1][0] && board[r][c] == board[2][0]))
				{getWinningPlayer(); return;}
		}
		if(board[r][c] == board[0][1]){
			if( (board[r][c] == board[0][0] && board[r][c] == board[0][2]) || (board[r][c] == board[1][1] && board[r][c] == board[2][1]))
				{getWinningPlayer(); return;}
		}	
		if(board[r][c] == board[0][2]){
			if( (board[r][c] == board[0][1] && board[r][c] == board[0][0]) || (board[r][c] == board[1][1] && board[r][c] == board[2][0]) || (board[r][c] == board[1][2] && board[r][c] == board[2][2]))
				{getWinningPlayer(); return;}
		}
		if(board[r][c] == board[1][0]){
			if( (board[r][c] == board[0][0] && board[r][c] == board[2][0]) || (board[r][c] == board[1][1] && board[r][c] == board[1][2]))
			{getWinningPlayer(); return;}
		}
		if(board[r][c] == board[1][1]){
			if( (board[r][c] == board[0][0] && board[r][c] == board[2][2]) || (board[r][c] == board[1][0] && board[r][c] == board[1][2]) || (board[r][c] == board[0][1] && board[r][c] == board[2][1]))
			{getWinningPlayer(); return;}
		}
		if(board[r][c] == board[1][2]){
			if( (board[r][c] == board[1][0] && board[r][c] == board[1][1]) || (board[r][c] == board[0][2] && board[r][c] == board[2][2]))
			{getWinningPlayer(); return;}
		}
		if(board[r][c] == board[2][0]){
			if( (board[r][c] == board[0][1] && board[r][c] == board[0][0]) || (board[r][c] == board[2][1] && board[r][c] == board[2][2]) || (board[r][c] == board[1][1] && board[r][c] == board[0][2]))
			{getWinningPlayer(); return;}
		}
		if(board[r][c] == board[2][1]){
			if( (board[r][c] == board[2][0] && board[r][c] == board[2][2]) || (board[r][c] == board[1][1] && board[r][c] == board[0][1]))
			{getWinningPlayer(); return;}
		}
		if(board[r][c] == board[2][2]){
			if( (board[r][c] == board[2][1] && board[r][c] == board[2][0]) || (board[r][c] == board[1][2] && board[r][c] == board[0][2]) || (board[r][c] == board[1][1] && board[r][c] == board[0][0]))
			{getWinningPlayer(); return;}
				
		}
		
	}

	public static void clearBoard() { //resets everything
		for(int r = 0; r<board.length;r++) {
			for(int c = 0; c<board[r].length; c++) {
				board[r][c]=0;
			}
		}
		value = 2;
		rounds = 0;
		return;
	}

	
	
	
	
	
	
	
	
}
