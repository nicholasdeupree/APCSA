package tictactoe;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	private static JFrame frame;
	private static JPanel panel;
	private static JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	public static int P1score = 0;
	public static int P2score = 0;
	public GUI()
	{
		frame = new JFrame();
		panel = new JPanel();
		frame.setSize(400,400);
		panel.setLayout(new GridLayout(3,3));
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Tic-Tac-Toe "+ TicTacToe.p1 + " Score: "+ P1score + " " +TicTacToe.p2 + " Score: " + P2score);
		frame.setResizable(false);
		b1 = new JButton();
		b1.addActionListener(this);
		panel.add(b1);
		b2 = new JButton();
		b2.addActionListener(this);
		panel.add(b2);
		b3 = new JButton();
		b3.addActionListener(this);
		panel.add(b3);
		b4 = new JButton();
		b4.addActionListener(this);
		panel.add(b4);
		b5 = new JButton();
		b5.addActionListener(this);
		panel.add(b5);
		b6 = new JButton();
		b6.addActionListener(this);
		panel.add(b6);
		b7 = new JButton();
		b7.addActionListener(this);
		panel.add(b7);
		b8 = new JButton();
		b8.addActionListener(this);
		panel.add(b8);
		b9 = new JButton();
		b9.addActionListener(this);
		panel.add(b9);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) { // if the value int is 1 or 2 it will set the text of the button to X or O and then call changeboard
		String s = "";
		if(TicTacToe.value == 1)
			s = "X";
		else if(TicTacToe.value == 2)
			s = "O";
		if(e.getSource() == b1) {
			b1.setText(s);
			TicTacToe.changeBoard(0,0);
		}
		if(e.getSource() == b2) {
			b2.setText(s);
			TicTacToe.changeBoard(0,1);
		}
		if(e.getSource() == b3) {
			b3.setText(s);
			TicTacToe.changeBoard(0, 2);
		}
		if(e.getSource() == b4) {
			b4.setText(s);
			TicTacToe.changeBoard(1, 0);
		}
		if(e.getSource() == b5) {
			b5.setText(s);
			TicTacToe.changeBoard(1,1);
		}
		if(e.getSource() == b6) {
			b6.setText(s);
			TicTacToe.changeBoard(1,2);
		}
		if(e.getSource() == b7) {
			b7.setText(s);
			TicTacToe.changeBoard(2,0);
		}
		if(e.getSource() == b8) {
			b8.setText(s);
			TicTacToe.changeBoard(2,1);
		}
		if(e.getSource() == b9) {
			b9.setText(s);
			TicTacToe.changeBoard(2,2);
		}
		TicTacToe.value++;
		TicTacToe.rounds++;
		if(TicTacToe.value == 3) TicTacToe.value = 1; // if value hits 3 it will go back to one
	}

	public static void playAgain() { //clears board and resets everything
		clearButtons();
		TicTacToe.clearBoard();
		frame.setTitle("Tic-Tac-Toe "+ TicTacToe.p1 + " Score: "+ P1score + " " +TicTacToe.p2 + " Score: " + P2score);
		frame.revalidate();
		frame.repaint();
	}

	private static void clearButtons() { //sets text to nothing
		b1.setText("");
		b2.setText("");
		b3.setText("");
		b4.setText("");
		b5.setText("");
		b6.setText("");
		b7.setText("");
		b8.setText("");
		b9.setText("");
		TicTacToe.clearBoard();
	}
	
	
	
	
	
	
}
